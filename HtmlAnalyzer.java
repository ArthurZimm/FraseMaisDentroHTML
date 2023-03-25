import java.io.IOException;
import java.net.MalformedURLException;

public class HtmlAnalyzer {
    public static void main(String[] args) throws MalformedURLException, IOException {
        try {
            String url_console = args[0];
           ColectHtml url = new ColectHtml(url_console);
            url.TransformHTMLToTXT();
            HTMLValidator.codeVerify();
        } catch (Exception e) {
            System.out.println("Algum Problema ocorreu!, Talvez o site não esteja corretamente nos parametros solicitados.");
        }
    }
}

