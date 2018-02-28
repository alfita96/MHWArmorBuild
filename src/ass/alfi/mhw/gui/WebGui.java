package ass.alfi.mhw.gui;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebGui {

	public static void main(String[] args) throws IOException {
		File input = new File("src\\resources\\html\\monsters\\anjanath.html");
		Document doc = Jsoup.parse(input, "UTF-8", "");
		Element table = doc.select("table > tbody").first();
		Elements td = table.select("tr > td");
		for (Element quest : td) {
			int i = quest.text().indexOf(" ");
			int y = quest.text().indexOf(" ", i+1);
			System.out.println(quest.text().substring(y+1));
		}
	}
}
