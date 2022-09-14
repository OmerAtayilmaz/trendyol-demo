package com.trendyol.app.auth;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenManager {

    private static final String SECRET_KEY="TRENDYOL";
    private static final Integer VALIDITY=5*60*1000; // 5 MİN

    public String generateToken(String username){
        String jwt= Jwts
                .builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis()+VALIDITY))
                .setIssuer("omeratayilmaz") //who created this jwt
                .setIssuedAt(new Date(System.currentTimeMillis())) //when someone create this jwt
                .signWith(SignatureAlgorithm.ES256,SECRET_KEY)
                .compact();
        return jwt;
    }

    public boolean tokenValidate(String token){
        return getUsernameFromToken(token) != null && isTokenExired(token);
    }
    public String getUsernameFromToken(String token){
        Claims claims=getClaims(token);
        //claims ile çözülen token hakkında bilgi elde edilir.
        return claims.getSubject();//getting username
    }

    public boolean isTokenExired(String token){
        Claims claims=getClaims(token);
        return claims.getExpiration().before(new Date(System.currentTimeMillis()));
    }

    public Claims getClaims(String token){
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJwt(token).getBody();
    }
}
