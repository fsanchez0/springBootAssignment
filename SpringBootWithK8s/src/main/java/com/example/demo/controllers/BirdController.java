package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Bird;
import com.example.demo.services.BirdBehaviourService;

@RestController
@RequestMapping("/bird")
public class BirdController {

	@Autowired
	private BirdBehaviourService birdService;
	
	@PostMapping("/addBirdData")
	public Bird addBirdsData(@RequestBody Bird bird) {
		return birdService.addBirdDetails(bird);
	}
	
	@GetMapping("/getBirds")
    public List<Bird> getBirds(){
        return birdService.getBirds();
    }
	
	@GetMapping("/{record_number}")
    public Bird getOrderById(@PathVariable int record_number){
        return birdService.getBirdByRecordId(record_number);
    }
	@DeleteMapping("/deleteBirdData/{record_number}")
	public String deleteBirdDetails(@PathVariable("record_number") int record_number) {
		
		birdService.deleteBird(record_number);
		return "record deleted";
	}
//	@PutMapping("/updateBirdData/{record_number}")
//	public void updateBirdData(@RequestBody Bird bird, @PathVariable int record_number) {
//		birdService.update(bird, record_number);
//		
//	}
}
