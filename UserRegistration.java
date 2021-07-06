package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	//Scanner class for user input 
	 Scanner sc=new Scanner(System.in);
	 
	 //method to check username Valid or Invalid
	 public void validateUsername() {
		 System.out.println("Enter UserName");
		 String userName=sc.next();
		 //regex pattern for username
		 String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
		 Pattern p = Pattern.compile(regex);
		 Matcher matcher = p.matcher(userName);
		 boolean result = matcher.matches();
		 
	     if(result){
	    	 System.out.println("Valid username");
	     }
	     else {
	    	 System.out.println("Invalid username");
	     } 
	}
	 
	 //method to check LastName Valid or Invalid	
	 public void validateLastname() {
		 System.out.println("Enter LastName");
		 String lastName=sc.next();
		 //regex pattern for Lastname
		 String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
		 Pattern p = Pattern.compile(regex);
		 Matcher matcher = p.matcher(lastName);
		 boolean result = matcher.matches();
		 
	     if(result){
	    	 System.out.println("Valid username");
	     }
	     else {
	    	 System.out.println("Invalid username");
	     } 
	}
	 //method to check Email Valid or Invalid	
	 public void validateEmail() {
		 System.out.println("Enter Email");
		 String email=sc.next();
		 //regex pattern for email
		 String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
		 Pattern p = Pattern.compile(regex);
		 Matcher matcher = p.matcher(email);
		 boolean result = matcher.matches();
		 
	     if(result){
	    	 System.out.println("Valid Email");
	     }
	     else {
	    	 System.out.println("Invalid Email");
	     } 
	}
	 //method to check Phoneno Valid or Invalid	
	 public void validateMobileNo() {
		 System.out.println("Enter MobileNo with country code");
		 String mobileno=sc.next();
		 //regex pattern for email
		 String regex =  "^[1-9]{2}\\s[0-9]{10}$";
		 Pattern p = Pattern.compile(regex);
		 Matcher matcher = p.matcher(mobileno);
		 boolean result = matcher.matches();
		 
	     if(result){
	    	 System.out.println("Valid MobileNo");
	     }
	     else {
	    	 System.out.println("Invalid MobileNo");
	     } 
	}


	//method to check password Valid or Invalid
	 public void validatePassword() {
		 System.out.println("Enter Password");
		 String password=sc.next();
		 /*regex pattern for password:
		  * 1)must contain atleast 8 characters 
		  * 2)must contain one UpperCase
		  * 3)should have 1 numericno.
		 */
		 String regex = "^[A-Z]{1}+[a-zA-z1-9]{6,}[1-9]{1}$";
		 Pattern p = Pattern.compile(regex);
		 Matcher matcher = p.matcher(password);
		 boolean result = matcher.matches();
		 
	     if(result){
	    	 System.out.println("Valid Password");
	     }
	     else {
	    	 System.out.println("Invalid Password");
	     } 
	}

	//Main method
	public static void main(String[] args) {
		UserRegistration registration=new UserRegistration();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter choce\n 1)UserName\n 2)LastName\n 3)Email\n 4)PhoneNo\n 5)password");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				registration.validateUsername();
				break;
			case 2:
				registration.validateLastname();
				break;
			case 3:
				registration.validateEmail();
				break;
			case 4:
				registration.validateMobileNo();
				break;
			case 5:
				registration.validatePassword();
				break;		
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		}	
	}
}
