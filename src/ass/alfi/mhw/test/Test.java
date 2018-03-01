package ass.alfi.mhw.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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

	public static void main(String[] args) throws IOException {
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

	public static void getNames() throws IOException {
		String line = null;
		line = Files.readAllLines(Paths.get(skillsPath)).get(2);
		File tmp = File.createTempFile("tmp", "");

		BufferedReader br = new BufferedReader(new FileReader(skillsPath));
		BufferedWriter bw = new BufferedWriter(new FileWriter(tmp));
		
		bw.write("value1");
	}

}
