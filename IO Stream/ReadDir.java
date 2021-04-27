package Docfile.text;

/*Cần import gói java.io để truy xuất hệ thống tệp tin và thư mục*/
import java.io.*;

public class ReadDir {

	public ReadDir()
	{
		
	}
	
	public ReadDir(String path)
	{

		/*Trỏ đến thư mục có đường dẫn path*/
		File f = new File(path);

  /*Lấy danh sách tên tệp tin hoặc thư mục mà f đang trỏ đến*/
	  String[] filenames = f.list();

	   int count =0;
/*Duyệt danh sách và in tên ra màn hình*/
	  for (int i=0;i<filenames.length;i++)
	  {  
		  
		File fi = new File(path+"/"+filenames[i]);
		 if (fi.isDirectory()) System.out.print("<DIR> ");
		
		  System.out.println(filenames[i]);
		  
		  
		  //if (fi.isFile()) count++;
		 	 
	  }
	  
	  System.out.println("Number of file: "+count);
	
	}

	public void Dir(String path, String space)
	{
		File f = new File(path);
		String[] names = f.list();
		
		for (int i = 0;i<names.length;i++)
		{
			File fi = new File(path+"/"+names[i]);
			
			if (fi.isDirectory())
			{
			
				System.out.print(space + "<DIR> "+names[i]);
				System.out.println(names[i]);
                Dir(path+"/"+names[i],space+"|  "); 			
			}
			else
			System.out.println(space  + "+" + names[i]);
		}
	}
	
	public static void main(String[] arg)
	{

		ReadDir O = new ReadDir();
		
		O.Dir("C:/Users/ADMIN/eclipse-workspace/btMy/", "");
		
		
//System.out.println("Number of files:" +countFile("E:/Java space/Chapter 1"));
		 
	}
}