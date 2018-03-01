package ass.alfi.mhw.test;

import java.io.FileReader;
import java.lang.reflect.Array;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import ass.alfi.mhw.objects.Skill;

public class Test {
	final public static String itemsPath = "src\\resources\\lists\\items";
	final public static String skillsPath = "src\\resources\\lists\\skills.json";
	final public static String headPath = "src\\resources\\lists\\headgear.json";
	final public static String chestPath = "src\\resources\\lists\\chestgear.json";
	final public static String gauntletPath = "src\\resources\\lists\\gauntletgear.json";
	final public static String waistPath = "src\\resources\\lists\\waistgear.json";
	final public static String feetPath = "src\\resources\\lists\\feetgear.json";

	public static void main(String[] args) {
		getNames();
		
		
	}
	
	public static JSONObject parseJSON() {
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = null;
		try {
			jsonObject = (JSONObject) parser.parse(new FileReader(skillsPath));
			return jsonObject;
		} catch (Exception e) {
		}
		return jsonObject;
	}

	public static void getNames() {
		JSONObject jsonObject = parseJSON();
		System.out.println(jsonObject.toJSONString());
		System.out.println(jsonObject.get("Critical Element"));
//		String[] jsonArray = (String[]) jsonObject.get("Poison Attack");
//		System.out.println(jsonArray.toString());
	}

}
