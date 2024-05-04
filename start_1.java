package star_pettran;

public class start_1 {
	public static void main (String[] arg){
//		int row=5;
//		int col=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j>=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
		System.out.println("________Next star pattern________________");
		for(int i=1;i<=3;i++) {
			for(int j=3;j>=1;j--) {
				if(j>=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		
		System.out.println("____________________next star pattern__________________________");
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				if(j>=4-i && j<=i+2) 
					System.out.print("*");
				
				else 
					System.out.print(" ");
				
			}
			System.out.println(" ");
		}
		
	}
	
	

}
