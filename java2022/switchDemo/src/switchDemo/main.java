package switchDemo;

public class main {

	public static void main(String[] args) {
		char grade = 'a';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("Mükemmel : geçtiniz.");
			break;
		case 'B':
			System.out.println("Çok güzel : geçtiniz.");
			break;
		case 'C':
			System.out.println("Fena değil : geçtiniz.");
			break;
		case 'D':
			System.out.println("Maalesef Kaldınız.");
			break;
		default:
			System.out.println("Geçersiz bir not girdiniz.");
			
		}

	}

}
