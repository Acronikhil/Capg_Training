package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class B {
	int x = 100;
	static int y = 200;

	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file1.sr"));
		B b1 = new B();
		oos.writeObject(b1);
		b1.x = 500;
		b1.y = 400;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file1.sr"));
		B obj = (B) ois.readObject();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
