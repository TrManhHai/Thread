public class MyThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 10; i = i + 2) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}
}
