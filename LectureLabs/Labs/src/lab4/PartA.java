package lab4;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.lang.Math;

public class PartA {
	public static void main(String args[]) {
		// Question 1
		String name = JOptionPane.showInputDialog("What is your name?");
		String input1 = JOptionPane.showInputDialog("How many hours did you work this week?");
		String input2 = JOptionPane.showInputDialog("What is your hourly pay rate?");
		Double hours = Double.parseDouble(input1);
		Double payRate = Double.parseDouble(input2);
		Double totalWage = hours * payRate;
		System.out.print("Hello " + name + ". Your total wages this week is: " + totalWage + " pounds");
		
		//Question 2
		DecimalFormat df = new DecimalFormat("#.####");
		String input = JOptionPane.showInputDialog("What is the radius of your sphere?");
		Double radius = Double.parseDouble(input);
		Double pi = Math.PI;
		Double surfaceArea = 4 * pi * Math.pow(radius, 2);
		System.out.println("Surface Area: " + df.format(surfaceArea));
	}

}
