package HomeWork6;

public class Calculator {

	public static double powerXY(int x, int y) throws CalException {
	        if (x == 0 && y == 0) {
	            throw new CalException("x and y cannot both be zero.");
	        } else if (y < 0) {
	            throw new CalException("y cannot be negative for integer results.");
	        }
	        return Math.pow(x, y);
	}
}
