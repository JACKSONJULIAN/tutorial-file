package file;
import java.util.*;
public class Lambda1 
{
public static void main(String[] args) {
	
	List <String> list =new ArrayList <String> ();
	list.add("rick");
	list.add("jasmine");
	list.add("carel");
	list.forEach((names) ->{
		System.out.println(names);
	});
	list
	.stream()
//	.filter(s-> s.startWith("c"))
	.map(String::toUpperCase)
	.sorted();
	list.forEach(System.out::println);
	
}
}
