package assignment2;

public class Missingnumber {

		public static void main(String[] args) {
			int[]arr={1,2,3,4,7,6,8};
			int missN;
			int n=8;
			int sumN=n*(n+1)/2;
			int sum=0;
			for (int i = 0; i < arr.length; i++) {
				
				sum=sum+arr[i];
			
			}
	          
	           missN=sumN-sum;
	           System.out.println(missN);
		}

	}