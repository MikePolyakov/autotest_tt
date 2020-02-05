import java.io.IOException;

import com.codeborne.selenide.SelenideElement;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//import javax.swing.text.Document;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class parserString {

        public void parceAndClic(String content) throws IOException {
        Document doc = Jsoup.parse(String.valueOf(content));
        Elements aElements = doc.getElementsByTag("a");
        String href = "";
        for (Element aElement : aElements) {
            href = aElement.attr("href");
        }
//        System.out.println("Ссылка : " + href);
        URL url1 = new URL(href);
//        System.out.println("перевела в url: " + url1);
        open(url1);
    }
}
