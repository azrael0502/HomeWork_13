package HomeWork4;

public class Hw4_4 {

	public static void main(String[] args) {

		// 班上有8位同學，他們進行了6次考試結果如下：
		// 請算出每位同學考最高分的次數

		int[][] scores = { 
				{ 10, 37, 100, 77, 98, 90 },
				{ 35, 75, 70, 95, 70, 80 }, 
				{ 40, 77, 79, 70, 89, 100 }, 
				{ 100, 89, 90, 89, 90, 75 }, 
				{ 90, 64, 75, 60, 75, 50 }, 
				{ 85, 75, 70, 75, 90, 20 }, 
				{ 75, 70, 79, 85, 89, 99 }, 
				{ 70, 95, 90, 89, 90, 75 } 
		};
		// 用來記錄每位學生獲得最高分的次數的陣列。
		int[] highestScoresCount = new int[8];

		// 遍歷每一次考試。
		for (int exam = 0; exam < 6; exam++) {
			int highestScore = 0;

			// 找出這次考試的最高分數。
			for (int student = 0; student < 8; student++) {
				if (scores[student][exam] > highestScore) {
					highestScore = scores[student][exam];
				}
			}

			// 計算每位學生獲得這個最高分數的次數。
			for (int student = 0; student < 8; student++) {
				if (scores[student][exam] == highestScore) {
					highestScoresCount[student]++;
				}
			}
		}

		// 輸出每位學生獲得最高分的次數。
		for (int student = 0; student < 8; student++) {
			System.out.println("學生 " + (student + 1) + " 獲得最高分的次數是：" + highestScoresCount[student]);
		}

	}

}
