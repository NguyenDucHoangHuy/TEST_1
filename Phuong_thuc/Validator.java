package Phuong_thuc;
import java.util.Scanner;
public class Validator {
 public static String getString(Scanner sc, String prompt)
 { System.out.println(prompt);
 String s=sc.next();
 sc.nextLine();
 return s;
 }
 public static int getInt(Scanner sc,String prompt,int j,int k)
 {
	 int i=0;
	 boolean isValid=false;
	 while(isValid==false)
	 {System.out.println(prompt);
	 if(sc.hasNextInt())
	 {
		 i=sc.nextInt();
		 isValid=true;
	 }
	 else
	 { System.out.println(
			 "Error! Invalid integer value. Try again.");
	 
	 }
	 sc.nextLine();
 }
	 return i;
}
 public static double getDouble(Scanner sc, String prompt)
 {
	 double d=0;
	 boolean isValid= false;
	 while (isValid==false)
	 { System.out.println(prompt);
	 if(sc.hasNextDouble())
	 {d=sc.nextDouble();
	 isValid=true;
	 }
	 else {
		 System.out.println(
				 "Error! Invalid decimal value.  Try agian. ");
		 
	 }
	 sc.nextLine();
	 }
	 return d;
 }
 public static double getDouble(Scanner sc, String prompt, double min, double max)
 {double d=0;
 boolean isValid=false;
 while(isValid==false)
 {d=getDouble(sc,prompt);
 if(d<=min)
	 System.out.println(
			 "Error! Number must be greater than" +min +".");
 else if(d>=max)
	 System.out.println(
			 "Error! Number must be less than " +max+".");
 else 
	 isValid=true;
 }
 return d;
 }
}
