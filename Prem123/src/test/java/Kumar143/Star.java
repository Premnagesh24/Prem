package Kumar143;

	public class Star {
	    public static void main(String[] args) {
	        int[] numbers = {5, 2, 9, 1, 7};
	        
	        int max = numbers[0];
	        int min = numbers[0];
	        
	        // Finding maximum and minimum elements
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	        }
	        
	        System.out.println("Maximum element: " + max);
	        System.out.println("Minimum element: " + min);
	    }
	}