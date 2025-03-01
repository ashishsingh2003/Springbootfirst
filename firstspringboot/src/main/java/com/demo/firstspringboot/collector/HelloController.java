package com.demo.firstspringboot.collector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
@RestController
@RequestMapping("/hello")
class HelloControllerMark {

    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Mark") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}