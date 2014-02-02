package com.quest.model.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseDTO implements Serializable{

		
		 @Temporal(TemporalType.TIMESTAMP)
		    public Date createdDate;

		    @Temporal(TemporalType.TIMESTAMP)
		    public Date updatedDate;

			public Date getCreatedDate() {
				return createdDate;
			}

			public void setCreatedDate(Date createdDate) {
				this.createdDate = createdDate;
			}

			public Date getUpdatedDate() {
				return updatedDate;
			}

			public void setUpdatedDate(Date updatedDate) {
				this.updatedDate = updatedDate;
			}
		    
		    
}
