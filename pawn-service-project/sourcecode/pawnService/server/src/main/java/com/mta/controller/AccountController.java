package com.mta.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mta.entity.TblUser;
import com.mta.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/acc", produces = { "application/json", "application/xml", "text/json", "text/plain", "text/xml" },
                                consumes = { "application/json", "application/xml", "text/json", "text/plain", "text/xml" })
public class AccountController {
    private final ObjectMapper mObjectMapper;
    private final IAccountService mIAccountService;

    private final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    public AccountController(ObjectMapper inObjectMapper, @Qualifier("accountService") IAccountService inIAccountService) {
        this.mObjectMapper = inObjectMapper;
        this.mIAccountService = inIAccountService;
    }

    @PostMapping(value = "/login")
    public ResponseEntity<Object> login(@RequestBody TblUser user) {
        String jsonString;
        HttpHeaders responseHeaders = new HttpHeaders();
        if (user != null && !user.getUsername().isBlank() && !user.getPassword().isBlank())
        {
            try {
                jsonString = mObjectMapper.writeValueAsString(user);

                String token = mIAccountService.isCheckLoginAndReturnToken(user);
                if (token == null) {
                    return new ResponseEntity<>("Username and password invalid", HttpStatus.BAD_REQUEST);
                } else if (token.isEmpty()) {
                    return new ResponseEntity<>("Create token failed", HttpStatus.INTERNAL_SERVER_ERROR);
                }

                responseHeaders.set("Authorization", token);
                logger.info("(Class: UserController - method: Login). Data Request {}./n Data Response {}  ", jsonString, token);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                logger.error("Error Format data (Class: UserController - method: Login)");
                return new ResponseEntity<>("Format data invalid", HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>("SUCCESS.", responseHeaders, HttpStatus.OK);
        }
        return new ResponseEntity<>("Data invalid.", HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/logout")
    public ResponseEntity<Object> logout() {
        boolean isLogout = this.mIAccountService.logoutUser();
        if (isLogout) {
            return new ResponseEntity<>("logout", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("logout", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
