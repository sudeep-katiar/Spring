package com.blblz.spring.DependencyInjectionO;

public class Student {
	
	MathCheat mathcheat = new MathCheat()	;
	
	public void cheating()
	{
		mathcheat.mathCheat();
	}

}
