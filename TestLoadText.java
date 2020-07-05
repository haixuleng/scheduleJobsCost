package Package1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TestLoadText{
	public static void main(String args[]) throws FileNotFoundException{
		LoadText lt = new LoadText("data/jobs.txt");
		ArrayList<Job> data = lt.get();
		for(Job i : data) {
			System.out.println(i.value);
		}
	}
}