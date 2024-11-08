package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ArrayListSample {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		HashMap<String, Integer> h = new HashMap<>();
		LinkedList<String> l = new LinkedList<>();
		
		s.add("shane");
		s.add("adi");
		s.add("red");
		s.add("justin");
		s.add("yan");
		
		System.out.println("Watashi no tomodachi desu\n" + s);
		System.out.println(s.get(3));
		s.remove(0);
		System.out.println("Watashi no tomodachi desu:\n" + s);
		if(!s.isEmpty())
			s.clear();
		
		
		l.add("Anime");
		l.add("Manga");
		l.add("Siya");
		
		System.out.println("\nWatashi no ichiban suki na mono:\n" + l);
		System.out.println(l.get(0));
		l.remove(0);
		System.out.println(l);
		
		if(!l.isEmpty())
			l.clear();
		
		System.out.println(l);
		
		
		
		h.put("yan", 69);
		h.put("adi", 70);
		h.put("red", 71);
		h.put("justin", 72);
		h.put("shane", 73);
		
		System.out.println(h);
		System.out.println(h.get("red"));


		if(h.containsKey("yan"))
			System.out.println(h.get("yan"));
		

	}
}
