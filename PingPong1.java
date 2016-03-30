public class PingPong1 extends Thread {
	private String text;

	private int time;

	public PingPong1(String text, int time) {
		this.text = text;
		this.time = time;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(text);
			try {
				sleep(time);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String args[]) {
		new PingPong1("Ping", 200).start();
		new PingPong1("Pong", 100).start();
	}
}
