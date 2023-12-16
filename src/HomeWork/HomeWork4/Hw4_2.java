package HomeWork4;

import java.util.Scanner;

public class Hw4_2 {
	
	public static void main(String[] args) {
		
		//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下：
		//{(25, 2500), (32, 800), (8, 500), (19, 1000), (27, 1200)}
	    //請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
		//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
		//員工編號: 25 19 27 共 3 人!
		
		
		// 員工編號和對應可借金額的二維陣列
		int[][] employeeData = {
				{25, 2500}, 
				{32, 800}, 
				{8, 500}, 
				{19, 1000}, 
				{27, 1200}
	    };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入欲借的金額: ");
        int loanAmount = sc.nextInt();
        
        // 用於保存有錢可借的員工編號
        String availableEmployee = "";
        int count = 0;
		
        // 檢查每位員工的可借金額
        for(int i = 0; i < employeeData.length; i++) {
        	if(employeeData[i][1] >= loanAmount) {
        	   availableEmployee += employeeData[i][0] + " ";
               count++;	
        	}
        }
        // 顯示結果
        System.out.println("有錢可借的員工編號: " + availableEmployee + "共 " + count + " 人!");
    }
	

}
