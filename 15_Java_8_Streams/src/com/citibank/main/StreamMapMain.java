package com.citibank.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.citibank.pojo.Person;

public class StreamMapMain {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Vivek", "Gohil", 31), new Person("Trupti", "Acharekar", 33),
				new Person("Gurubux", "Gill", 30), new Person("Samarth", "Patil", 10));

		people.forEach(person -> System.out.println(person));

		// Print all the first name in uppercase and store in new list

		// Without Streams
		List<String> firstNameList = new ArrayList<String>();

		people.forEach(person -> {
			firstNameList.add(person.getFirstName().toUpperCase());
		});

		firstNameList.forEach(name -> System.out.println(name));

		// Using Streams
		people.stream().map(person -> person.getFirstName().toUpperCase()).collect(Collectors.toList())
				.forEach(t -> System.out.println(t));
		
		people.stream().map(person -> person.getFirstName().toUpperCase()).collect(Collectors.toList())
		.forEach(System.out::println);

		// nameList.forEach(name -> System.out.println(name));

	}
}
