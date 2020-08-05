package kousyu;

import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int nenrei = scanner.nextInt();
		int kakaku = scanner.nextInt();

		if (nenrei <= 12) {
			kakaku = 0;
		}else if (nenrei <= 15) {
			kakaku = 300;
		}else {
			kakaku = 500;
		};

		System.out.println("価格は" + kakaku + "円です");
	}

}
