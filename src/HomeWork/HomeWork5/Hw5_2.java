package HomeWork5;

import java.util.Random;

public class Hw5_2 {
	
	//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	
	public static void main(String[] args) {
		 randAvg();
	}
	
	public static void randAvg() {
        Random random = new Random(); // 創建 Random 物件
        int sum = 0;
        int number;

        System.out.println("生成的10個亂數為: ");
        for (int i = 0; i < 10; i++) {
            number = random.nextInt(101); // 生成一個0到100的隨機整數
            System.out.print(number + " "); // 印出生成的數字
            sum += number; // 累加到總和當中
        }

        double average = sum / 10.0; // 計算平均值
        System.out.println("\n這10個數字的平均值為: " + average); // 印出平均值
    }

}
