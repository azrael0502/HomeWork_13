package HomeWork7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hw7_3 {
	
	//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
	//代表的檔案會複製到第二個參數代表的檔案

	public static void copyFile(String sourceFile, String destinationFile) {
		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destinationFile)) {

			int byteRead;
			// 讀取源檔案並寫入目標檔案
			while ((byteRead = fis.read()) != -1) {
				fos.write(byteRead);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 使用範例
		copyFile("C:\\Users\\user\\Documents\\test\\Data.txt", "C:\\Users\\user\\Documents\\test\\DataCopy.txt");
	}

}
