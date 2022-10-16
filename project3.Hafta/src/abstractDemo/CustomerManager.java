package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;   // BaseDatabaseMaanager tipimde değişkenimi tanımladım bu değişkenimle aşşada metodu çağırıcam
	                                       // burdaki Base sınıf bizim stratejimiz.Yani siz kullanırkn hangi veri tabanı sistemni verirseniz onun getData()sı çalışcak.
	public void getCustomers() {
		
		databaseManager.getData();         // Çağırdım. neden BaseDatabaseManager i kullandık çünkü diğer sınıfların anası. ANA sınıfım. bağımlılığı azaltıyoruz 
	}

}
