package staticDemo;

public class ProductValidator {  // bir ürünü kaydederken güncellerken kurallara uygun olup olmadığını bulmak için kullanırız.

	 public static boolean isValid(Product product) {        // bir methodu static yaptığımızda class ismiyke direk çağrılır.static değilse new'lemen lazım kullanmak için
		 
		 if(product.price>0 && !product.name.isEmpty()) {  
			 return true;
	 }
		 else {
			 return false;
		 }
		 
	 }
}
