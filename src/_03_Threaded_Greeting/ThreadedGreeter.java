package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int member;

	public ThreadedGreeter(int member) {

		this.member = member;
	}
	// 3. In the run method of the ThreadedGreeter class, print the message using
	// the member variable as the thread number.
	// If the member integer is less than or equal to 50, create a new thread.
	// Pass in a new object of the ThreadedGreeter class with the value of the
	// member variable plus one.

	// 4. Start the thread and join it with the calling thread.
	@Override
	public void run() {
		System.out.println("Hello from thread number: " + member);
		if (member <= 50) {
			Thread t = new Thread(() -> {
				ThreadedGreeter tg = new ThreadedGreeter(member + 1);
				tg.run();
			});
			t.start();
		}
	}
}