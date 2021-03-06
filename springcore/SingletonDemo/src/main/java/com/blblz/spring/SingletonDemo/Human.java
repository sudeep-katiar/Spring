package com.blblz.spring.SingletonDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;
	
	public Human()
	{
	}
	
	
	public Human(Heart heart) {
		this.heart = heart;
	}

	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping()
	{
		if(heart != null)
			heart.pump();
		else
			System.out.println("dead");
	}
	
}
