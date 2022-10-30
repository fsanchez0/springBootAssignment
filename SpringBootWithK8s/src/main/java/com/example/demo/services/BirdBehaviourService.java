package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Bird;
import com.example.demo.repo.BirdRepository;

@Service
public class BirdBehaviourService {

	@Autowired
	private BirdRepository birdRepo;

	public Bird addBirdDetails(Bird bird) {
		return birdRepo.save(bird);
	}
	
	public List<Bird> getBirds(){
        return birdRepo.findAll();
    }

	public Bird getBirdByRecordId(int record_number){
        return birdRepo.findById(record_number)
                .orElseThrow(()->new IllegalArgumentException("Invalid id : "+record_number));
    }
	
	public void deleteBird(int record_number) {
		birdRepo.deleteById(record_number);
	}
	
//	public String update(Bird bird,int record_number) {
//		if(bird.getRecord_number()==record_number) {
//			bird.setName(bird.getName());
//			bird.setBehaviour(bird.getBehaviour());
//			return "record updated";
//			
//			
//		}else {
//			return "record not present";
//		}
//		
//	}
}
