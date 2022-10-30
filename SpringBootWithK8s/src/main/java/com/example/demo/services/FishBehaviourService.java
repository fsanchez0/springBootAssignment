package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Fish;
import com.example.demo.repo.FishRepository;

@Service
public class FishBehaviourService {

	@Autowired
	private FishRepository fishRepo;
	
	public Fish addFishDetails(Fish fish) {
		return fishRepo.save(fish);
	}
	
	public List<Fish> getFish(){
        return fishRepo.findAll();
    }

    public Fish getFishById(int record_number){
        return fishRepo.findById(record_number)
                .orElseThrow(()->new IllegalArgumentException("Invalid id : "+record_number));
    }
}
