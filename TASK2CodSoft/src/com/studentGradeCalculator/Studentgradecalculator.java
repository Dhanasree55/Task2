package com.studentGradeCalculator;
import java.util.*;
public class Studentgradecalculator {
	public static void main(String[] args) {
		System.out.println("STUDENT GRADE CALCULATOR");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subjects :");
		int n=sc.nextInt();
		int Total=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the subject " + (i+1) + " Marks");
			int marks=sc.nextInt();
			Total =Total+ marks;
		}
		float percentage=Total/6;
		System.out.println("The total marks obtained : "+Total);
		System.out.println("Percentage :"+percentage+"%");
		int Grade = 0;
		if(percentage>=90)
			System.out.println("Grade : A+");
		else if(percentage>=80)
			System.out.println("Grade : A");
		else if(percentage>=70)
			System.out.println("Grade : B");
		else if(percentage>=60)
			System.out.println("Grade : C");
		else if(percentage>=50)
			System.out.println("Grade : D");
		else if(percentage>=40)
			System.out.println("Grade : E");
		else
			System.out.println("Grade : F");
	}

}
