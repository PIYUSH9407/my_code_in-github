package star_pettran;

public class start1 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {        // Outer loop for the number of rows
            for(int j=1; j<=4; j++) {    // Inner loop for each column in a row
                if(j >= i) {              // Print '*' only if the column number is greater than or equal to the row number
                    System.out.print("*");
                }
            }
            System.out.println(" ");     // Move to the next line after printing a row
        }
    }
}
