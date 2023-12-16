package HomeWork2;

public class Hw2 {

	public static void main(String[] args) {

		// 1.1請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum1 = 0;

		for (int i1 = 1; i1 <= 500; i1++) {
			sum1 += 2 * i1;
		}

		System.out.println(sum1);
		System.out.println("==================================");

		// 1.2請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)

		int sum2 = 1;
		for (int i2 = 1; i2 <= 10; i2++) {
			sum2 *= i2;
		}
		System.out.println(sum2);
		System.out.println("==================================");

		// 1.3請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)

		int sum3 = 1;
		int i3 = 1;
		while (i3 <= 9) {
			i3++;
			sum3 *= i3;
		}
		System.out.println(sum3);
		System.out.println("==================================");

		// 1.4請設計一隻Java程式，輸出結果為以下：
		// 1 4 9 16 25 36 49 64 81 100

		int sum4 = 0;
		for (int i4 = 1; i4 <= 10; i4++) {

			sum4 = i4 * i4;
			System.out.print(sum4 + " ");

		}
		System.out.println("");
		System.out.println("==================================");

		// 2.1阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個?

		for (int j1 = 1; j1 <= 49; j1++) {
			if (j1 / 10 == 4) {

			} else if (j1 % 10 == 4) {

			} else {
				System.out.print(j1 + " ");
			}
		}

		System.out.println();
		System.out.println("==================================");

		// 2.2請設計一隻Java程式，輸出結果為以下：

		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		for (int j2 = 10; j2 >= 0; j2--) {
			for (int t2 = 1; t2 <= j2; t2++) {

				System.out.print(t2 + " ");
			}
			System.out.println();
		}
		System.out.println("==================================");

		// 3.請設計一隻Java程式，輸出結果為以下：

		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print((char)('A'-1 + i));
			}
			System.out.println();
		}

	}

}
