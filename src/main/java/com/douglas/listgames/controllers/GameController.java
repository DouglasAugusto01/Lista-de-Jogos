package com.douglas.listgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.listgames.services.GameServices;
import com.douglas.listgames.dto.GameMinDto; // Corrigido para importar GameMinDto

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameServices gameServices;

    @GetMapping
    public List<GameMinDto> findAll() {
        List<GameMinDto> result = gameServices.findAll();
        return result;
    }
}
