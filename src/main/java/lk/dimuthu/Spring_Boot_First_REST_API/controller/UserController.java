package lk.dimuthu.Spring_Boot_First_REST_API.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/user")
@CrossOrigin
@RestController
public class UserController {

    @GetMapping("/get")
    public String testAPI(){
        return "API Success!";
    }
}
