package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Fish;
import com.example.demo.services.FishBehaviourService;

@RestController
@RequestMapping("/fish")
public class FishController {

	@Autowired
	private FishBehaviourService fishService;
	
	@PostMapping("/addFishData")
	public Fish addFishData(@RequestBody Fish fish) {
		return fishService.addFishDetails(fish);
	}
	
	@GetMapping("/getFish")
    public List<Fish> getBirds(){
        return fishService.getFish();
    }
	
	@GetMapping("/{record_number}")
    public Fish getOrderById(@PathVariable int record_number){
        return fishService.getFishById(record_number);
    }
}
