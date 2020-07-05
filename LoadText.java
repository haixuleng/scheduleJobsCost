package Package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
public class LoadText {
	String fileToLoad;
	int length = 0;
	//int[] data;
	public LoadText(String fileName) throws FileNotFoundException {
		fileToLoad = fileName;
		System.out.println(fileName);
		size();
	}

	public void size() throws FileNotFoundException {
		int size = 0;
		File myObj = new File(fileToLoad);
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()) {
			size ++;
			myReader.nextLine();
			//System.out.println("Length of Input: " + size);
		}
		//myReader.close();
		length = size;
		System.out.println("Length of Input: " + size);
	}

	public ArrayList<Job> get() throws FileNotFoundException {
		ArrayList<Job> initData = new ArrayList<Job>(length - 1);
		//System.out.println(length);
		File myObj = new File(fileToLoad);
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()) {
			String[] data = myReader.nextLine().split("\\s");
			if(data.length < 2) {
				continue; // starting line
			}
			Job node = new Job(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
			initData.add(node);
		}
		myReader.close();
		return initData;
	}
}

