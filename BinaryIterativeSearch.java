public class BinaryIterativeSearch implements Practice03Search {

	public int search(int [] a, int target){

		int low=0;
		int high=a.length-1;

		while(low<=high){
			int midpoint=(low+high)/2;
			if (a[midpoint]==target){
				return midpoint;
			}

			else if (a[midpoint]>target){
				high=midpoint-1;
			}

			else{
				low=midpoint+1;
			}

		}
		return -1;
	}


	public String searchName(){
		return "Binary Iterative";
	}
}