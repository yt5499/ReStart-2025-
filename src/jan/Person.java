//Write a program to define a class `Person` with attributes `name` and `age`,
//and a method to display the details.
package jan;

import java.util.Scanner;

public class Person {
	String name="";
	int age;
	public void Display(String n, int a) {
		this.name=n;
		this.age=a;
		System.out.println("Name= "+this.name+" & Age= "+this.age);
	}
	
	public static void main(String args[]) {
		Person ps = new Person();
		ps.Display("Ajay Kumar", 49);
	}
}
