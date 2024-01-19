package Dave;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println("hello world");
        
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		System.out.println("age is "+age);
		if (age<18) {
			System.out.println("is a minor");
			
		}
		else {
			System.out.println("is an adult");
		}
	}

}
