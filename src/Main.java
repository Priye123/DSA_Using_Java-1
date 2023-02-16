import java.util.Scanner;

class Animals {

	int eyes;// feature
	int nose;
	int legs;
	
	public Animals(int eyes, int nose, int l) {
		this.eyes = eyes;
		this.nose = nose;
		legs = l;
	}

}

class Main {

	public static void main(String[] args) {
		// creating object st of Main class
		Animals manbir = new Animals(2,1,2); //paramterized //default //user-defined
		System.out.println(manbir.eyes + " " + manbir.legs + " " + manbir.nose);
		
		Animals horse=new Animals(2,1,4);
		System.out.println(horse.eyes+" "+horse.legs+" "+horse.nose);
	}
}