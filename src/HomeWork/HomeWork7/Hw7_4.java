package HomeWork7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hw7_4 {
	
	//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
	//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	
	 public static void main(String[] args) {
	        // 創建 Dog 和 Cat 物件
	        Dog dog = new Dog("Buddy");
	        Cat cat = new Cat("Whiskers");

	        // 檢查目錄是否存在，如果不存在則創建
	        String directoryPath = "C:\\data";
	        try {
	            Files.createDirectories(Paths.get(directoryPath));
	        } catch (IOException e) {
	            e.printStackTrace();
	            return;
	        }

	        // 序列化物件到文件
	        String filePath = directoryPath + "\\Object.ser";
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
	            oos.writeObject(dog);
	            oos.writeObject(cat);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 }

}
