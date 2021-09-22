package pl.javastart.downloader.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Downloader {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.wykop.pl").get();
        List<String> infos = new LinkedList<>();

        Elements h2Elements = document.select("h2");
        for (Element h2 : h2Elements) {
////            wyciągnięcie tekstu z h2
////            String h2Text = h2.text();
////            System.out.println(h2Text);
//
////            wyciągnięcie a z h2 na stronie

            String h2URL = h2.select("a").first().attr("href");
            String text = h2.text();
//            System.out.println(text + ":::" + h2URL);
            infos.add(text);
        }

        List<String> listIt = infos.subList(0,3);
        for (String s : listIt) {
            System.out.println( "tytuł: " + s);
        }
        System.out.println(listIt);



    }
}
