package ass.alfi.mhw.test;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Test {
	final public static String itemsPath = "src\\resources\\lists\\items";
	final public static String skillsPath = "src\\resources\\lists\\skills.json";
	final public static String headPath = "src\\resources\\lists\\headgear.json";
	final public static String chestPath = "src\\resources\\lists\\chestgear.json";
	final public static String gauntletPath = "src\\resources\\lists\\gauntletgear.json";
	final public static String waistPath = "src\\resources\\lists\\waistgear.json";
	final public static String feetPath = "src\\resources\\lists\\feetgear.json";
	
	public static void main(String[] args)  {
		JSONParser parser = new JSONParser();
		JSONArray jsonArray;
		JSONObject jsonObject;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader(headPath));
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
