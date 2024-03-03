package com.product.Backend_Solar.Controller;

import com.product.Backend_Solar.Entity.JwtRequest;
import com.product.Backend_Solar.Entity.JwtResponse;
import com.product.Backend_Solar.ServiceImplementation.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/authenticate")
    public JwtResponse createJwtToken(@RequestBody  JwtRequest jwtRequest)
            throws Exception {

        return jwtService.createJwtToken(jwtRequest);

    }







}
