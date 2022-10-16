package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager= new OracleDatabaseManager();
		customerManager.getCustomers(); // customerManager da getCustomer metodu databaseManager la getData() yı çağırıyor getData() abstract bir metod yani böylece kullanamayız tek başına
		                                //o yüzden 8.satırda stratejimizi belirledik.customerManagerın databaseManager ı =new racle dır yada sql dir. sistem senin yazdığına göre çalışır yani.
	}

}
