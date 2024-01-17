package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name;
    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello, " + name;
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
}
