package com.masiv.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.masiv.model.Roulette;
import com.masiv.repository.RouletteRepository;
@RestController
@CrossOrigin
@RequestMapping("/roulette")
public class RouletteController {
	@Autowired
	private RouletteRepository rouletteRepository;
	@PostMapping
	public Roulette save(@RequestBody Roulette roulette) {
		rouletteRepository.save(roulette);
		
		return roulette;
	}
	@GetMapping
	public List list() {
		
		return rouletteRepository.findAll();
	}
	@GetMapping("/{id}")
	public Roulette updateRoulette(@PathVariable String id) {
		
		 return  rouletteRepository.findById(id);
	}
	@PutMapping
	public Roulette update(@RequestBody Roulette roulette) {
		rouletteRepository.close(roulette);
		
		return roulette;
	}
	
	
	
}
