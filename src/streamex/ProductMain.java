package streamex;
import java.util.*;
public class ProductMain {
	private List<Product> prdlist;
	public ProductMain() {
		prdlist=new ArrayList<Product>();
		Product p1= new Product(101,"Mouse",8000.0, 3);
		Product p2= new Product(102,"Laptop",90000.0, 2);
		Product p3= new Product(103,"Cloth",2000.0, 1);
		Product p4= new Product(104,"Table",8000.0, 2);
		Product p5= new Product(105,"Chair",7000.0, 2);
		Product p6= new Product(106,"Ipad",50000.0, 2);
		prdlist.add(p6);
		prdlist.add(p5);
		prdlist.add(p4);
		prdlist.add(p3);
		prdlist.add(p2);
		prdlist.add(p1);
		
	}
	
	public void retreiveByPrice()
	{
		prdlist.stream().filter(p->p.getPrice()>20000).forEach(prd->
				System.out.println("Product name is "+prd.getProductname()));
}
	
	public void retreiveByQuantity()
	{
		prdlist.stream().filter(p->p.getQuantity()>1).forEach(prd->
				System.out.println("Product name is "+prd.getProductname()));
}
	public void increaseProduct()
	{
		prdlist.stream()
		.map(p->p.getQuantity()+1).forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		ProductMain pmain=new ProductMain();
		//pmain.retreiveByQuantity();
		//pmain.increaseProduct();
		pmain.countData();
	}
	public void countData()
	{
		long x=prdlist.stream().filter(p->p.getPrice()>20000).count();
		System.out.println("Total products are "+x);
	}
}
