class Print {
	public synchronized void print(String text) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}
}

class MyThread extends Thread {
	private String text;

	static Print print = new Print();

	public MyThread(String text) {
		this.text = text;
	}

	public void run() {
		print.print(text);
	}
}

public class PingPong3 {
	public static void main(String args[]) {
		new MyThread("Ping ").start();
		new MyThread("Pong ").start();
	}
}