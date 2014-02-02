package com.quest.model.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="QUEST")
public class Quest extends BaseDTO{
	
	private long id;
	
	private Set<Question> questions;
	
	private String name;
    
	@Id
    @GeneratedValue
    @Column(name="ID")
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
	
    @OneToMany(mappedBy="quest")
	public Set<Question> getQuestions() {
		return questions;
	}
    
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	    
	@Column(name="QUEST_NAME", nullable=false)
	public String getName() {
		return name;
	}
//    
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "QUEST_QUESTION", joinColumns = { @JoinColumn(name = "QUEST_ID") }, inverseJoinColumns = { @JoinColumn(name = "QUESTION_ID") })
//	public List<Question> getQuestions() {
//		return questions;
//	}
//
//	public void setQuestions(List<Question> questions) {
//		this.questions = questions;
//	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
