package aplication;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int num = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for (int i = 1; i<=num; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char answer = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (answer == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else if (answer == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manuFactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manuFactureDate));
			}
			else {
				list.add(new Product(name, price));
			}
			
		}
	
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product c : list) {
			System.out.println(c.priceTag());
		}
		
		sc.close();

	}

}
