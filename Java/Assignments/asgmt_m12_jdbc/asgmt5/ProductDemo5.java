package asgmt5;

import java.util.Scanner;

public class ProductDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products");
		int n = sc.nextInt();
		int prodCode;
		String prodName, prodCategory;
		float prodPrice;
		ProductDAO pDao = new ProductDAO();
		for(int i=0;i<n;i++) {
			System.out.println("Enter details of product "+(i+1));
			prodCode = sc.nextInt();
			prodName = sc.next();
			prodPrice = sc.nextFloat();
			prodCategory = sc.next();
			Product1 product = new Product1(prodCode, prodName, prodPrice, prodCategory);
			System.out.println(pDao.insertProduct(product)==true ? "Inserted successfully" : "Insert Unsuccessful");
		}
		System.out.println("Enter the product code : ");
		int pCode = sc.nextInt();
		System.out.println(pDao.getProduct(pCode));
		sc.close();
	}

}
