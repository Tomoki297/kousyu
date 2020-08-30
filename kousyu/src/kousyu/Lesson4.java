package kousyu;

import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scanner = new Scanner(System.in);

		System.out.println("年齢を入力してください");
		int nenrei = scanner.nextInt();
		System.out.println("生まれた年を入力してください");
		int umare = scanner.nextInt();
		int kakaku = 0;

		System.out.println("and条件で検索したい場合は1を、or条件で検索したい場合は2をにゅうりょくしてください");
		int hantei = scanner.nextInt();

		if (hantei == 1) {
			kakaku = Lesson4_sub.and(nenrei, umare);
			System.out.println(kakaku);
		}else if (hantei == 2) {
			kakaku = Lesson4_sub.or(nenrei, umare);
			System.out.println(kakaku);
		}else {
			System.out.println("入力に間違いがあります。やり直してください。");
		}
	}

}
