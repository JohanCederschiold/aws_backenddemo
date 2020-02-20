package se.jpdc.restdemos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se.jpdc.restdemos.model.Message;
import se.jpdc.restdemos.repos.MessageRepo;

@RestController
public class TheController {

    @Autowired
    MessageRepo repo;

    @PostMapping("/register")
    public Message registerMessage(@RequestBody  Message message) {
        Message answer = repo.save(message);
        return answer;
    }


}
