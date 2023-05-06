package com.cap.filemanagement.controller;

import org.springframework.data.annotation.Version;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class UserController {
    @GetMapping("/api/v1/user/{userId}/info")
    public ResponseEntity<String> getDetailUserInfo(@PathVariable("userId") int userId) {
        try {

            return new ResponseEntity<>("test api", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
