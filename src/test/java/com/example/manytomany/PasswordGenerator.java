package com.example.manytomany;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordGenerator {
        @Autowired
        private PasswordEncoder passwordEncoder;
        @Test
        void getPassword(){
            String password = "aayush";
            System.out.println(passwordEncoder.encode(password));
        }
}
