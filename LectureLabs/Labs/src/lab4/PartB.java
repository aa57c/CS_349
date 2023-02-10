package lab4;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PartB {
	public static void main(String args[]) {
		//Question 1
		String input = JOptionPane.showInputDialog("Enter a number greater than 20 but less than 45.");
		int num = Integer.parseInt(input);
		if(num > 20 && num < 45) {
			System.out.println("Number within Range");
		}
		else {
			System.out.println("Invalid Entry");
		}
		//Question 2
		String inputNum1 = JOptionPane.showInputDialog("Enter your first number.");
		int num1 = Integer.parseInt(inputNum1);
		String inputNum2 = JOptionPane.showInputDialog("Enter your second number.");
		int num2 = Integer.parseInt(inputNum2);
		
		if(num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		}
		else if(num1 == num2) {
			System.out.println(num1 + " is equal to " + num2);
		}
		else {
			System.out.println(num1 + " is less than " + num2);
		}
		//Question 2.1
		String user_input = JOptionPane.showInputDialog("Enter an integer.");
		int user_num = Integer.parseInt(input);
		if(user_num % 3 == 0 && user_num % 4 == 0) {
			System.out.println(user_num + " is divisible by both 3 and 4");
		}
		else if(user_num % 3 == 0 || user_num % 4 == 0) {
			System.out.println(user_num + " is divisible by 3 or 4 but not both");
			
		}
		else {
			System.out.println(user_num + " is not divisible by 3 or 4");
		}
		
		// Question 3
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		System.out.println("Enter the third number:");
		c = sc.nextInt();
		sc.close();
		if(a <= b && a <= c) {
			System.out.println(a+" is the smallest number");
		}
		else if(b <= a && b <= c) {
			System.out.println(b+" is the smallest number");
		}
		else {
			System.out.println(c+" is the smallest number");
		}
		//Question 4
		double test1, test2, test3, avgGrade;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the first test score:");
		test1 = sc1.nextDouble();
		System.out.println("Enter the second test score:");
		test2 = sc1.nextDouble();
		System.out.println("Enter the third test score:");
		test3 = sc1.nextDouble();
		sc1.close();
		avgGrade = (test1 + test2 + test3) / 3;
		if(avgGrade >= 90.0 && avgGrade <= 100) {
			System.out.println("The average test grade is "+avgGrade+". Letter grade is A.");
		}
		else if(avgGrade >= 80.0 && avgGrade <= 89.0) {
			System.out.println("The average test grade is "+avgGrade+". Letter grade is B.");
		}
		else if(avgGrade >= 70.0 && avgGrade <= 79.0) {
			System.out.println("The average test grade is "+avgGrade+". Letter grade is C.");
		}
		else if(avgGrade >= 60.0 && avgGrade <= 69.0) {
			System.out.println("The average test grade is "+avgGrade+". Letter grade is D.");
		}
		else if(avgGrade < 60.0) {
			System.out.println("The average test grade is "+avgGrade+". Letter grade is F.");
		}
	
		//Question 5
		int user_num1;
		String roman_num;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 10");
		user_num = sc2.nextInt();
		sc.close();
		switch(user_num) {
		case 1:
			roman_num = "I";
			break;
		case 2:
			roman_num = "II";
			break;
		case 3:
			roman_num = "III";
			break;
		case 4:
			roman_num = "IV";
			break;
		case 5:
			roman_num = "V";
			break;
		case 6:
			roman_num = "VI";
			break;
		case 7:
			roman_num = "VII";
			break;
		case 8:
			roman_num = "VII";
			break;
		case 9:
			roman_num = "IX";
			break;
		case 10:
			roman_num = "X";
			break;
		default:
			roman_num = "Invalid number";
		}
		if(roman_num == "Invalid number") {
			System.out.println("Sorry. This is not a valid number.");
		}
		else {
			System.out.println("Roman numeral for "+user_num+": "+roman_num);
		}
		
		//Question 6
		int choice;
		double user_amount;
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter 1 to convert euros to pounds or 2 to convert pounds to euros");
		choice = sc3.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Number of euros:");
			user_amount = sc3.nextDouble();
			double pounds = user_amount * 0.80;
			System.out.println("Number of pounds: " + pounds);
			sc.close();
			break;
		case 2:
			System.out.println("Number of pounds:");
			user_amount = sc3.nextDouble();
			double euros = user_amount * 1.25;
			System.out.println("Number of euros: " + euros);
			sc.close();
			break;
		}
		//Question 7
		double balance = 5423.00;
		double amount = 0;
		int choice1 = 0;
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Welcome to the ATM! How can we help you?");
		while(choice1 != 4) {
			System.out.println("1 - Withdrawal");
			System.out.println("2 - Deposit");
			System.out.println("3 - View Balance");
			System.out.println("4 - Exit");
			choice1 = sc4.nextInt();
			switch(choice1) {
			case 1:
				System.out.println("How much you want to withdraw?");
				amount = sc4.nextDouble();
				balance -= amount;
				System.out.println("Amount withdrawn. How else may we help you?");
				break;
			case 2:
				System.out.println("How much you want to deposit?");
				amount = sc4.nextDouble();
				balance += amount;
				System.out.println("Amount deposited. How else may we help you?");
				break;
			case 3:
				System.out.println("Current Balance: "+ balance);
				System.out.println("How else may we help you?");
				break;
			case 4:
				System.out.println("Have a good day!");
				break;
			default:
				System.out.println("Sorry. Invalid choice. Please choose again.");
			}
			
		}
		sc4.close();
		//Question 8 
		
		/*
		 * Note for Dr.Baffour:
		 * I attempted this one but couldn't figure it out. It doesn't seem to like Scanner next line. 
		 */
		/*
		double radius = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("First, enter the radius");
		radius = sc.nextDouble();
		System.out.print("Enter A or a to calculate the area of the circle\n");
		System.out.print("Enter C or c to calculate the circumference of the circle\n");
		System.out.print("Enter D or d to calculate the diameter of the circle: ");
		String choice = sc.nextLine();
		switch(choice) {
		case "a":
			double area = Math.PI * Math.pow(radius, 2);
			System.out.println("The area of the circle is: "+ area);
			break;
		case"c":
			double circum =  2 * Math.PI * radius;
			System.out.println("The area of the circle is: "+ circum);
			break;
		case "d":
			double diameter = 2 * radius;
			System.out.println("The diamter of the circle is: "+ diameter);
			break;
		default:
			System.out.println("Invalid choice. Try again");
			break;
		}
		*/
		//Question 9
		Scanner sc5 = new Scanner(System.in);
		System.out.print("Enter your first string: ");
		String str1 = sc5.nextLine();
		System.out.print("Enter your second string: ");
		String str2 = sc5.nextLine();
		if(str1.length() > str2.length()) {
			System.out.println(str1+ " is the larger than "+str2);
			
		}
		else if(str1.length() == str2.length()) {
			System.out.println("Both strings are the same length");
		}
		else if(str1.length() < str2.length()) {
			System.out.println(str2+" is larger than "+str1);
			
		}
		sc5.close();
		//Question 10
		Scanner sc6 = new Scanner(System.in);
		System.out.print("Enter your first string: ");
		String str3 = sc.nextLine();
		System.out.print("Enter your second string: ");
		String str4 = sc.nextLine();
		System.out.print("Enter your third string: ");
		String str5 = sc.nextLine();
		String arr[] = {str3, str4, str5};
		for(int i = 1; i < arr.length; i++) {
			String temp = arr[1];
			int j = i - 1;
			while(j >= 0 && temp.length() < arr[j].length()) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		System.out.print("In ascending order: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ ", ");
		}
		
			
		
		
	}

}
