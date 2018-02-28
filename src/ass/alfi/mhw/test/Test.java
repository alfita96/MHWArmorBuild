package ass.alfi.mhw.test;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Test {
	final public static String itemsPath = "src\\items";
	final public static String skillsPath = "src\\skills.json";
	final public static String headPath = "src\\headgear.json";
	final public static String chestPath = "src\\chestgear.json";
	final public static String gauntletPath = "src\\gauntletgear.json";
	final public static String waistPath = "src\\waistgear.json";
	final public static String feetPath = "src\\feetgear.json";
	
	public static void main(String[] args)  {
		JSONParser parser = new JSONParser();
		JSONArray jsonArray;
		JSONObject jsonObject;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader(headPath));
//			System.out.println(jsonArray);
			
//			for (Object o: jsonArray) {
//				System.out.println(o);
//			}
//			Iterator iterator = jsonArray.iterator();
//			while (iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
			System.out.println(jsonArray.size());
			for(int i = 0; i < jsonArray.size(); i++) {
				jsonObject = (JSONObject) jsonArray.get(i);
				JSONObject materials = (JSONObject) jsonObject.get("materials");
//				System.out.println(materials.toString());
				JSONObject materials1 = (JSONObject) materials.get("materials1");
				JSONObject materials2 = (JSONObject) materials.get("materials2");
				JSONObject materials3 = (JSONObject) materials.get("materials3");
				JSONObject materials4 = (JSONObject) materials.get("materials4");
				System.out.println((String) materials1.get("name"));
				System.out.println((String) materials2.get("name"));
				System.out.println((String) materials3.get("name"));
				System.out.println((String) materials4.get("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
