import java.util.Arrays;

public class MinMaxFinder {
	
	//Assignment question-1
	int[] findMinMax(int arr[]) {
		Arrays.sort(arr);
		int[] b=new int[2];
		b[0]=arr[0];
		b[1]=arr[arr.length-1];
		return b;
	}	
	//Assignment question-2
	int findMin(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	int findMax(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
}
