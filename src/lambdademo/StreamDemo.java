package lambdademo;
import java.util.*;
public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> data=new ArrayList<Integer>();
		data.add(20);
		data.add(50);
		data.add(10);
		data.add(40);
		data.add(35);
		//we need to display all values which is greater than 20
		for(Integer i:data) {
			if (i>20)
			{
				System.out.println(i);
			}
		}
		System.out.println("With Stream");
		data.stream().filter(x->x>25).forEach(str->System.out.println("String is "+str));
		
	}

}