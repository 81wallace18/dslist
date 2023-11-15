package com.wallace.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallace.dslist.entities.Game;
import com.wallace.dslist.entities.dto.GameMinDTO;
import com.wallace.dslist.repositorys.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll(){
		List<Game> list = repository.findAll(); 
		List<GameMinDTO> dto = list.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
 }
