package uncheckedException1;

import java.util.Scanner;

public class Matrimony 
{
 public void check(char gender,int age)
 {
	 if (gender=='m'&&age>=21&&age<=35||gender=='f'&&age>=18&&age<=35)
	 {
		 System.out.println("Since your age is within the legal norms, you can marry");
		 
	 }
	 else
	 {
		 try
		 {
			 throw new MarriageException("Please wait");
		 }
		 catch(MarriageException e)
		 {
			 System.err.println(e.getMessage());
		 }
		 
	 }
 }
 public static void main(String[] args) 
 {
 Matrimony m=new Matrimony();
 Scanner sc=new Scanner (System.in);
 System.out.println("Enter gender");
 char gender=sc.next().toLowerCase().charAt(0);
 System.out.println("Enter age");
 int age=sc.nextInt();
 m.check(gender, age);
}
}
