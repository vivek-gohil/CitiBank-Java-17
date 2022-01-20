package com.citibank.main;

import java.util.Arrays;
import java.util.List;

import com.citibank.pojo.Person;

public class CollectionIterationMain {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Vivek", "Gohil", 31), new Person("Trupti", "Acharekar", 33),
				new Person("Gurubux", "Gill", 30), new Person("Samarth", "Patil", 10));

		System.out.println("For loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		System.out.println("-".repeat(50));
		System.out.println("For in loop");
		for (Person person : people) {
			System.out.println(person);
		}

		System.out.println("-".repeat(50));
		System.out.println("Using Java 8+ foreach");
		// people.forEach(person -> System.out.println(person));
		people.forEach(System.out::print);

//		System.out.println("-".repeat(50));
//		people.forEach(person -> {
//			if (person.getAge() <= 30)
//				System.out.println(person.getFirstName());
//		});
	}
}
