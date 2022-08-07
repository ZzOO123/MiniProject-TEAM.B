package library.mini.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ClassFileLoader {
	ArrayList<StudentVO> getStdData() throws IOException {
		ArrayList<StudentVO> list = null;
		list = new ArrayList<StudentVO>();
		File file = new File("./StudentList.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		StudentVO vo = null;
		while((line = br.readLine()) != null) { 
			System.out.println(line);
//			vo = new StudentVO(line); 
			list.add(vo);
		}	
		br.close();
		fr.close();
		return list;
	}

	ArrayList<BookVO> getBookData() throws IOException {
		ArrayList<BookVO> list = null;
		list = new ArrayList<BookVO>();

		File file = new File("./BookList.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		BookVO vo = null;
		while((line = br.readLine()) != null) { 
			System.out.println(line);
//			vo = new BookVO(line); 
			list.add(vo);
		}	
		br.close();
		fr.close();
		return list;
	}
}


