package HomeWork10;

import java.util.Random;

public class Hw10_1 {
	
	// 請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否為質數 (提示：Math類別)
	
	public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(100) + 1;
            System.out.println(number + (isPrime(number) ? " 是質數" : " 不是質數"));
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
