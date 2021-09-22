package pl.javastart.downloader.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class DownloaderExercise {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://example.com").get();
        String h1Text = document.select("h1").text();
        String pText = document.select("p").first().text();

        System.out.println("tekst w h1 : " + h1Text);
        System.out.println("tekst w pierwszym p : " + pText);
    }
}
