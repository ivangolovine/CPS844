public class perceptron {
	public static void main(String[] args) {
	
    
    int arr2[] = {0,0,0}; //weight
    int arr4[] = arr2;
    int arr3[] = {1,-1,1,-1}; //class
    int[][] matrix = {{1,0,4},{2,0,0},{3,4,4},{4,4,0}}; //instance
  //int[][] matrix = {{1,1,3},{1,1,1},{1,2,4},{1,2,2}};	//instance
    
    for (int k = 0; k < 4; k++) {
    	for (int j = 0; j < matrix.length; j++) {
    		int[] cols = new int[arr4.length];
    		for (int i = 0; i < matrix[j].length; i++) {
    			cols[i] = matrix[j][i];// Iterate column-wise
    		}
    		int a = getInstance(cols, arr4);
    		int weight = arr3[j];
    		if (weight < a) {
    			action(cols,arr4, weight);
    		}
    		else if (weight > a) {
    			action(cols, arr4, weight);
    		}
    		else {
    			arr2 = arr4;
    		}
    		print(arr2);
        	System.out.println();
    	}
    	
    }
	
}
	
	public static void print(int[] vector){

	    for(int i = 0; i< vector.length ; i++){
	        System.out.print(vector[i] + " ");
	    }
	}
	
	static int getInstance(int instances[],int weights[]){
		int product = 0;
		int num = 0;
        // Loop for calculate dot product
        for (int i = 0; i < instances.length; i++)
            product = product + (instances[i] * weights[i]);
        
        if (product > 0) {
        	num = 1;
        }
        else {
        	num = -1;
        }
		return num;
	}
	
	static int[] action(int instances[],int weights[], int value) {
		int number[] = weights;
			for (int i = 0; i < weights.length;i++) {
				number[i] = (weights[i] + (instances[i] * value));
			}
		return number;
	}	
}
