package ass.alfi.mhw.test;

import ass.alfi.mhw.armor.head.Head;

public class Test {
	final public static String itemsPath = "src\\resources\\lists\\items";
	final public static String skillsPath = "src\\resources\\lists\\skills.json";
	final public static String headPath = "src\\resources\\lists\\headgear.json";
	final public static String chestPath = "src\\resources\\lists\\chestgear.json";
	final public static String gauntletPath = "src\\resources\\lists\\gauntletgear.json";
	final public static String waistPath = "src\\resources\\lists\\waistgear.json";
	final public static String feetPath = "src\\resources\\lists\\feetgear.json";

	public static void main(String[] args) {
		new Head().getNames();
	}

}
