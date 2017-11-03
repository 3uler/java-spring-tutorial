package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long skillId;
    private String skillLabel;
    private String skillDescription;

    public Skill() {
		super();
    }

    public Skill(String label, String description) {
		super();
		this.skillLabel = label;
		this.skillDescription = description;
	}

	/**
	 * @return the skillId
	 */
	public long getSkillId() {
		return skillId;
	}

	/**
	 * @param skillId the skillId to set
	 */
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	/**
	 * @return the skillLabel
	 */
	public String getSkillLabel() {
		return skillLabel;
	}

	/**
	 * @param skillLabel the skillLabel to set
	 */
	public void setSkillLabel(String skillLabel) {
		this.skillLabel = skillLabel;
	}

	/**
	 * @return the skillDescription
	 */
	public String getSkillDescription() {
		return skillDescription;
	}

	/**
	 * @param skillDescription the skillDescription to set
	 */
	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}
    
    
}
