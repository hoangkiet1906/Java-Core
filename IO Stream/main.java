package ObjectInputStream_ObjectOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Kiet", 18, 10.0f));
		list.add(new Student("Hoang", 19, 8.5f));
		list.add(new Student("Tuan", 20, 9.5f));
		list.add(new Student("Le", 18, 9.0f));
		
		FileOutputStream fout = null;
		ObjectOutputStream ofout = null;
		
		FileInputStream fin = null;
		ObjectInputStream ofin = null;
		List<Student> list2 = new ArrayList<Student>();
		try {
			fout = new FileOutputStream("testObjOut.dat");
			ofout = new ObjectOutputStream(fout);
			ofout.writeObject(list);
			System.out.println("Ghi thanh cong");
			
			fin = new FileInputStream("testObjOut.dat");
			ofin = new ObjectInputStream(fin);
			list2 = (List<Student>) ofin.readObject();		
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ofout.close();
				ofin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (Student o : list) {
			System.out.println(o.toString());
		}
	}

}
