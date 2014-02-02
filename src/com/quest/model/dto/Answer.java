package com.quest.model.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ANSWER")
public class Answer extends BaseDTO{

	private long id;
	private Question question;
	private String value;
	
	private int displayOrder;
	
	@Id
    @GeneratedValue
    @Column(name="ID")
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
	
	@ManyToOne
	@JoinColumn(name="question_id")
	public Question getQuestion() {
		return question;
	}    
    
	public void setQuestion(Question question) {
		this.question = question;
	}

	@Column(name="VALUE", nullable=false)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name="DISPLAY_ORDER", nullable=false)
	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public static String fromJsonArrayToAnswer(String json) {
		// TODO Auto-generated method stub
		return "{\"name\":\"Answer\",\"fir\":\"HOLA\"}";
	}
	
	
    
}
