package com.oops.examples;

import com.oops.examples.Encapsulation.BankAccount;
import com.oops.examples.inheritance.*;
import com.oops.examples.polymorphism.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamplesApplication.class, args);

		BankAccount account = new BankAccount();
		BankAccount account1 = account;

		if(account1 == account)
		{
			System.out.println("true");
		}
		account.setAccountNumber("123456789");
		System.out.println(account);

		System.out.println(account1);

		System.out.println(account.getBalance());

		account.deposit(100);
		System.out.println("Money after deposit :- "+account.getBalance() + " in account :- "+account.getAccountNumber());

		account.withdraw(50);
		System.out.println("Money after withdraw :- "+account.getBalance() + " in account :- "+account.getAccountNumber());

		account.withdraw(200);
		System.out.println("Money after withdraw :- "+account.getBalance() + " in account :- "+account.getAccountNumber());

//		account.deposit(0);
//		System.out.println("Money after deposit :- "+account.getBalance() + " in account :- "+account.getAccountNumber());

		Vehicle vehicle = new Vehicle();
		vehicle.startsEngine();

		Car car = new Car();
		car.drive();
		car.startsEngine();

		Vehicle carVehicle = new Car();
		carVehicle.startsEngine();
		((Car) carVehicle).drive();



		Student student = new Student();

		Person person = new Person();

		Student student1 = new Student("Prapti");

		Person person1 = new Person("Prapti");

		student.greet();
		person.greet();

		student.greet("Prapti");
		person.greet("Prapti");
		student.greet("Prapti",12);

		System.out.println("Single Inheritance");

		Dogg dogg = new Dogg();
		dogg.makeSound();


		System.out.println("Multilevel Inheritance");

		Cat cat = new Cat();
		cat.eat();
		cat.walk();
		cat.meow();



		System.out.println("Hierachical inheritance");
		Cat cat1 = new Cat();
		Rabbit rabbit = new Rabbit();

		cat1.walk();
		cat1.meow();
		cat1.makeSound();
		cat1.eat();

		rabbit.walk();
		rabbit.wofff();
		rabbit.eat();
		rabbit.makeSound();

		System.out.println("Hybrid inheritance");
		dogg.swim();


		System.out.println("Polymorphism");
		Calculator calculator = new Calculator();
		calculator.add(1,2);
		calculator.add(1, 2,3);
		calculator.add(1.79769313486231,1.79769313486231);
		calculator.add(1.79769313486231,1);



	}

}
