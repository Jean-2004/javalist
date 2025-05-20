package com.jeanf.javaspringlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeanf.javaspringlist.dto.GameListDTO;
import com.jeanf.javaspringlist.services.GameListService;

@RestController
@RequestMapping(value = "/games")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping(value= "/lists")
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}
