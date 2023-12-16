package HomeWork8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hw8_2 {

	public static void main(String[] args) {
		// 創建一個Collection物件
		Collection<Object> collection = new ArrayList<>();

		// 將不同類型的數據添加到集合中
		collection.add(100); // Integer(100)
		collection.add(3.14); // Double(3.14)
		collection.add(21L); // Long(21L)
		collection.add(Short.parseShort("100")); // Short("100")
		collection.add(5.1); // Double(5.1)
		collection.add("Kitty"); // 字符串 "Kitty"
		collection.add(100); // 另一個 Integer(100)
		collection.add(new Object()); // 一個新的Object物件
		collection.add("Snoopy"); // 字符串 "Snoopy"
		collection.add(new BigInteger("1000")); // BigInteger("1000")
		
		// 移除不是java.lang.Number相關的物件

		// 使用Iterator移除不是java.lang.Number類的物件
		Iterator<Object> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			if (!(obj instanceof Number)) {
				iterator.remove(); // 移除非Number相關的物件
			}
		}
		
		// 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功

		
		// 印出剩下的集合元素
        System.out.println("集合中剩下的Number相關物件:");
        for (Object obj : collection) {
            System.out.println(obj);
        }
	}

}
