package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,  " Lenovo V14", 15000 ,"16 GB Ram"); //referans oluþturma, intance
		
		
		Product product2 = new Product(); 
		product2.id =2;
		product2.name =" Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";
		
		Product product3 = new Product(); 
		product3.id =3;
		product3.name =" Hp 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";
		
		
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			
			System.out.println(product.name);
		}
		
		
		System.out.println(products.length);
		
		Catagory catagory1 = new Catagory();
		catagory1.id =1;
		catagory1.name = "Bilgisayar";
		
		Catagory catagory2 = new Catagory();
		catagory2.id = 2;
		catagory2.name = "ev/bahçe";
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);

	}

}
