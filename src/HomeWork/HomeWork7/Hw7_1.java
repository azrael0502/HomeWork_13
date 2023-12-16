package HomeWork7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Hw7_1 {
	
	//請自行建立一個文字檔Sample.txt，內容如下...
	//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
	//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 提示用戶輸入檔案路徑
		System.out.println("請輸入檔案路徑:");
		String fileName = scanner.nextLine();

		try {
			// 計算位元組數
			long byteCount = Files.size(Paths.get(fileName));

			// 讀取檔案並計算字元數和列數
			int charCount = 0;
			int lineCount = 0;
			try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
				String line;
				while ((line = reader.readLine()) != null) {
					charCount += line.length();
					lineCount++;
				}
			}

			// 輸出結果
			System.out.println("檔案共有" + byteCount + "個位元組，" + charCount + "個字元，" + lineCount + "列資料");
		} catch (IOException e) {
			System.err.println("讀取檔案時發生錯誤: " + e.getMessage());
		} finally {
			scanner.close(); // 最後關閉 Scanner
		}
	}

}
