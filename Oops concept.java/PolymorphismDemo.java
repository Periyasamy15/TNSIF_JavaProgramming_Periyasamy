package com.tnsif.oopsconcept;

class MathOp{
	
	//Method overloading or Complie time polymorphism
	
	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}

//Method Overriding or Run time polymorphism

class AnimalDemo{
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Cat extends AnimalDemo{
	void sound() {
		System.out.println("Cat makes a sound, Meowwww!!!");
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
	
		
		MathOp mo = new MathOp();
		System.out.println(mo.add(10, 20));
		System.out.println(mo.add(20.00, 40.00));
		
		Cat ca = new Cat() ;
		ca.sound();
		

	}

}
