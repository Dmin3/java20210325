package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A23Seriallzable {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/lecture/output10.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Car()); // serialization (직렬화) // 추상메소드를 갖고있지는 않다
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Car c = (Car) ois.readObject(); //deserialization (역직렬화)
		
		System.out.println(c);
		
		
		ois.close();
		oos.close();
	}
}


class Car implements Serializable{
	private String name;
	private int id;
}