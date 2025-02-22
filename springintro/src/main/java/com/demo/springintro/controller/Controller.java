package com.demo.springintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Use @Controller instead of @RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping("/UC1")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/UC2")
    public String sayHello(Model model) {
        // Add data to the model
        model.addAttribute("message", "Hello from BridgeLabz");
        // Return the view name (hello.html)
        return "hello";
    }

    @GetMapping("/UC3")
    @ResponseBody
    public String sayHelloByRestCall() {
        return "Hello from BridgeLabz";
    }

}