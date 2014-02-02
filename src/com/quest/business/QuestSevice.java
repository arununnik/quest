package com.quest.business;

public class QuestSevice {
	
	private static QuestSevice questSevice = new QuestSevice();
	
	private QuestSevice() {}

    public static QuestSevice createInstance() {
     return questSevice;
    }
    
    public void initialize(){
    	 System.out.println("In initialize");
    }
    
    public void teardown(){
    	 System.out.println("In teardown");
    }

}
