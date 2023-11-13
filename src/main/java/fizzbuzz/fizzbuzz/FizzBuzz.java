package fizzbuzz.fizzbuzz;
import java.util.Scanner;

public class FizzBuzz {
	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	boolean ivin = true;
    	int uinint = -1;
    	
	    System.out.print("Please enter a positive value to play Fizz Buzz up to: ");
	   	String uin = in.nextLine();
	   	
	   	
	   	try {
    		uinint = Integer.parseInt(uin);
	
        	if (uinint <= 0) {
        		System.out.printf("\"%d\" is not a valid input for Fizz Buzz.%n", uinint);
        		System.exit(0);
        	}
        	else {
        		ivin = false;
        	}
        	
    	}
    	catch (NumberFormatException e) {
    		System.out.printf("\"%s\" is not a valid input for Fizz Buzz.%n", uin);
    		System.exit(0);
    	}
	   	
	   	String[] fb = fizzbuzz(uinint);
    	
	   	for (int i = 0; i < uinint; i++) {
	   		String o = fb[i];
	   		String c = "";
		   	if (i+1 < uinint) {
				c = ",";
			}
			
			System.out.printf("%s%s ", o, c);
			
			if ((i+1) % 10 == 0) {
				System.out.printf("%n");
			}
			else if ((i+1) % 10 != 0  && (i+1) == uinint) {
				System.out.printf("%n");
			}
	   	}

    	System.out.printf("%nThe game has been completed.%n");
    }
    
    public static String[] fizzbuzz(int i) {
    	String[] out = new String[i];
    	
    	for (int ii = 1; ii < i + 1; ii++) {
    		String o = "";
    		String c = "";
    		
    		if (ii % 15 == 0) {
    			o = "Fizz Buzz";
    		}
    		else if (ii % 5 == 0) {
    			o = "Buzz";
    		}
    		else if (ii % 3 == 0) {
    			o = "Fizz";
    		}
    		else {
    			o = String.format("%d", ii);
    		}
    		
    		out[ii-1] = o;
    	}
    	
    	return out;
    }
    
}
