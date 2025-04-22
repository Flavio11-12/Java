package a12_1;

public class BucketSort {

	public static void main(String[] args) {
		
		int[] x = {8,5,3,4,1,2,6,9,7};
		bucketsort(x,mittelwert(x));

	}
	
	public static int mittelwert(int[] x) {
		
		int summe = 0;
		
		for(int i = 0; i < x.length; i++) {
			summe += x[i];
		}
		
		return summe / x.length;
		
	}
	
	public static int[] concat(int[] x, int[] b) {
		
		int[] c = new int [x.length + b.length];
		
		for(int i = 0; i < x.length; i++) {
			c[i] = x[i];
		}
		for(int i = 0; i < b.length; i++) {
			c[i + x.length] = b[i];
		}
		
		return c;
		
	}
	
	public static void bucketsort(int[] x, int mit) {
		
		int countB = 0, countA = 0;
		for(int i = 0; i < x.length; i++) {
			if(x[i] > mit) {
				countA++;
			}else {
				countB++;
			}
		}
			
		int[] bucketA = new int[countA];
		int[] bucketB = new int[countB];
		
		
		int indexB = 0, indexA = 0;
		for(int i = 0; i < x.length; i++) {
			if(x[i] < mit) {
				bucketA[indexA] = x[i];
				indexA++;
			}else{
				bucketB[indexB] = x[i];
				indexB++;
			}
		}
		selectionSort(concat(bucketA, bucketB));
	}
	
	public static void selectionSort(int[] x) {
		
		for (int i = 0; i < x.length - 1; i++) {
			
			int minPos = i;
			
			for (int j = i + 1; j < x.length; j++) {
				
				if (x[j] < x[minPos]) {
					minPos = j;
				}
			}
			
			int temp = x[minPos];
			x[minPos] = x[i];
			x[i] = temp;
		}
		
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i]);
		}
	}
	
}
