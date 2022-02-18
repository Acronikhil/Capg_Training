package dayeight.thread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadA tA = new ThreadA();
		Thread t = new Thread(tA);
		t.start();
		try {
			Thread.sleep(100);
//			Thread.ss
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("IM main thread");
		
	}

}
