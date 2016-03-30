// Same thing than PingPong1 using the syntax "Runnable"

class PingPong1b implements Runnable {
	private String text;

	private int time;

	public PingPong1b(String text, int time) {
		this.text = text;
		this.time = time;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(text);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String args[]) {
		new Thread(new PingPong1b("Ping", 200)).start();
		new Thread(new PingPong1b("Pong", 100)).start();
	}
}
