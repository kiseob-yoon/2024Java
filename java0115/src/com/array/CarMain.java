package com.array;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CarMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Car co = new Car();
		co.engine = "eletric";
		co.model = "cona";
		co.speed = 250;
		System.out.println(co);
		
		FileOutputStream fos = new FileOutputStream("c:/temp/car.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(co);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("c://temp/car.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Acc acc2 = (Acc) ois.readObject();
		System.out.println(co);
		
	}

}
