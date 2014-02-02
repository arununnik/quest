package com.quest.model.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION")
public class Question extends BaseDTO {

	private long id;
	private String name;
	
	private String description;

	private Quest quest;
	
	private Set<Answer> answers;
	
	@Id
    @GeneratedValue
    @Column(name="ID")
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name="QUESTION_NAME", nullable=false)
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }    
    
    @OneToMany(mappedBy="question")
    public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
    
    @ManyToOne
    @JoinColumn(name="quest_id")
	 public Quest getQuest() {
		return quest;
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



}
