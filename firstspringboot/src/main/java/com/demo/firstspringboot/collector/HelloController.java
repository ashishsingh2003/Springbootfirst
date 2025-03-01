package com.demo.firstspringboot.collector;

import com.demo.firstspringboot.UserDTO;
import org.springframework.web.bind.annotation.*;

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
@RestController
@RequestMapping("/hello")
class HelloControllerMarkParams {
    @GetMapping("/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
@RestController
@RequestMapping("/hello")
class HelloControllerPost {

    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
@RestController
@RequestMapping("/hello")
class HelloControllerUC5 {
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName,
                                  @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}