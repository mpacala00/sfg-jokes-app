package com.mpacala.jokesapp.controllers;

import com.mpacala.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    //not necessary but shows intent
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    //mapping the context root
    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
