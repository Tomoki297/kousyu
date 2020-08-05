package kousyu;

import java.util.Scanner;

public class Lesson7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {
			if (a > b) {
				b= b +1;
				System.out.println("a = " + a + "b = " + b);
			}else {
				a = a +1;
				System.out.println("a = " + a + "b = " + b);
			}

		};
		};
	}

