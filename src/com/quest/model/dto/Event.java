package com.quest.model.dto;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Event  extends BaseDTO{

    private String name;
    private String value;
    private Integer displayOrder;
    private Date startDate;
    private Date endDate;
    private MultipartFile image;
    private String Description;
         
}
