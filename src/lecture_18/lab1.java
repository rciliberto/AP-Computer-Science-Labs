package lecture_18;

public class lab1 {
	public static void main(String[] args){
		int[][] thing={{1,2,3},{4,5,6}};
		printTranspose(thing);
	}
	public static int sum(int[][] nums){ //Accepts a 2D array of integers
		int sum=0;	//Variable used to store the sum
		for(int i=0; i<nums.length; i++){	//Cycle through rows
			for(int j=0; j<nums[0].length; j++){	//Cycle through columns
				sum+=nums[i][j];	//Add the elements
			}
		}
		return sum;	//Return the sum of the elements
	}
	
	public static int rowSum(int[][] nums, int row){	//Accepts a 2D array of integers and a row number
		int sum=0;	//Variable used to store the sum
		for(int i=0; i<nums[row].length; i++){	//Cycle through the columns
			sum+=nums[row][i];	//Add the elements
		}
		return sum;	//Return the sum of the elements
	}
	
	public static int sum2(int[][] nums){	//Accepts a 2D array of integers
		int sum=0;	//Variable used to store the sum
		for(int i=0; i<nums.length; i++){	//Cycle through the rows
			sum+=rowSum(nums, i);	//Add the sum of the elements in the columns
		}
		return sum;	//Return the sum of the elements
	}
	
	public static int largest(int[][] nums){	//Accepts a 2D array of integers
		int largest=nums[0][0];	//Variable used to store the largest known element
		for(int i=0; i<nums.length; i++){	//Cycle through rows
			for(int j=0; j<nums[0].length; j++){	//Cycle through columns
				if(largest<nums[i][j]) largest=nums[i][j];	//Compare value to largest known. If larger store it as the largest
			}
		}
		return largest;	//Return the largest element
	}
	
	public static int largestByRow(int[][] nums, int row){	//Accepts a 2D array of integers and a row number
		int largest=nums[0][0];	//Variable used to store the largest known element
		for(int i=0; i<nums[row].length; i++){	//Cycle through the columns
			if(largest<nums[row][i]) largest=nums[row][i];	//Compare value to largest known. If larger store it as the largest
		}
		return largest;	//Return the largest element
	}
	
	public static int largest2(int[][] nums){	//Accepts a 2D array of integers
		int largest=nums[0][0];	//Variable used to store the largest known element
		for(int i=0; i<nums.length; i++){	//Cycle through rows
			if(largest<largestByRow(nums, i)) largest=largestByRow(nums,i);	////Compare largest value in row to largest known. If larger store it as the largest
		}
		return largest;	//Return the largest element
	}
	
	public static void printTranspose(int[][] nums){	//Accepts a 2D array of integers
		for(int i=0; i<nums[0].length; i++){	//Cycle through columns
			for(int j=0; j<nums.length; j++){	//Cycle through rows
				System.out.print(nums[j][i]+" ");	//Print element
			}
			System.out.println();	//enter lines
		}
	}
}
