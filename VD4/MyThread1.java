public class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i = i + 2) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}
}
