package com.mta.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String authorizationHeader = request.getHeader("Authorization");
////        !request.getRequestURI().equals("/login") ||
        if (request.getRequestURI().startsWith("/api")) {
            if (authorizationHeader == null || authorizationHeader.isBlank()) {
                // 401
                response.sendError(401, "Unauthorized. You need login");
            }
        }
//        System.out.println("pass");
        filterChain.doFilter(request, response);
    }
}
