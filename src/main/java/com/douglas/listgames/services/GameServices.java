package com.douglas.listgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.listgames.dto.GameMinDto; // Corrigido para iniciar com maiúscula
import com.douglas.listgames.repositories.GameRepository;
import com.douglas.listgames.entities.Game; // Assumindo que esta é a entidade correta

@Service 
public class GameServices {
        
    @Autowired
    private GameRepository gameRepository;
        
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
  
    }   
}
