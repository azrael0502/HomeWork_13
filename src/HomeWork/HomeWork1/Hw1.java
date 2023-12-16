package HomeWork1;

public class Hw1 {
	
	int a = 12;
	int b = 6;
	
	public static void main(String[] args) {
	
		//1.1請設計一隻Java程式，計算12，6這兩個數值的和與積
		
		int a = 12;
		int b = 6;
		
		System.out.print("兩數之和 = ");
		System.out.println( a + b );
		System.out.print("兩數之積 = ");
		System.out.println( a * b );
		System.out.println("==========================");
		
		//1.2請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		
		System.out.println(200/12 + "打" + 200%12 + "顆");
		System.out.println("==========================");
		
		//1.3請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		int totalSecond = 256559;
		int minute = 60;
		int hour = 3600;
		int day = 3600*24;
		
		System.out.println(totalSecond/day + "天" + totalSecond%day/hour + "小時" + totalSecond%day%hour/minute
				          + "分" + totalSecond%day%hour/minute + "秒");
		System.out.println("==========================");
		
		//1.4請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
	
		final double pi = 3.1415;
		int r = 5;
		System.out.println( "圓周長 = " + 2*pi*r );
		System.out.println("==========================");
		System.out.println( "圓面積 = " + pi*r*r );
		System.out.println("==========================");
		
		//1.5某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)
		
		double interest = 0.02;
		double FVIFA = (Math.pow(1 + interest, 10) - 1) / interest;
		double FVIF = Math.pow(1 + interest, 10);
		System.out.println( "本金加利息 = " + 1500000*(FVIF + interest*FVIFA) );
		System.out.println("==========================");
		
		//1.6請寫一隻程式，利用System.out.println()印出以下三個運算式結果
		//5 + 5
		//5 + ‘5’
		//5 + “5”
		//並請用註解各別說明答案的產生原因
		
		System.out.println( 5 + 5 );
		System.out.println("兩個整數五相加等於十");
		System.out.println("==========================");
		System.out.println( 5 + '5');
		System.out.println("整數五和字元五相加,其中字元五在ASCII為53,因此等於58");
		System.out.println("==========================");
		System.out.println( 5 + "5");
		System.out.println("整數五和字串五相加,所以在整數五後面直接擺上字串五,呈現55");
		System.out.println("==========================");
		
		
		
		
		
		
	}
	
	
	
}
