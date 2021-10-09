package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		/* get the length of the array
		*  declare an int variable named count
		*  iterate from 0 to the array length-1 (outer loop starts here)
		*  assign 0 to count
		*  iterate from i to the length of the array by adding 1 to it (inner loop starts here)
		*  compare both the loop variables & check they're equal
		*  increase the count if both the arrays are equal
		*  Out of the inner loop, check and print the first array variable if count is more than 0
		*/
		int[] arr = { 1,11,12,0,13,17,12,14,3,9};
		int count = arr.length;

		for (int i = 0; i <= arr.length - 1; i++) {
			count = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;

				}

			}
			if (count > 0) {
				System.out.println(arr[i]);
				break;
				
			}

		}

	}

}