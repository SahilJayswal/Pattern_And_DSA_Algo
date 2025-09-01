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
import java.util.stream.Stream;

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
		employeeList.add(new Employee(101, "Sahil", 50000, "IT", 22));
		employeeList.add(new Employee(102, "Amit", 60000, "Finance", 34));
		employeeList.add(new Employee(103, "Vikram", 85000, "Finance", 46));
		employeeList.add(new Employee(104, "Akshay", 70000, "IT", 25));
		
		List<List<String>> listOfLists = Arrays.asList(
		        Arrays.asList("A", "B"),
		        Arrays.asList("C", "D"),
		        Arrays.asList("E", "F")
		);
		
		List<Student> students = Arrays.asList(new Student("Sahil", "A", 85), new Student("Amit", "A", 92),
				new Student("Vikram", "B", 78), new Student("Akshay", "B", 88), new Student("Rohit", "C", 95),
				new Student("Manish", "C", 90));

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
		//Group students by grade and get top scorer in each group.
		groupStudentByGradeAndTopScorer(students);
		//Calculate frequency of characters in a string.
		freqencyOfChar();
		//Merge two maps using Streams.
		mergeMap();
		//Find the longest string in a list.
		longestStringInList(strList);
		//Remove all null values from a list using Stream.
		removeNullValue(strList);
		//Convert list of delimited strings (e.g. "1,2,3") to list of integers.
		convertStrToInteger();
		//Compute sum of salaries for all employees over age 30
		sumOfSalary(employeeList);
		//Sort a list of employees by age descending, then name.
		sortByAgeDescAndName(employeeList);
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
	
	private static void groupStudentByGradeAndTopScorer(List<Student> students) {
		Map<String, Optional<Student>> topScorers = students.stream().collect(
				Collectors.groupingBy(Student::getGrade, Collectors.maxBy(Comparator.comparingInt(Student::getScore))));
		System.out.println("topScorers : " + topScorers);
		System.out.println("---------------------------------------------------");
	}
	
	private static void freqencyOfChar() {
		String str = "hellohihowareyou";
		Map<Character, Long> freqencyOfChar = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("freqencyOfChar : " + freqencyOfChar);
		System.out.println("---------------------------------------------------");
	}
	
	private static void mergeMap() {
		Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
		Map<String, Integer> map2 = Map.of("B", 20, "D", 4);

		Map<String, Integer> merged = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));
		System.out.println("merged : " + merged);
		System.out.println("---------------------------------------------------");
	}
	
	private static void longestStringInList(List<String> strList) {
		String longestStringInList = strList.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
		System.out.println("longestStringInList : " + longestStringInList);
		System.out.println("---------------------------------------------------");
	}
	
	private static void removeNullValue(List<String> strList) {
		strList.add(null);
		List<String> removeNullValue = strList.stream().filter(s -> s != null && !s.equals(null)).toList();
		System.out.println("removeNullValue : " + removeNullValue);
		System.out.println("---------------------------------------------------");
	}
	
	private static void convertStrToInteger() {
		List<String> input = Arrays.asList("1,2,3", "4,5", "6");

		List<Integer> convertStrToInteger = input.stream().flatMap(s -> Arrays.stream(s.split(","))) // split each string
				.map(Integer::parseInt) // convert to int
				.toList();
		System.out.println("convertStrToInteger : " + convertStrToInteger);
		System.out.println("---------------------------------------------------");
	}
	
	private static void sumOfSalary(List<Employee> employeeList) {
		double sumOfSalary = employeeList.stream().filter(e -> e.getAge() > 30).collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("sumOfSalary : " + sumOfSalary);
		System.out.println("---------------------------------------------------");
	}
	
	private static void sortByAgeDescAndName(List<Employee> employeeList) {
		List<Employee> sortByAgeDescAndName = employeeList.stream().sorted(
				Comparator.comparing(Employee::getAge, Collections.reverseOrder()).thenComparing(Employee::getName))
				.toList();
		System.out.println("sortByAgeDescAndName : " + sortByAgeDescAndName);
		System.out.println("---------------------------------------------------");
	}

}
