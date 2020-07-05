package Package1;

public class Job implements Comparable<Job>{
	int weight;
	int length;
	float value; // This changes depending on the greedy algorithm 
	public Job(int weight, int length) {
		this.weight = weight;
		this.length = length;
		this.value = (float)this.weight - (float)this.length; // this can be changed
		// Case 1: weight - length
		// Case 2: weight / length --> optimal case
	}
	@Override
	public int compareTo(Job o) {
		// TODO Auto-generated method stub
		if(this.value - o.value == 0) {
			return o.weight - this.weight; // break ties
		}
		if (o.value > this.value) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
