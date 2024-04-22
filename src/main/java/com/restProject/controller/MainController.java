package com.restProject.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restProject.objs.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    public ObjectMapper objectMapper;
    @GetMapping("api/Client")
    public String getClient() throws JsonProcessingException {
        Client client = new Client("Igor",22);
        String jsonData = objectMapper.writeValueAsString(client);
        return jsonData;
    }
}
