package com.example.dictionary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class DictionaryController {
	
	@GetMapping(path = "/search/{name}")
    public String searchContact(@PathVariable("name") String name) {
        return name;
    }

}
