package kousyu;

public class Lesson4_sub {



	public  static int and(int nenrei,int umare) {

		int kakaku = 0;

		if (nenrei == 10 && umare == 2001){
			kakaku = 100;
		}else {
			kakaku = 500;
		}

		return kakaku;
	}

	public static int or(int nenrei,int umare) {

		int kakaku = 0;

		if (nenrei == 10 || umare == 2001){
			kakaku = 100;
		}else {
			kakaku = 500;
		}

		return kakaku;
	}
}
