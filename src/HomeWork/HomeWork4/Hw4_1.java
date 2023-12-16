package HomeWork4;

public class Hw4_1{
	
	public static void main(String[] args) {
		
		// 1.有個一維陣列如下：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		
		// 創建一個整數一維陣列
		int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		// 計算總和
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			sum += value;
		}
		// 增強型(補充)
//		int sum = 0;
//	        for (int value : array) {
//	            sum += value;
//	        }
		
		// 計算平均值
        double average = (double) sum / array.length;
        System.out.println("平均值: " + average);
		
        // 輸出大於平均值的元素
        System.out.println("大於平均值的元素:");
        for (int value : array) {
            if (value > average) {
                System.out.println(value);
                }
        }
         
		
		
		
		//2.請建立一個字串，經過程式執行後，輸入結果是反過來的
		//例如String s = “Hello World”，執行結果即為dlroW olleH
        
        String s = "Hello World";
        char[] original = s.toCharArray(); // 將Hello World變成 "H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d"
        char[] reversed = new char[original.length];

        // 從原始字符串的末尾開始，將字符複製到新陣列中
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        // 將反轉後的字符陣列轉換為字符串
        String reversedString = new String(reversed);

        // 輸出結果
        System.out.println(reversedString);
        
        
        
        
        //(新方法)
//      String s = "Hello World";
//
//      // 使用 StringBuilder 進行字符串反轉
//      String reversed = new StringBuilder(s).reverse().toString();
//
//      // 輸出結果
//      System.out.println(reversed);
        

        
        
		
		//3.有個字串陣列如下 (八大行星)：
		//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
        
        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        int vowelCount = 0;
        
        // 傳統字串陣列
//      for (int i = 0; i < planets.length; i++) {
//          String planet = planets[i];
//          char[] chars = planet.toCharArray();
//          for (int j = 0; j < chars.length; j++) {
//              char ch = chars[j];
//
//              if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                  vowelCount++;
//              }
//          }
//      }
        
        // 遍歷字串陣列
        for (String planet : planets) {
            // 遍歷字串中的每個字符
            for (char ch : planet.toCharArray()) {
                // 檢查字符是否為母音
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }
        }

        // 輸出母音的總數
        System.out.println("母音總數: " + vowelCount);
    }
}
	
	


