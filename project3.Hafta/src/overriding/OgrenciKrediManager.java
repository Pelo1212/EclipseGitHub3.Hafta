package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	
	public double hesapla(double tutar) {      // burda override yapıyorum metodun üstüne yazmak.
		return tutar*1.10;                     //Eğer metod final metodsa ezemezsin.kullanıcaksan olduğu gibi kullanıcaksın.
	}

}
