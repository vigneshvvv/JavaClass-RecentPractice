package stream;

public class SampleDemoThread {
	
	public static void main(String[] args) {
		
		RunnableThread runnableThread = new RunnableThread("Thread-1");
		runnableThread.startThread();
		
		RunnableThread runnableThread2 = new RunnableThread("Thread-2");
		runnableThread2.startThread();
		
		RunnableThread runnableThread3 = new RunnableThread("Thread-3");
		runnableThread3.startThread();
		
	}
}
