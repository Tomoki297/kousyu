package kousyu;

import java.util.Scanner;

public class Lesson5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		int b = 5;

		while (count < b) {
			count += 1;
		}
		System.out.println("countの値は" + count + "です");
	}

}
