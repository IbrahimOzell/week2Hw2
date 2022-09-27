package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi = false;
		
		for(int sayi7 : sayilar) {
			if(sayi7==aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if(varMi) {
			mesaj = "Sayı mevcuttur: " + aranacak;
			mesajVer(mesaj);
		}else {
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
