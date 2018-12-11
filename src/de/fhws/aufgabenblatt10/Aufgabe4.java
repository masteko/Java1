package de.fhws.aufgabenblatt10;

import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * Aufgabe4
 */
public class Aufgabe4 {

    public static void main(String[] args) throws IOException{
        String seite = "<body id=\"www‐wikipedia‐org\">"
            + "<div class=\"central‐textlogo\">"
            + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
            + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\""
            + "</div>"
            + "</body>";

            System.out.println(seite);

        int urlStartIndex = seite.indexOf("src=\"");
        String substring = seite.substring(urlStartIndex + 5);
        int urlEndIndex = substring.indexOf("\"");

        String pictureURL = substring.substring(0, urlEndIndex);

        String downloadUrl = pictureURL;
        URL url = new URL(downloadUrl);
        BufferedImage image = ImageIO.read(url);
        ImageIO.write(image, "png", new File("bild.png"));
    }
}