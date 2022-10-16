package abstractClasses;

public abstract class GameCalculator {
	public abstract void  hesapla ();           // abstract metodumu bu abstact classı extends eden tüm sınıflarda override etmek zorundayım.
		
	
     
	public final void gameOver() {                   // abstact sınıdımda final metodum var bu metod diğer classlarda aynen kullanılabilir override edilemez
		System.out.println("oyun bitti");
		}
}
