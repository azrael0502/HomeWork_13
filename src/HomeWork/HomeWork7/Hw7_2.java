package HomeWork7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Hw7_2 {
	
	//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
	//append功能讓每次執行結果都能被保存起來
	
	public static void main(String[] args) {
        // 檔案名稱，用於寫入數據
        String fileName = "C:\\Users\\user\\Documents\\test\\Data.txt";

        try {
            // 以附加模式開啟檔案 //這裡的true參數讓FileWriter以附加模式打開檔案
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            // 生成並寫入10個介於1至1000之間的隨機數字
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int randomNumber = 1 + random.nextInt(1000);
                writer.write(randomNumber + " ");
            }

            // 關閉檔案
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
