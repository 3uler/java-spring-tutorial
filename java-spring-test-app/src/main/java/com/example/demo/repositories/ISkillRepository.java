package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Developer;

public interface ISkillRepository extends CrudRepository<Developer, Long>{

}
