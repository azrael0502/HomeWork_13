package HomeWork10;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Hw10_3 {
	
	// 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成(1)
	// 年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖
	//(提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入日期 (格式：20110131)：");
		String inputDate = scanner.nextLine();

		// 檢查日期格式是否正確
		if (!inputDate.matches("\\d{8}")) {
			System.out.println("輸入格式錯誤，請輸入8位數字的日期格式 (例如: 20110131)");
			return;
		}

		System.out.println("選擇輸出格式：\n1. 年/月/日\n2. 月/日/年\n3. 日/月/年");
		int choice = scanner.nextInt();

		try {
			SimpleDateFormat originalFormat = new SimpleDateFormat("yyyyMMdd");
			Date date = originalFormat.parse(inputDate);

			String formattedDate;
			switch (choice) {
			case 1:
				formattedDate = new SimpleDateFormat("yyyy/MM/dd").format(date);
				break;
			case 2:
				formattedDate = new SimpleDateFormat("MM/dd/yyyy").format(date);
				break;
			case 3:
				formattedDate = new SimpleDateFormat("dd/MM/yyyy").format(date);
				break;
			default:
				System.out.println("無效的選擇");
				return;
			}

			System.out.println("格式化後的日期： " + formattedDate);
		} catch (ParseException e) {
			System.out.println("日期解析錯誤");
		}
	}

}
