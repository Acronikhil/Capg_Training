package producerconsumer;

public class Producer extends Thread{
	private Factory factory;
	private boolean end;
	
	public Producer(Factory factory) {
		this.factory = factory;
	}
	
	

	public boolean isEnd() {
		return end;
	}



	public void setEnd(boolean end) {
		this.end = end;
	}



	public void run() {
		for(int i=0;i<14;i++) {
		factory.put(i);
		}
		end = true;
	}

}
