package HomeWork3;

import java.util.Scanner;

public class Hw3_1 {
	
	public static void main(String[] args) {
		
		//1. 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入三個數字");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String result = checkTriangleType(a, b, c);
		System.out.println(result);
		
		
		sc.close();
	}

	private static String checkTriangleType(int a, int b, int c) {
		// 檢查是否滿足三角形定義
		if(a + b > c && a + c > b && b + c > a) {
			// 檢查三角形類型
			if(a==b && b==c) {
				return "正三角型";
			}else if(a==b || a==c || b==c){
				return "等腰三角型";
			}else if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
				return "直角三角型";
			}else {
				return "其他三角型";
			}
			
		}else {
			return "不是三角形";
		}
		
	}

}
