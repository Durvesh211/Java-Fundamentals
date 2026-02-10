package module.one.util;

import java.util.ArrayList;
import java.util.List;

public class Stream_2 {
	public static void main(String[] args) {

	List<String> placesToVisit= new ArrayList<String>();
	placesToVisit.add("Chicago");
	placesToVisit.add("Venice");
	placesToVisit.add("Tokyo");
	placesToVisit.add("San Francisco");
	placesToVisit.add("Kyoto");
	placesToVisit.add("Abu Dhabi");
	placesToVisit.stream().filter(x->x.length()==6).forEach(z-> System.out.println(z));
	//filter(place -> place.length() == 5).forEach(x -> System.out.println(x));


	}
}
