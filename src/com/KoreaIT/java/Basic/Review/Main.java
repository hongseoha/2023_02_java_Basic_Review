package com.KoreaIT.java.Basic.Review;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==Start Program==");
		Scanner sc = new Scanner(System.in);
		System.out.printf("명렁어: ");
		String cmd = sc.nextLine();
		System.out.printf("입력된 명령어: %s\n", cmd);
		System.out.println("==End Program==");
		sc.close();
	}
}
