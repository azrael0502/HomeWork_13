package HomeWork3;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Hw3_3 {
	
	public static void main(String[] args) {

		// 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
		// 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
		// 的號碼與總數，如圖：

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// 利用HashSet來實現不允許重複的數字
		Set<Integer> numbers = new HashSet<>();

		System.out.println("請輸入你討厭的數字（0 到 9 之間）：");
		int hateNumber = sc.nextInt();

		// 確保討厭的數字在 0 到 9 之間
		while (hateNumber < 0 || hateNumber > 9) {
			System.out.println("無效的輸入。請輸入一個 0 到 9 之間的數字：");
			hateNumber = sc.nextInt();
		}

		// 當集合中的數量小於 6 時，繼續添加隨機數
		while (numbers.size() < 6) {
			int randomNumber = rand.nextInt(50); // 生成一個 0 到 49 的隨機數

			// 檢查隨機數字是否是討厭的數字
			if (randomNumber / 10 == hateNumber) {

			} else if (randomNumber % 10 == hateNumber) {

			} else {
				numbers.add(randomNumber);
			}

		}

		System.out.println("隨機抽取的 6 個數字（不包括討厭的數字）是: " + numbers);

		// 關閉 Scanner 對象
		sc.close();
	}

}
