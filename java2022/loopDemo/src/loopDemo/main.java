package loopDemo;

public class main {

	//+=2 : tek sayıları bulunur.
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");
		
		int i = 1;
		//while
		while(i<10) {
			System.out.println(i);
			i++; 
			//i+=2 : tek sayilar bulunur
		}
		System.out.println("While döngüsü bitti.");
		
		
		//Do-While
		int j = 1;
		do {
			System.out.println(j);
			j+=2; 
		}while(j<10);
		
		System.out.println("Do-While döngüsü bitti.");
	}

}
