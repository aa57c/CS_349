package lab6;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab {
	static Scanner sc = new Scanner(System.in);
	public static double getLength() {
		double length = 0;
		System.out.println("Enter length: ");
		length = sc.nextDouble();
		return length;
	}
	public static double getWidth() {
		double width;
		System.out.println("Enter width: ");
		width = sc.nextDouble();
		return width;
	}
	
	public static double getArea(double length, double width) {
		return length * width;
	}
	public static void displayData() {
		System.out.println("Area is: "+ getArea(getLength(), getWidth()));
	}
	public static void Celsius(double F) {
		if(F > 20) {
			return;
		}
		double celsius = 0;
		celsius = (F - 32) * 5 / 9;
		System.out.println("Farenheit: "+F+"\t\tCelcius: "+celsius);
		Celsius(F + 1);
	}
	public static double getSquare(double d) {
		return d * d;
	}
	public static int getSquare(int n) {
		return n * n;
		
	}
	public static int getCube(int n) {
		return getSquare(n) * n;
	}
	public static double getCube(double d) {
		return getSquare(d) * d;
	}
	public static void displaySqCube() {
		double d = 0;
		int n = 0;
		System.out.println("Enter a double");
		d = sc.nextDouble();
		System.out.println("Enter an integer");
		n = sc.nextInt();
		System.out.println("Square of "+d+": "+getSquare(d)+", Cube of "+n+": "+getCube(d));
		System.out.println("Square of "+n+": "+getSquare(n)+", Cube of "+n+": "+getCube(n));
	}
	
	public static double calcAverage(ArrayList<Double> list){
		double total = 0;
		for(int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		return total / 5;
	}
	public static void determineGrade(ArrayList<Double> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < 60) {
				System.out.println("Letter grade: F"+" ("+list.get(i)+"%)");
			}
			else if(list.get(i) == 60 && list.get(i) <= 69) {
				System.out.println("Letter grade: D"+" ("+list.get(i)+"%)");
			}
			else if(list.get(i) >= 70 && list.get(i) <= 79) {
				System.out.println("Letter grade: C"+" ("+list.get(i)+"%)");
			}
			else if(list.get(i) >= 80 && list.get(i) <= 89) {
				System.out.println("Letter grade: B"+" ("+list.get(i)+"%)");
			}
			else if(list.get(i) >= 90 && list.get(i) <= 100) {
				System.out.println("Letter grade: A"+" ("+list.get(i)+"%)");
			}
		}
	}
	public static void enterTestScores() {
		double grade;
		ArrayList<Double> myGrades = new ArrayList<Double>();
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter a grade");
			grade = sc.nextDouble();
			myGrades.add(grade);
		}
		determineGrade(myGrades);
		double avg = calcAverage(myGrades);
		System.out.println("Average of Test scores: "+avg);
		
	}
	public static void calcArea(double r) {
		System.out.println("Area: "+Math.PI*r*r);
	}
	public static void calcCircumf(double r) {
		System.out.println("Circumference: "+2*Math.PI*r);
	}
	public static void calcDiameter(double r) {
		System.out.println("Diameter: "+2*r);
	}
	public static String printCalcOptions() {
		System.out.println("Enter 'a' to calculate area of circle");
		System.out.println("Enter 'b' to calculate circumference of circle");
		System.out.println("Enter 'd' to calculate diameter of circle");
		String choice = JOptionPane.showInputDialog("Enter a choice:");
		return choice;
	}
	public static void enterRadius() {
		System.out.println("Enter a radius");
		double radius = sc.nextDouble();
		String choice = printCalcOptions();
		switch(choice) {
		case "a":
			calcArea(radius);
			break;
		case "b":
			calcCircumf(radius);
			break;
		case "d":
			calcDiameter(radius);
			break;
		default:
			System.out.println("Invalid choice. Please try again");
			break;
		}
		
	}
	public static boolean isEven(int n) {
		if(n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static int getOccurences(String s, char c) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	public static void countVowels(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' 
					|| str.charAt(i) == 'i'
					|| str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("The number of vowels in \""+str+"\": "+count);
	}
	private static boolean isPrime(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static void printPrimes(int max) {
		int count = 0;
		for(int i = 2; i <= max; i++) {
			if(isPrime(i)) {
				System.out.print(i+ " ");
				count++;
				if(count == 10) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
	private static void countWords(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(((i > 0) && (str.charAt(i) != ' ') && (str.charAt(i - 1)==' ')) || ((str.charAt(i) !=' ') && (i==0)) ) {
				count++;
			}
		}
		System.out.println("The number of words in \""+str+"\": "+count);
	}
	public static String reverseStr(String s) {
		if(s.isEmpty()) {
			return s;
		}
		else {
			return reverseStr(s.substring(1)) + s.charAt(0);
		}
	}
	public static void PasswordVerification() {
		Scanner sc = new Scanner(System.in);
		boolean valid = false;
		String pass;
		do {
			System.out.print("Please enter password and then hit enter:");
			pass = sc.nextLine();
			if(pass.length() < 8) {
				valid = false;
				System.out.println("Password must have at least 8 characters");
				continue;
			}
			for(int i = 0; i < pass.length(); i++) {
				char c = pass.charAt(i);
				if(('a' <= c && c <= 'z') 
						|| ('A' <= c && c <= 'Z')
						|| ('0' <= c && c <= '9')) {
					valid = true;
				}
				else {
					System.out.println("Only letter and digits are acceptable.");
					valid = false;
					break;
				}
			}
		}while(!valid);
		System.out.println("Password Accepted");
		sc.close();
	}
	public static boolean isPalindrome(String s) {
		String clean = s.replaceAll("\\s+", "").toLowerCase();
		int length = clean.length();
		int forward = 0;
		int backward = length - 1;
		while(backward > forward) {
			char forwardChar = clean.charAt(forward++);
			char backwardChar = clean.charAt(backward--);
			if(forwardChar != backwardChar) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		System.out.print("Question 1\n");
		displayData();
		System.out.print("Question 2\n");
		Celsius(0);
		System.out.print("Question 3\n");
		displaySqCube();
		System.out.print("Question 4\n");
		enterTestScores();
		System.out.print("Question 5\n");
		enterRadius();
		System.out.print("Question 6\n");
		System.out.println("Enter an integer:");
		int userInput = sc.nextInt();
		boolean evenOrOdd = isEven(userInput);
		if(evenOrOdd) {
			System.out.println("Integer is even");
		}
		else {
			System.out.println("Integer is odd");
		}
		System.out.print("Question 7\n");
		String s = "The Apple doesn't fall far from The Tree";
		int occur1 = getOccurences(s, 'A');
		int occur2 = getOccurences(s, 'f');
		int occur3 = getOccurences(s, 'T');
		System.out.println("The number of occurences of the letter 'A': "+occur1);
		System.out.println("The number of occurences of the letter 'f': "+occur2);
		System.out.println("The number of occurences of the letter 'T': "+occur3);
		System.out.println("Question 8\n");
		countVowels(s.toLowerCase());
		System.out.print("Question 9\n");
		countWords(s);


		System.out.print("Question 10\n");
		boolean prime = isPrime(8);
		if(prime) {
			System.out.println("Integer 8 is a prime number");
			
		}
		else {
			System.out.println("Integer 8 is not a prime number");
		}
		
		printPrimes(50);
		System.out.println("Question 11");
		String res = reverseStr("Strawberry");
		System.out.println(res);
		System.out.println("Question 12");
		PasswordVerification();
		System.out.println("Question 13");
		boolean isPalin = isPalindrome("Race car");
		if(isPalin) {
			System.out.println("yes. it is a palindrome");
		}
		else {
			System.out.println("no. it is not a palindrome");
		}
		
		
		
		
		
		

	}



}
