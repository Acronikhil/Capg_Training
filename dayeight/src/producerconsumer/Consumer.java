package producerconsumer;

public class Consumer extends Thread{
	
	private Factory factory;
	
	public Consumer(Factory factory) {
		this.factory = factory;
	}

	public void run() {
		for(int i=1;i<11;i++)
			factory.get();
	}

}
