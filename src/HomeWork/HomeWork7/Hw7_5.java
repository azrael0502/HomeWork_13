package HomeWork7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Hw7_5 {
	
	//承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
	//型簡化本題的程式設計)
	
	
	public static void main(String[] args) {
        String filePath = "C:\\data\\Object.ser";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            // 讀取物件並轉型為 Animal
            Animal animal1 = (Animal) ois.readObject();
            Animal animal2 = (Animal) ois.readObject();
            
            
            // 執行 speak() 方法
            animal1.speak();
            animal2.speak();
           

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
