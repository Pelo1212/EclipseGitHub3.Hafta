package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator= new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();

		
		GameCalculator gameCalculator= new WomanGameCalculator();  //bir operasyona parametre olarak gameCalculator verip istersen woman istresen man istersen kids için ekleyebilirsin
	}                                                              // nu yapı bize ilerde yeni bir özellik eklemek istediğimde yardımcı olur.
	

}
