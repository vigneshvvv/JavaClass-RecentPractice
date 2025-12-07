package stream;

public class RunnableThread implements Runnable{
	
	private Thread thread;
	private String thread_name;

	public RunnableThread(String thread_name) {
	  this.thread_name = thread_name;
	}

	@Override
	public void run() {
		try {
		for(int i= 0; i<=3; i++) {
			Thread.sleep(3000);
			System.out.println(i);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void startThread() {
		System.out.println("Thread name at starting method");
		thread = new Thread(this, thread_name);
		thread.start();
		
	}

}
