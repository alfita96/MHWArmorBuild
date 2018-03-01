package ass.alfi.mhw.quests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Quests {
	private File input;
	private Document doc;
	static final String MAIN = "Main";
	static final String OPTIONAL = "Optional";

	public ArrayList<String> questIterator(String pathname, boolean allMonsters) {
		input = new File(pathname);
		try {
			doc = Jsoup.parse(input, "UTF-8", "");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Element table = doc.select("table > tbody").first();
		Elements td = table.select("tr > td");
		ArrayList<String> quests = new ArrayList<>();
		for (int i = 0; i < td.size(); i++) {
			Element quest = td.get(i);
			// Get type of quest
			int endTag = quest.text().indexOf(']');
			String questType = quest.text().substring(1, endTag);
			if (questType.equals("Assigned")) {
				questType = Quests.MAIN;
			}

			// Get quest level
			int x = quest.text().indexOf(" ");
			int difficulty = Character.getNumericValue(quest.text().substring(x + 1).charAt(0));

			// Get quest name
			int y = quest.text().indexOf(" ", x + 1);
			String questName = quest.text().substring(y + 1);
			int length = 1;
			if (questType.equals(Quests.MAIN)) {
				length = (Quests.OPTIONAL.length() - Quests.MAIN.length()) + 1;
			}

			StringBuffer spaces = new StringBuffer(length);
			for (int s = 0; s < length; s++) {
				spaces.append(" ");
			}

			if (!quests.toString().contains(questName)) {
				quests.add(difficulty + ": [" + questType + "]" + spaces.toString() + questName + "\n");
			}

		}
		if (allMonsters) {
			Collections.sort(quests);
		}
		return quests;
	}

	public ArrayList<String> getMonsterQuest(String monster) {
		System.out.println(monster + " quests:\n");
		ArrayList<String> quests = this.questIterator("src\\resources\\html\\monsters\\" + monster + ".html", false);
		return quests;
	}

	public ArrayList<String> getAllQuests() {
		System.out.println("All quests:\n");
		ArrayList<String> quests = new ArrayList<String>();
		File monsterFolder = new File("src\\resources\\html\\monsters\\");
		File[] monsterFiles = monsterFolder.listFiles();

		for (File file : monsterFiles) {
			if (file.isFile()) {
				for (String quest : this.questIterator(file.getAbsolutePath(), true)) {
					quests.add(quest);
				}
			}
		}

		return quests;
	}
}
