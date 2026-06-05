package com.student.result;

import java.util.Scanner;

public class StudentResultCalculator {
    public static void main(String[] args){
        System.out.println("Enter the Student Name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter the Marks of the Subject 1: ");
        int subject1=sc.nextInt();
        System.out.println("Enter the Marks of the Subject 2: ");
        int subject2=sc.nextInt();
        System.out.println("Enter the Marks of the Subject 3: ");
        int subject3=sc.nextInt();
        int total=subject1+subject2+subject3;
        System.out.println("Total Marks of the Student is: "+total);
        float percentage=total/3;
        System.out.println("Percentage of the student is: "+percentage);



    }
}
