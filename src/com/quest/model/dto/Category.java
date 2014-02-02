package com.quest.model.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category  extends BaseDTO{

	private long id;
	
    private String name;
    private String value;
    private Integer displayOrder;
    private Category subCategoryOf;
    
    @Id
    @GeneratedValue
    @Column(name="ID")
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Category getSubCategoryOf() {
		return subCategoryOf;
	}

	public void setSubCategoryOf(Category subCategoryOf) {
		this.subCategoryOf = subCategoryOf;
	}
    
    
        
}
