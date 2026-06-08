    package com.student.result;

    import java.util.Scanner;

    public class StudentResultCalculator {
        public static void main(String[] args){
            System.out.println("Enter the Student Name: ");
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            System.out.println("Enter the Kannada Marks: ");
            int Kannada=sc.nextInt();
            System.out.println("Enter the English Marks: ");
            int English=sc.nextInt();
            System.out.println("Enter the Hindi Marks: ");
            int Hindi=sc.nextInt();
            System.out.println("Enter the Maths Marks: ");
            int Maths=sc.nextInt();
            System.out.println("Enter the Science Marks: ");
            int Science=sc.nextInt();
            System.out.println("Enter the Social Science Marks");
            int SocialScience=sc.nextInt();
            int total= Kannada+English+Hindi+Maths+Science+SocialScience;
            System.out.println("Total marks: "+total);
            double percentage=(total/600.00)*100;
            System.out.println("Total percentage of the students: "+percentage);
            char grade;
            if(percentage>=90){
                System.out.println("Student grade: A+");
            }
            else if(percentage>=80){
                System.out.println("Student grade: A");
            }
            else if(percentage>=70){
                System.out.println("Student grade: B");
            }
            else if(percentage>=60){
                System.out.println("Student grade: C");
            }
            else if(percentage>=50){
                System.out.println("Student grade: D");
            }
            else if(percentage>=40){
                System.out.println("Student grade: E");
            }
            else{
                System.out.println("Fail");
            }
        }
    }
