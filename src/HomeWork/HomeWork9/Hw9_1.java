package HomeWork9;

public class Hw9_1 {

	// 使用一個計數器來追蹤完成比賽的參賽者人數
	private static int finishedCount = 0;

	public static void main(String[] args) {
		System.out.println("大胃王比賽開始");

		Thread manTouRen = new Thread(new Contestant("饅頭人"));
		Thread james = new Thread(new Contestant("詹姆士"));

		manTouRen.start();
		james.start();
	}

	static class Contestant implements Runnable {
		private String name;

		public Contestant(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					int sleepTime = (int) (Math.random() * (3000 - 500)) + 500;
					Thread.sleep(sleepTime);
					System.out.println(name + "吃第" + (i + 1) + "碗飯，用時: " + sleepTime + "ms");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			// 完成後，印出一條消息並增加完成計數
			System.out.println(name + "吃完了!");
			synchronized (Hw9_1.class) {
				finishedCount++;
				if (finishedCount == 2) {
					System.out.println("大胃王比賽結束");
				}
			}
		}
	}
}
