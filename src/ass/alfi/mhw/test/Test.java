package ass.alfi.mhw.test;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

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

	public static void main(String[] args) throws IOException {
//		System.out.println(getSkillProperties(Skill.ATTACKBOOST.getSkill()));
	}

	public static JSONArray parseJSON() {
		JSONParser parser = new JSONParser();
		JSONArray jsonArray = null;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader(skillsPath));
			return jsonArray;
		} catch (Exception e) {
		}
		return jsonArray;
	}

	public static JSONObject getSkillProperties(String skill) throws IOException {
		JSONArray jsonArray = parseJSON();
		JSONObject jsonObject = new JSONObject();
		JSONObject skillObject = new JSONObject();
		for (int i = 0; i < jsonArray.size(); i++) {
			jsonObject = (JSONObject) jsonArray.get(i);
			skillObject = (JSONObject) jsonObject.get(skill);
			if (skillObject != null) {
				return skillObject;
			}
		}
		return skillObject;
	}

}
