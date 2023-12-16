package HomeWork3;

import java.util.Scanner;
import java.util.Random;

public class Hw3_2 {

	public static void main(String[] args) {
		// 生成一個0~9之間的隨機數字
		Random random = new Random();
		int randomNumber = random.nextInt(10);

		// 創建一個 Scanner 對象來讓用戶輸入
		Scanner sc = new Scanner(System.in);

		System.out.println("歡迎來到猜數字遊戲!");
		System.out.println("請選擇了一個 0 到 9 之間的數字，並嘗試猜測它。");

		boolean guessCorrect = false;
		while (!guessCorrect) {
			System.out.println("請輸入您的猜測");
			int guessNumber = sc.nextInt();

			if (randomNumber == guessNumber) {
				System.out.println("恭喜你！你猜對了！");
				guessCorrect = true;
			} else if (randomNumber != guessNumber && guessNumber >= 0 && guessNumber <= 9) {
				System.out.println("Sorry!猜錯了。請再試一次。");
			} else {
				System.out.println("請輸入0~9之間的數字");
			}

		}

		// (進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)

		int randomNumber1 = random.nextInt(101);

		System.out.println("歡迎來到進階版猜數字遊戲!");
		System.out.println("請選擇了一個 0 到 100 之間的數字，並嘗試猜測它。");

		boolean guessCorrect1 = false;
		while (!guessCorrect1) {
			System.out.println("請輸入您的猜測");
			int guessNumber1 = sc.nextInt();

			if (randomNumber1 == guessNumber1) {
				System.out.println("恭喜你！你猜對了！");
				guessCorrect1 = true;
			} else if (randomNumber1 > guessNumber1 && guessNumber1 >= 0 && guessNumber1 <= 100) {
				System.out.println("Sorry!猜錯了。請再猜高一點。");
			} else if (randomNumber1 < guessNumber1 && guessNumber1 >= 0 && guessNumber1 <= 100) {
				System.out.println("Sorry!猜錯了。請再猜低一點。");
			} else {
				System.out.println("請輸入0~100之間的數字");
			}
		}

		// 關閉 Scanner 對象
		sc.close();
	}

}
