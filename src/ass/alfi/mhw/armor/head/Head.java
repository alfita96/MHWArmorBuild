package ass.alfi.mhw.armor.head;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Head {
	final private static String path = "src\\resources\\lists\\headgear.json";

	public JSONArray parseJSON() {
		JSONParser parser = new JSONParser();
		JSONArray jsonArray = null;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader(path));
			return jsonArray;
		} catch (Exception e) {
		}
		return jsonArray;
	}

	public void getNames() {
		JSONArray jsonArray = parseJSON();
		JSONObject jsonObject = new JSONObject();
		for (int i = 0; i < jsonArray.size(); i++) {
			jsonObject = (JSONObject) jsonArray.get(i);
			String name = (String) jsonObject.get("name");
			System.out.println(name);
		}
	}
	
}
