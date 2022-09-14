package com.trendyol.app.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

@Component
public class JwtTokenFilter extends OncePerRequestFilter {

    @Autowired
    private TokenManager tokenManager;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        /*
        * Bearer 123123213
        * */
        final String authHeader=request.getHeader("Authorization");

        String username=null;
        String token=null;

        if(authHeader!=null &&authHeader.contains("Bearer")){
               token=authHeader.substring(7);
            try {
                username = tokenManager.getUsernameFromToken(token);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        /*
        * if user already logged in:  SecurityContextHolder.getContext().getAuthentication() returns true
        * */
        if(username!=null&&token!=null&& SecurityContextHolder.getContext().getAuthentication()==null){
             if(tokenManager.tokenValidate(token)){
                 UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=new UsernamePasswordAuthenticationToken(username,null,new ArrayList<>());//last parameters is authorities
                 usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                 SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
             }
        }

        filterChain.doFilter(request,response);
    }
}
