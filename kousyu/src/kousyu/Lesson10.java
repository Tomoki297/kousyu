package kousyu;

import java.util.Scanner;

public class Lesson10 {

	public static int modeSelect(Scanner sc) {
		System.out.println("モードを選択してください。(1 or 2 )");
		int mode = sc.nextInt();
		return mode;
	}

	public static int umareSelect(Scanner sc) {
		System.out.println("生まれた西暦を入力してください。");
		int umare = sc.nextInt();
		return umare;
	}

	public static void calcAge(int umare, int year) {
		int nenrei = year - umare;
		System.out.println("西暦" + year + "年の時、あなたは" + nenrei + "歳です");
	}

	public static void calcYear(int nenrei, int umare) {

		int year = nenrei + umare;
		System.out.println("あなたが" + nenrei + "歳の時は西暦" + year + "年です");
	}

	public static void method(Scanner sc) {
		int mode = modeSelect(sc);

		if (mode == 1) {
			// メソッド呼び出し
			int umare = umareSelect(sc);
			System.out.println("調べたい年を西暦で入力してください。");
			int year = sc.nextInt();
			calcAge(umare, year);
		}else if (mode == 2) {
			// メソッド呼び出し
			int umare = umareSelect(sc);
			System.out.println("調べたい年齢を入力してください");
			int nenrei = sc.nextInt();
			calcYear(nenrei, umare);
		}else {
			System.out.println("正しいモードが入力されませんでした。やり直してください。");
			method(sc);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		method(sc);

	}



}
