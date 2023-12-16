package HomeWork5;

import java.util.Random;

public class Hw5_5 {
	
	//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
	//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
	//與數字的亂數組合

	private static final char[] CHAR_ARRAY = CharArray();

	public static void main(String[] args) {
		String authCode = genAuthCode();
		System.out.println("生成的驗證碼為: " + authCode);
	}

	// 字符陣列
	static char[] CharArray() {
		StringBuilder sb = new StringBuilder();
		for (char ch = 'A'; ch <= 'Z'; ch++) { // 添加大寫字母
			sb.append(ch);
		}
		for (char ch = 'a'; ch <= 'z'; ch++) { // 添加小寫字母
			sb.append(ch);
		}
		for (char ch = '0'; ch <= '9'; ch++) { // 添加數字
			sb.append(ch);
		}
		return sb.toString().toCharArray();
	}

	// 生成驗證碼的方法
	public static String genAuthCode() {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			int index = random.nextInt(CHAR_ARRAY.length); // 隨機選取一個索引
			sb.append(CHAR_ARRAY[index]); // 從字符陣列中選取字符
		}

		return sb.toString(); // 將組合的字符串轉換成 String 並回傳
	}

}
