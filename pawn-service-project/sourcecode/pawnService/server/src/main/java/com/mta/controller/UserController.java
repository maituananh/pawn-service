package com.mta.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = { "application/json", "application/xml", "text/json", "text/plain", "text/xml" },
                                consumes = { "application/json", "application/xml", "text/json", "text/plain", "text/xml" })
public class UserController {

    @GetMapping("/get-profile")
    public ResponseEntity<Object> getProfile() {
        return new ResponseEntity<>("get profile user", HttpStatus.OK);
    }
}
