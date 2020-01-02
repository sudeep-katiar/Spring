package com.blblz.spring.DependencyInjectionO;

public class Student {
	
	private int id;
	private Cheat cheat;
	
	public void setid(int id)
	{
		this.id = id;
	}
	
	public void setCheat(Cheat cheat)
	{
		this.cheat = cheat;
	}
	
	public void cheating()
	{
		cheat.cheat();
		System.out.println("Id is : " + id);
	}

}
