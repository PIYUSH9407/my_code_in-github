package star_pettran;

public class prectice_star {
    public static void main(String[] args) {
    	System.out.println("first pattern");
    	for(int i=1;i<=4;i++) {
    		for(int j=1;j<=4;j++) {
    			if(j<=i) {
    				System.out.print("*");
    			}
    		}
    		System.out.println(" ");
    	}
    	System.out.println("________________");
    	System.out.println("________________");
    	for(int i=1;i<=4;i++) {
   		   for(int j=1;j<=4;j++) {
   			   if(j>=5-i) {
   				   System.out.print("*");
   			   }
   		   }
   		   System.out.println(" ");
    	}
    }
} 
   			   
   		  
    	

    
    
    

				
			
			
		