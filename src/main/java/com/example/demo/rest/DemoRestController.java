package com.example.demo.rest;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
//@RequestMapping("/demo")
public class DemoRestController {

    @GetMapping("/")
    public ResponseEntity<Object> demoProject() throws JSONException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("currentTime", LocalDateTime.now());
        jsonObject.put("status", "Everything looks good");

        return ResponseEntity.ok(jsonObject.toString());
    }
}
