package intro;

public class main {

	public static void main(String[] args) {
		System.out.println("hello java!!");
		
		//değişken isimlendirme camelCase şeklindedir
		String ortaMetin = "İlginizi çekebilir!";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade =12;
		
		double dolarDun = 18.15;
		double dolarBugun =19.15;
		
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun) {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hızlı kredi","Halkbanktan","Mutlu emekli"};
		
		//System.out.println(krediler[0]);
		//System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
		

	}

}
