public class BinaryRecursiveSearch implements Practice03Search {

	
	@Override
	public int search(int [] a , int target){
		return binarySearch(a, target, 0,  a.length-1);
	}


	public int binarySearch(int [] a, int target, int low, int high){
		
		int midpoint=(low+high)/2;

		if(low>high){
			return -1;
		}

		if(a[midpoint]==target){
			return midpoint;
		}
		if (a[midpoint]>target){
			return(binarySearch(a, target, low, midpoint-1));
		}
		if (a[midpoint]<target){
			return(binarySearch(a, target, midpoint+1, high));
		}	
		return -1;	

	}

	public String searchName(){
		return "Binary Recursive";
	}

}