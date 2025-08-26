package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamQuestions {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();
		strList.add("sahil");
		strList.add("amit");
		strList.add("Amit");
		strList.add("vikram");
		strList.add("viKram");
		strList.add("akshay");

		List<Integer> intList = new ArrayList<>();
		intList.add(2134);
		intList.add(433);
		intList.add(1303);
		intList.add(103);
		intList.add(7643);
		intList.add(328);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Sahil", 50000));
		employeeList.add(new Employee(102, "Amit", 60000));
		employeeList.add(new Employee(103, "Vikram", 85000));
		employeeList.add(new Employee(104, "Akshay", 70000));

		// Write a program to sort a list of strings using a lambda expression.
		sortListOfString(strList);
		// Convert a list of integers to a list of their squares using map().
		intSquareUsingMap(intList);
		// Filter even numbers from a list using the Stream API.
		filterEvenNum(intList);
		// Count the number of strings starting with "A" using Java 8 Streams.
		countStrStartWithLetter(strList, "A");
		// Sort a list of custom objects (e.g., employees) by name and salary.
		sortEmployeeByNameAndSalary(employeeList);
		//Use forEach() to iterate and print all elements of a list.
		printUsingForEach(strList);
	}

	private static void sortListOfString(List<String> strList) {
		List<String> sortedList = strList.stream().sorted().toList();
		System.out.println("sortedList : " + sortedList);
		List<String> reverseSortedList = strList.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("reverseSortedList : " + reverseSortedList);
		System.out.println("---------------------------------------------------");
	}

	private static void intSquareUsingMap(List<Integer> intList) {
		List<Integer> squares = intList.stream().mapToInt(i -> i * i).boxed().toList();
		System.out.println("squares : " + squares);
		System.out.println("---------------------------------------------------");
	}

	private static void filterEvenNum(List<Integer> intList) {
		List<Integer> filterEven = intList.stream().filter(i -> i % 2 == 0).toList();
		System.out.println("filterEven : " + filterEven);
		
		Map<Boolean, List<Integer>> partitionEvenOdd = intList.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println("partitionEvenOdd : " + partitionEvenOdd);
		
		System.out.println("---------------------------------------------------");
	}

	private static void countStrStartWithLetter(List<String> strList, String startWith) {
		List<String> strListStartWith = strList.stream().filter(str -> str.startsWith(startWith)).toList();
		System.out.println("strListStartWith : " + strListStartWith);
		
		List<String> strListStartWithIgnoreCase = strList.stream()
				.filter(str -> str.toLowerCase().startsWith(startWith.toLowerCase())).toList();
		System.out.println("strListStartWithIgnoreCase : " + strListStartWithIgnoreCase);
		
		System.out.println("---------------------------------------------------");
	}

	private static void sortEmployeeByNameAndSalary(List<Employee> employeeList) {
		List<Employee> sortedEmployeeByNameAndSalary = employeeList.stream()
				.sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).toList();
		System.out.println("sortedEmployeeByNameAndSalary : " + sortedEmployeeByNameAndSalary);
		
		List<Employee> sortedEmployeeByNameAndSalaryReverse = employeeList.stream()
				.sorted(Comparator.comparing(Employee::getName, Comparator.reverseOrder()).thenComparing(Employee::getSalary)).toList();
		System.out.println("sortedEmployeeByNameAndSalaryReverse : " + sortedEmployeeByNameAndSalaryReverse);
		
		System.out.println("---------------------------------------------------");
	}
	
	private static void printUsingForEach(List<String> strList) {
		strList.stream().forEach(System.out::println);
		strList.stream().forEachOrdered(System.out::println);
	}

}
