package Trial;

import java.util.ArrayList;
import java.util.List;

public class Stream_1 {
	public static void main(String[] args) {
		
	
	List<String> placesToVisit= new ArrayList<String>();
	placesToVisit.add("Chicago");
	placesToVisit.add("Venice");
	placesToVisit.add("Tokyo");
	placesToVisit.add("San Francisco");
	placesToVisit.add("Kyoto");
	placesToVisit.add("Abu Dhabi");
	placesToVisit.stream().map(place -> place.toUpperCase()).forEach(place -> System.out.println(place));
	}

}
