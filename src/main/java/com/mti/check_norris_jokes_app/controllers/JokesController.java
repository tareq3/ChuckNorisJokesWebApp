package com.mti.check_norris_jokes_app.controllers;

import com.mti.check_norris_jokes_app.services.JokesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JokesController
 */

 @Controller
public class JokesController {

    JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }


    @RequestMapping({ "/", "" })
    public String showJokes(Model model) {


        model.addAttribute("joke", jokesService.getJokes());

        return "jokes";
    }
    
}