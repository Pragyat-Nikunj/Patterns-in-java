public class Trianglepattern {
    public static void main(String[] args) {
        int i, j; 
        // outer loop to handle rows 
        for (i = 0; i < 4; i++) { 
            // inner loop to print spaces. 
            for (j = 4 - i; j > 1; j--) { 
                System.out.print(" "); 
            } 
  
            // inner loop to print stars. 
            for (j = 0; j <= i; j++) { 
                System.out.print("* "); 
            } 
        
            // printing new line for each row 
            System.out.println(); 
        } 
    } 
    }

