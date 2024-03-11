package Kumar143;


	
	public class Doublearray {
	    public static void main(String[] args) {
	        // Define a 2D array
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        
	        // Print the 2D array
	        System.out.println("2D Array:");
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        // Accessing individual elements
	        System.out.println("Element at (1, 2): " + matrix[1][2]);
	        
	        // Modifying an element
	        matrix[1][2] = 10;
	        System.out.println("Modified element at (1, 2): " + matrix[1][2]);
	    }
	}

