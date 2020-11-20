import java.util.*;
public class lectureDemo {
	public void selectionSort (int [] array1) {
		int indexMin;
		int temp;
		for (int i = 0; i < array1.length - 1; i++) {
			indexMin = i;
			for (int j = i+1; j < array1.length; j++) {
				if (array1[j] < array1[indexMin]) {
					temp = array1[indexMin];
					array1[indexMin] = array1[j];
					array1[j] = temp;
					
				}
			}
			
		}
	}
	
	// insertion sort
	public void insertionSort (int[] vals) {
		int currIdx;
		int temp;
		for (int pos = 1; pos < vals.length; pos++) {
			currIdx = pos;
			while(currIdx > 0 && vals[currIdx - 1] > vals[currIdx]) {
				temp = vals[currIdx - 1];
				vals[currIdx - 1] = vals[currIdx];
				vals[currIdx] = temp;
			}
		}
	}
			

}
