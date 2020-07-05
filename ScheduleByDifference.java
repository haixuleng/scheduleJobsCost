package Package1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class ScheduleByDifference {
	public static void main(String args[]) throws FileNotFoundException{
		LoadText lt = new LoadText("C:\\Users\\lengh\\Dropbox\\Programming_coursera\\algorithm\\greedy_algorithms\\week1\\SchedualingProblem\\data\\jobs.txt");
		//LoadText lt = new LoadText("data/input_random_44_10000.txt");
		ArrayList<Job> data = lt.get();
		Collections.sort(data);
		int completionTime = 0;
		long totalCost = 0;
		for(Job i : data) {
			completionTime = completionTime + i.length;
			totalCost = totalCost + completionTime * i.weight;
			//System.out.println(i.weight + "," + i.length + "," + i.value);
			System.out.println("Completion Time:" + completionTime + ", total Cost:" + totalCost);
		}
	}
}
