package HomeWork5;

import java.util.Scanner;

public class Hw5_1 {
	
	//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形。
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 創建 Scanner 物件以讀取用戶輸入

        System.out.println("請輸入長方形的寬度: ");
        int width = scanner.nextInt();  // 輸入長方形的寬度

        System.out.println("請輸入長方形的高度: ");
        int height = scanner.nextInt();  // 輸入長方形的高度

        starSquare(width, height);  // 調用 starSquare 方法

        scanner.close();  // 關閉 scanner
    }

    public static void starSquare(int width, int height) {
        for (int i = 0; i < height; i++) { // 外層控制高度
            for (int j = 0; j < width; j++) { // 內層控制寬度
                System.out.print("*"); // 打印星號
            }
            System.out.println(); // 每打印完一行後換行
        }
    }

}
