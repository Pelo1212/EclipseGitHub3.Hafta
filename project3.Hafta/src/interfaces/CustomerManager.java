package interfaces;

public class CustomerManager {
	
	 private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {   //CustomerManager in constructor ında bir tane ICustomerDal istiyorum bu kim olabilir oracle ya da mySql
		this.customerDal= customerDal;                    // bunu gönerdirdim neyle gönderiyorum değişkenle değişkenimi de private a alim.
	}
	
	
	
	
	public void add() {
		//iş kodları
		
		customerDal.add();  //CustomerManager sınıfımın customerDal ı var onun add()metodunu çağırıyorum
}

}
