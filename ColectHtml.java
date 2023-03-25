import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;


public class ColectHtml{

    public String url;

    public ColectHtml(String url) {
        this.url = url;
    }

    public String TransformHTMLToTXT() throws MalformedURLException, IOException {
        URL url = new URL(this.url);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = "";
        FileWriter fw = new FileWriter("./texto.txt");
        PrintWriter pw = new PrintWriter(fw);
        while ((line = reader.readLine()) != null){
            pw.println(line);
        }
        pw.close();
        return line;
    }

    public static boolean isTag(String line)
    {
        return line.strip().substring(0,1).equals("<");
    }
    public static boolean identificarAberturaTag(String line){
        return !line.strip().substring(0,2).equals("</") && line.substring(0,1).equals("<") ;
    } 
    public static boolean identificarFechamentoTag(String line){
        return line.strip().substring(0,2).equals("</");
    } 

}
