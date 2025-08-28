package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
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
		employeeList.add(new Employee(101, "Sahil", 50000, "IT"));
		employeeList.add(new Employee(102, "Amit", 60000, "Finance"));
		employeeList.add(new Employee(103, "Vikram", 85000, "Finance"));
		employeeList.add(new Employee(104, "Akshay", 70000, "IT"));
		
		List<List<String>> listOfLists = Arrays.asList(
		        Arrays.asList("A", "B"),
		        Arrays.asList("C", "D"),
		        Arrays.asList("E", "F")
		);

		

		// Write a program to sort a list of strings using a lambda expression.
		sortListOfString(strList);
		// Convert a list of integers to a list of their squares using map().
		intSquareUsingMap(intList);
		// Filter even numbers from a list using the Stream API.
		//Partition a list of numbers into odd and even using Collectors.partitioningBy
		filterEvenNum(intList);
		// Count the number of strings starting with "A" using Java 8 Streams.
		countStrStartWithLetter(strList, "A");
		// Sort a list of custom objects (e.g., employees) by name and salary.
		sortEmployeeByNameAndSalary(employeeList);
		//Use forEach() to iterate and print all elements of a list.
		printUsingForEach(strList);
		//Remove duplicate elements from a list using distinct().
		removeDuplicates(strList);
		//Find the maximum and minimum in a list using stream().max() and min().
		findMinMax(intList);	
		//Convert a list of strings to uppercase using Streams.
		convertStrToUpperCase(strList);
		//Group a list of employees by department using Collectors.groupingBy.
		groupEmployeeByDepartment(employeeList);
		//Calculate average salary of employees using Collectors.averagingDouble.
		avgSalaryOfEmployee(employeeList);
		//Convert a list of objects into a Map<id, name> using Collectors.toMap().
		listToMap(employeeList);
		//Join strings using Collectors.joining(", ").
		joinString(strList);
		//Count occurrences of each word in a string list using Collectors.groupingBy.
		countOccuranceOfWords(strList);
		//Find the second highest salary using Streams.
		secondHighestSalary(employeeList);
		//FlatMap a list of lists into a single list.
		flatTheListOfList(listOfLists);
		//Find duplicate elements in a list using Streams.
		findDuplicateElement(strList);
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
//		strList.stream().forEachOrdered(System.out::println);
		System.out.println("---------------------------------------------------");
	}
	
	private static void removeDuplicates(List<String> strList) {
//		List<String> strListWithoutDuplicates = strList.stream().distinct().toList();
		List<String> strListWithoutDuplicates = strList.stream().map(str -> str.toLowerCase()).distinct().toList();
		System.out.println("strListWithoutDuplicates : " + strListWithoutDuplicates);
		System.out.println("---------------------------------------------------");
	}
	
	private static void findMinMax(List<Integer> intList) {
		int min = intList.stream().min(Comparator.naturalOrder()).get();
		int max = intList.stream().max(Comparator.naturalOrder()).get();
		System.out.println("min :" + min + ", max :"+ max);
//		IntSummaryStatistics summaries = intList.stream().collect(Collectors.summarizingInt(Integer::intValue));
//		System.out.println("min :" + summaries.getMin() + ", max :"+ summaries.getMax());
		System.out.println("---------------------------------------------------");
	}
	
	private static void convertStrToUpperCase(List<String> strList) {
		List<String> strListUpperCase = strList.stream().map(String::toUpperCase).toList();
		System.out.println("strListUpperCase : "+strListUpperCase);
		System.out.println("---------------------------------------------------");	
	}
	
	private static void groupEmployeeByDepartment(List<Employee> employeeList) {
		Map<String, List<Employee>> employeeGroupByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("employeeGroupByDepartment : "+employeeGroupByDepartment);
		System.out.println("---------------------------------------------------");	
	}
	
	private static void avgSalaryOfEmployee(List<Employee> employeeList) {
		double avgSalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("avgSalary : "+avgSalary);
		System.out.println("---------------------------------------------------");	
	}
	
	private static void listToMap(List<Employee> employeeList) {
		Map<Integer, String> employeeListToMap = employeeList.stream().collect(Collectors.toMap(Employee::getEmpNo, Employee::getName, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("employeeListToMap : "+employeeListToMap);
		System.out.println("---------------------------------------------------");	
	}

	private static void joinString(List<String> strList) {
		String joinedListStr = strList.stream().collect(Collectors.joining(", ", "(",")"));
		System.out.println("joinedListStr : "+joinedListStr);
		System.out.println("---------------------------------------------------");	
	}
	
	private static void countOccuranceOfWords(List<String> strList) {
		Map<String, Long> countOccuranceOfWords = strList.stream().map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//				.forEach((word, count) -> System.out.print(word + " :" + count + " "));
		System.out.println("countOccuranceOfWords : "+countOccuranceOfWords);
		System.out.println("---------------------------------------------------");
	}
	
	private static void secondHighestSalary(List<Employee> employeeList) {
		Optional<Employee> employee = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
		double secondHighestSalary = employee.isPresent() ? employee.get().getSalary() : 0.0;
		System.out.println("secondHighestSalary : "+secondHighestSalary);
		System.out.println("---------------------------------------------------");
	}
	
	private static void flatTheListOfList(List<List<String>> listOfLists) {
		List<String> flatTheListOfList = listOfLists.stream().flatMap(List::stream).toList();
		System.out.println("flatTheListOfList : "+flatTheListOfList);
		System.out.println("---------------------------------------------------");
	}
	
	private static void findDuplicateElement(List<String> strList) {
		Set<String> findDuplicateElement = strList.stream().filter(
				str -> Collections.frequency(strList.stream().map(String::toLowerCase).toList(), str.toLowerCase()) > 1)
				.map(String::toLowerCase).collect(Collectors.toSet());
		System.out.println("findDuplicateElement : " + findDuplicateElement);
		System.out.println("---------------------------------------------------");
	}
}
