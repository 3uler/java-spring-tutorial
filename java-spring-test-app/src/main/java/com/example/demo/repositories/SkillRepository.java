package com.example.demo.repositories;

import java.util.List;

import com.example.demo.Skill;

public interface SkillRepository {
	public List<Skill> findByLabel(String label);
}
