package com.wallace.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallace.dslist.entities.dto.GameMinDTO;
import com.wallace.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/")
	public ResponseEntity<List<GameMinDTO>> findAll(){
		return ResponseEntity.ok().body(gameService.findAll());
	}
}
