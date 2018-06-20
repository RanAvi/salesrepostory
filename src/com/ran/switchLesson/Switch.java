package com.ran.switchLesson;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter please");
		String text = sc.nextLine();
		

		switch (text) {
		
		case "start":
			System.out.println("Machin strated");
		break;
		
		case "Stop":
			System.out.println("Machin stoped");
			break;
			
		default:
		System.out.println("not reconzied");
		
		
		

		}

	}

}
