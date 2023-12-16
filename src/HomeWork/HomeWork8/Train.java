package HomeWork8;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Train implements Comparable<Train> {

	// 請設計一個Train類別，並包含以下屬性：
	// - 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
	// - 目的地 dest，型別為String - 票價 price，型別為double
	// 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
	// - (202, “普悠瑪”, “樹林”, “花蓮”, 400)
	// - (1254, “區間”, “屏東”, “基隆”, 700)
	// - (118, “自強”, “高雄”, “台北”, 500)
	// - (1288, “區間”, “新竹”, “基隆”, 400)
	// - (122, “自強”, “台中”, “花蓮”, 600)
	// - (1222, “區間”, “樹林”, 七堵, 300)
	// - (1254, “區間”, “屏東”, “基隆”, 700
	
	// 請寫一隻程式，能印出不重複的Train物件
	// 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
	// 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
	// (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

	private int number; // 班次
	private String type; // 車種
	private String start; // 出發地
	private String dest; // 目的地
	private double price; // 票價
	

	// 建構子
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	// 實現 Comparable 接口的 compareTo 方法，以便按照班次編號進行排序
	@Override
	public int compareTo(Train other) {
	    return Integer.compare(other.number, this.number); // 由大到小排序
	}


	// Getter 和 Setter 方法
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// 覆寫 equals 方法
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Train train = (Train) o;
		return number == train.number &&
				Double.compare(train.price, price) == 0 && 
				Objects.equals(type, train.type)&& 
				Objects.equals(start, train.start) && 
				Objects.equals(dest, train.dest);
	}

	// 覆寫 hashCode 方法
	@Override
	public int hashCode() {
		return Objects.hash(number, type, start, dest, price);
	}

	public static void main(String[] args) {
		Set<Train> trainSet = new TreeSet<>();
		// 建立 Train 物件
		Train[] trains = new Train[] {

				new Train(202, "普悠瑪", "樹林", "花蓮", 400),
				new Train(1254, "區間", "屏東", "基隆", 700),
				new Train(118, "自強", "高雄", "台北", 500),
				new Train(1288, "區間", "新竹", "基隆", 400),
				new Train(122, "自強", "台中", "花蓮", 600),
				new Train(1222, "區間", "樹林", "七堵", 300),
				new Train(1254, "區間", "屏東", "基隆", 700) };
		
		        // 將 Train 物件添加到 TreeSet 集合中
                trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
                trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
                trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
                trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
                trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
                trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
                trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 這個物件是重複的

             // 使用迭代器來印出 Train 物件
                Iterator<Train> iterator = trainSet.iterator();
                while (iterator.hasNext()) {
                    Train train = iterator.next();
                    System.out.println(
                    		"班次: " + train.getNumber() + 
                    		", 車種: " + train.getType() + 
                            ", 出發地: " + train.getStart() + 
                            ", 目的地: " + train.getDest() + 
                            ", 票價: " + train.getPrice()
                    );
                    
                }
                
                System.out.println("================================");

                // 使用 for 迴圈來印出 Train 物件
                for (Train train : trainSet) {
                    System.out.println(
                    		"班次: " + train.getNumber() + 
                    		", 車種: " + train.getType() + 
                            ", 出發地: " + train.getStart() + 
                            ", 目的地: " + train.getDest() + 
                            ", 票價: " + train.getPrice()
                    );
                    
                }
                
                System.out.println("================================");

                // 使用 foreach 方法來印出 Train 物件（Java 8 或更高版本）
                trainSet.forEach(train ->
                    System.out.println(
                    		"班次: " + train.getNumber() + 
                    		", 車種: " + train.getType() + 
                            ", 出發地: " + train.getStart() + 
                            ", 目的地: " + train.getDest() + 
                            ", 票價: " + train.getPrice()
                    )
                    
                );
        

		
	}

	

}
