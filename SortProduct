import java.util.Arrays;

public class SortProduct {
	public static void main(String[] args) {
		Product[] product = new Product[3];
		product[0] = new Product("A", 11);
		product[1] = new Product("Z", 13);
		product[2] = new Product("X", 10);
		
		System.out.println("[comparaTo sort productNum]");
		
		Arrays.sort(product);
		printProduct(product);
		System.out.println("[comparaTo sort productName]");
		Arrays.sort(product, new ProductNameComparator());
		printProduct(product);
	}
	public static void printProduct(Product[] product) {
		for(Product z : product) {
			System.out.println(z);
		}
	}
}
