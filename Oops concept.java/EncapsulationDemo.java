package com.tnsif.oopsconcept;


public class EncapsulationDemo {

//IPL Team	
	
	//Mumbai Indians Team
	
	//instance variable
	String name;
	int age;
	int jersyNo;
	
	/*
	 * void show() { int count; } //local variable
	 */
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; //This is refers to the current object
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJersyNo() {
		return jersyNo;
	}

	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}

	
	//toString() Method
	@Override
	public String toString() { //Object
		return "EncapsulationDemo [name=" + name + ", age=" + age + ", jersyNo=" + jersyNo + "]";
	}
	

}
