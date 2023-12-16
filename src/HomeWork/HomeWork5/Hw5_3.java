package HomeWork5;

public class Hw5_3 {
	
	//利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
	//可以找出二維陣列的最大值並回傳。
	
	public static void main(String[] args) {
        // 測試整數陣列
        int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("整數陣列的最大值: " + maxElement(intArray));

        // 測試浮點數陣列
        double[][] doubleArray = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        System.out.println("浮點數陣列的最大值: " + maxElement(doubleArray));
    }

    // 針對整數陣列的 maxElement 方法
    public static int maxElement(int[][] x) {
        int max = Integer.MIN_VALUE; //遍歷陣列時,確保任何其他int值都會比它大
        for (int[] row : x) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    // 針對浮點數陣列的 maxElement 方法
    public static double maxElement(double[][] x) {
        double max = Double.MIN_VALUE;
        for (double[] row : x) {
            for (double element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
