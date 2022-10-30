package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Bird;

public interface BirdRepository extends JpaRepository<Bird, Integer>{

}
