package com.search.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.entity.Flight;
import com.search.service.SearchService;
@RestController
@RequestMapping("search")
@CrossOrigin(origins="http://localhost:3000")
public class SearchController {
	@Autowired
	private SearchService service;
	private static final Logger log = LoggerFactory.getLogger(SearchController.class);
	
	@PostMapping("/")
	public Flight addFlight(@RequestBody Flight flight) {
		return this.service.save(flight);
	}

	@PutMapping("/{id}")
	public Flight updateFlight(@RequestBody Flight flight) {
		return this.service.save(flight);
	}

	@DeleteMapping("/{id}")
	public void deleteFlight(@PathVariable long id) {
		this.service.delete(id);
	}
	
	@GetMapping("/{id}")
	public Object getFlight(@PathVariable("id") long id ) {
	return this.service.getFlightById(id);
	}
	

	@GetMapping("/")
	public List<Flight> getFlight() {
		return this.service.findAll();
	}

}
