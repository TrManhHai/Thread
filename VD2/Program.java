public class Program {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread myThread = new Thread(myRunnable);
		myThread.start();
	}
}
