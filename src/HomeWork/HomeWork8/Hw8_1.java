package HomeWork8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hw8_1 {
	
	//請建立一個Collection物件並將以下資料加入：
	//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
	//Object物件、“Snoopy”、BigInteger(“1000”)
	

	public static void main(String[] args) {
		// 創建一個Collection物件
		Collection<Object> collection = new ArrayList<>();

		// 將不同類型的數據添加到集合中
		collection.add(100);                     // Integer(100)
		collection.add(3.14);                    // Double(3.14)
		collection.add(21L);                     // Long(21L)
		collection.add(Short.parseShort("100")); // Short("100")
		collection.add(5.1);                     // Double(5.1)
		collection.add("Kitty");                 // 字符串 "Kitty"
		collection.add(100);                     // 另一個 Integer(100)
		collection.add(new Object());            // 一個新的Object物件
		collection.add("Snoopy");                // 字符串 "Snoopy"
		collection.add(new BigInteger("1000"));  // BigInteger("1000")
		
		//印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)

		// 使用Iterator遍歷集合
		System.out.println("使用Iterator:");
		Iterator<Object> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// 使用傳統的for循環遍歷集合
		System.out.println("\n使用傳統for循環:");
		Object[] array = collection.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 使用foreach循環遍歷集合
		System.out.println("\n使用foreach循環:");
		for (Object obj : collection) {
			System.out.println(obj);
		}

	}

}
