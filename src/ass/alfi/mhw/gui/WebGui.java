package ass.alfi.mhw.gui;

import java.io.IOException;

import ass.alfi.mhw.quests.Quests;

public class WebGui {

	public static void main(String[] args) throws IOException {
		Quests monsterQuests = new Quests();
//		for (String quest : monsterQuests.getMonsterQuest("Anjanath")) {
//			System.out.println(quest);
//		}
//		for (String quest : monsterQuests.getMonsterQuest("Bazelgeuse")) {
//			System.out.println(quest);
//		}
		for (String quest : monsterQuests.getAllQuests()) {
			System.out.println(quest);
		}
	}
}
