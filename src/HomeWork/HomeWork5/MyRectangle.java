package HomeWork5;

public class MyRectangle {

	private double width;
	private double depth;

	// 不帶參數的建構子
	public MyRectangle() {
	}

	// 帶有 width 和 depth 參數的建構子
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	// 設定 width 的方法
	public void setWidth(double width) {
		this.width = width;
	}

	// 設定 depth 的方法
	public void setDepth(double depth) {
		this.depth = depth;
	}

	// 計算面積的方法
	public double getArea() {
		return width * depth;
	}

}
