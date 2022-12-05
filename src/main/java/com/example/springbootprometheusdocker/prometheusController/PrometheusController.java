package com.example.springbootprometheusdocker.prometheusController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrometheusController {

    @GetMapping(path = "/hello1")
    public String hello1() {
        return "Hello World - 1 ";
    }

    @GetMapping(path = "/hello2")
    public String hello2() {
        return "Hello World - 2";
    }

    @GetMapping(path = "/resp2")
    public ResponseEntity resp2() {
        return ResponseEntity.status(200).build();
    }

    @GetMapping(path = "/resp3")
    public ResponseEntity resp3() {
        return ResponseEntity.status(300).build();
    }
    @GetMapping(path = "/resp4")
    public ResponseEntity resp4() {
        return ResponseEntity.status(400).build();
    }
    @GetMapping(path = "/resp5")
    public ResponseEntity resp5() {
        return ResponseEntity.status(500).build();
    }
}
