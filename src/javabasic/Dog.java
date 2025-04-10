package javabasic;

public class Dog {
	//property|behavior
	String name="tomy";
	String color="black";
	int leg=4;
	int ear=2;
	int tail=1;
	String bread="bullDog";
	
	//behavior|method
	String getname() {
		return "tomy";
	}
	String getvoice() {
		return "bark";
	}
	void eat() {
		
	}
	void run() {
		
	}
	public static void main(String[]args) {
		//create object
		Dog dog = new Dog ();
		String name = dog.name;
		System.out.println(name);
		String color = dog.color;
		System.out.println(color);
		int leg = dog.leg;
		System.out.println(leg);
		int ear = dog.ear;
		System.out.println(ear);
		int tail = dog.tail;
		System.out.println(tail);
		dog.eat();
		dog.run();
		
		
	}

}
