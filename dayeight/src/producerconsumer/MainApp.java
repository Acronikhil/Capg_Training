package producerconsumer;

import java.lang.Thread.State;

public class MainApp {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Producer producer = new Producer(factory);
		Consumer consumer = new Consumer(factory);
		producer.start();
		
		
		consumer.start();
		
		
		
//		while(state!="TERMINATED") {
//			 state = producer.getState().toString();
//		}
		
//		while(!producer.isEnd()) {
//	
//		}
		
			
		
		
//		System.out.println(producer.getState());
		
	}

}
