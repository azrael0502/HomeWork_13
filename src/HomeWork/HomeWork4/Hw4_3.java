package HomeWork4;

import java.util.Scanner;

public class Hw4_3 {

	public static void main(String[] args) {

		// 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
		// 例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」。
		// (提示1：Scanner，陣列)
		// (提示2：需將閏年條件加入)
		// (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入年份: ");
		int year = scanner.nextInt();
		System.out.print("請輸入月份: ");
		int month = scanner.nextInt();
		System.out.print("請輸入日期: ");
		int day = scanner.nextInt();

		if (isValidDate(year, month, day)) {
			System.out.println("輸入的時間是該年的第" + dayOfYear(year, month, day) + "天");
		} else {
			System.out.println("錯誤的時間輸入");
		}

		scanner.close();
	}
    //判斷是否為閏年
	private static boolean isLeapYear(int year) {
		return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
	}
    //檢查日期是否有效
	private static boolean isValidDate(int year, int month, int day) {
		int[] daysInMonth = { 31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return month >= 1 && month <= 12 && day >= 1 && day <= daysInMonth[month - 1];
	}
    //計算這是該年的第幾天
	private static int dayOfYear(int year, int month, int day) {
		int[] daysInMonth = { 31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int dayOfYear = day;

		for (int i = 0; i < month - 1; i++) {
			dayOfYear += daysInMonth[i];
		}

		return dayOfYear;
	}

}
