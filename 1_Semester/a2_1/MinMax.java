package a2_1;
import static prog.ConsoleReader.*;
public class MinMax {

	public static void main(String[] args) {
		
		int a = readInt("a");
		int b = readInt("b");
		int c = readInt("c");
		int min = minherausfinden(a,b,c);
		int max = maxherausfinden(a,b,c);
		
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}
	
	private static int minherausfinden(int x, int y, int z){
		
		int min = x;
		
		if(x < y && x < z) {
			min = x;
		}
		if(y < x && y < z) {
			min = y;
		}
		if(z < x && z < y) {
			min = z;
		}
		return min;
	}
	
	private static int maxherausfinden(int x, int y, int z){
		
		int max = x;
		
		if(x > y && x > z) {
			max = x;
		}
		if(y > x && y > z) {
			max = y;
		}
		if(z > x && z > y) {
			max = z;
		}
		return max;
	}
}


