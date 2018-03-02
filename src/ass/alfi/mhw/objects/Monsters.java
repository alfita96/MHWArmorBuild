package ass.alfi.mhw.objects;

import java.io.File;

public class Monsters {
	
	public StringBuilder getAllMonsters() {
		StringBuilder monsterList = new StringBuilder();
		File monsterFolder = new File("src\\resources\\html\\monsters\\");
		File[] monsterFiles = monsterFolder.listFiles();
		
		for (File monsterFile : monsterFiles) {
			String fileName = monsterFile.getName().split(".")[0];
			monsterList.append(fileName);
		}
		
		return monsterList;
	}

}
