package stringManupulation;

public class Manupulation {

	
	
	
	public static void main (String[] args) {
		String str = "hi this is my java code and i am very happy";
		
		System.out.println(str.length());
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		

		System.out.println(str.indexOf('i', str.indexOf(('i')+1, str.indexOf('i')+1)));
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		
		String b1 = "hi my name is binita and i am using java";
		int tracki = 0;
		int index = 0;
		while (tracki<= 5) {
			index = b1.indexOf('i', index+1);
			
			
			if(tracki ==0) {
				System.out.println("the index of 1st i is :"+ index);
			
			}
			else if(tracki ==1) {
				System.out.println("the index of 2nd i is :"+ index);
			
			}
			else if(tracki ==2) {
				System.out.println("the index of 3rd i is :"+ index);
			}
			else if(tracki ==3) {
				System.out.println("the index of 4th i is :"+ index);
			}
			else if(tracki ==4) {
				System.out.println("the index of 5th i is :"+ index);
			}
			else if(tracki ==5) {
				System.out.println("the index of 6th i is :"+ index);
			}
			
			
			tracki++;
			
			
			
			
		}
		System.out.println("=====================================");
	
	
	
	
	
	}
	
	
}
