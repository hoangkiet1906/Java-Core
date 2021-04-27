package Docfile.text;

import java.io.File;

public class getFileCount {
	public static int Dir(String path) {
		int d=0;
		File file = new File(path);
		String[] name = file.list();
		for (int i = 0; i < name.length; i++) {
			File fi = new File(path+name[i]);
			if(fi.isDirectory()) {
				System.out.println("<DIR>"+name[i]);
				d=d+Dir(path+"/"+name[i]);
			}
			else {
				System.out.println(name[i]);
				d++;
			}
		}
		return d;
	}
	public static void main(String[] args) {
//		File file = new File("D:/");
//		String[] name = file.list();
//		for (int i = 0; i < name.length; i++) {
//			File fi = new File("D:/"+name[i]);
//			if(fi.isDirectory()) {
//				System.out.println("<DIR>"+name[i]);
//			}
//			else System.out.println(name[i]);
//		}
		System.out.println(Dir("C:/Users/ADMIN/eclipse-workspace/btMy/"));
	}
}
