package interfaces;

public class Main {

	public static void main(String[] args) {
		ICustomerDal customerDal=new OracleCustomerDal();  //interface ler referans tutma özelliğine sahiptir.
		customerDal.add();

		CustomerManager customerManager= new CustomerManager(new OracleCustomerDal());
		//customerManager.customerDal=new OracleCustomerDal(); //new MySqlCustomerDal(); Programcı bu satırı yazmayı unutabilir. o yüzden unutamayacağı bir yapıya çekmek lazım 
		                                                                               //customerManager sınıfında 7. satıra git bak. ARTIK BU SATIRA GEREK YOK.AMA 9.SATIRDA PARAMETRE MUTLAKA YAZMAN LAZIM.
		customerManager.add();
	}

}

// ınterface lerde abstract lar gibi new lenemez ama interface onu implemente eden classın referansını tutabilir yanibu ne demk?
//o classı new leyebilir demek (satır6).
//interfaceler implementasyon kabul edilir inheritance kabul edilmiyor. Bir class birden fazla interface'i implemente edebilir.

