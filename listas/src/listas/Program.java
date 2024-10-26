package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("vitor");
		list.add("sonia");
		list.add("lucas");
		list.add("samuel");
		list.add("andressa");
		list.add("amanda");
		list.add("ana");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------------------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println(list.size());
		
		
	}
}
