module JSoup.exercise {
    requires org.jsoup;
    requires jid3lib;
    requires java.scripting;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;

    exports pl.javastart.fxbrowser to javafx.graphics;
    opens pl.javastart.fxbrowser to javafx.fxml;
}