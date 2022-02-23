package amazon;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Test {
	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {
	
		LinkedList<String> list = new LinkedList<>();
		list.add("ADDD1234");
		list.add("VDDD1234");
		list.add("XDDD1234");
		list.add("ZDDD1234");
		list.add("BDDD1234");
		list.add("MDDD1234");
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("HDDD1234");
		list1.add("N/A");
		list1.add("XDDD1234");
		list1.add("N/A");
		list1.add("BDDD1234");
		list1.add("N/A");
		LinkedList<String> list11 = new LinkedList<>();
		for (int i = 0; i < list.size(); i++) {
			JSONObject jo = new JSONObject();
			Map m = new LinkedHashMap();
			JSONArray ja = new JSONArray();
			String string = list.get(i);
			String string1 = list1.get(i);

			 m = new LinkedHashMap(1);
			 m.put("tr_number", string);
			ja.add(m);

			if (string1 != "N/A") {
				 m = new LinkedHashMap(1);
				 m.put("tr_number", string1);
				ja.add(m);
			}
			jo.put("tr_number", ja);
			String string2 = jo.toString();
			list11.add(string2);
		}
		System.out.println("list11 : " + list11);
	}
}
