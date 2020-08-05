package kousyu;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int nenrei = scanner.nextInt();
		int kakaku = scanner.nextInt();

		if (nenrei == 0) {
			kakaku = 100;
		} else {
			kakaku = 500;
		};
		System.out.println("kakaku = " + kakaku);
	}

}
