package p11.textbook.s110601;

import p06.textbook.s060801.Computer;
import p06.textbook.s060801.ComputerExample;;

public class ClassExample {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		Class clazz1 = com1.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("p06.textbook.s060801.ComputerExample");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
