// Show the need of mutual exclusion.

public class PingPong2 extends Thread {
	private String text;

	private int time;

	public PingPong2(String text, int time) {
		this.text = text;
		this.time = time;
	}

	// print the text character by character
	public void run() {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			try {
				sleep(time);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String args[]) {
		new PingPong2("Ping ", 100).start();
		new PingPong2("Pong ", 100).start();
	}
}
