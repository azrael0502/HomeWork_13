package HomeWork10;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Hw10_2 {
	
	//請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示
	//(1)千分位(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖 
	//(提示： TestFormatter.java, Java API文件, 判斷數字可用正規表示法)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入一個數字：");
		String input = scanner.nextLine();

		// 檢查是否為合法數字
		if (!input.matches("-?\\d+(\\.\\d+)?")) {
			System.out.println("錯誤訊息：輸入非數字");
			return;
		}

		double number = Double.parseDouble(input);

		System.out.println("選擇顯示方式：\n1. 千分位\n2. 百分比\n3. 科學記號");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			DecimalFormat thousandFormatter = new DecimalFormat("#,###");
			System.out.println("千分位： " + thousandFormatter.format(number));
			break;
		case 2:
			NumberFormat percentFormatter = NumberFormat.getPercentInstance();
			System.out.println("百分比： " + percentFormatter.format(number));
			break;
		case 3:
			DecimalFormat scientificFormatter = new DecimalFormat("0.###E0");
			System.out.println("科學記號： " + scientificFormatter.format(number));
			break;
		default:
			System.out.println("無效的選擇");
		}
	}

}
