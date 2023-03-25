import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ListHtml {
    public static ArrayList<String> EdListHtml(){
        ArrayList<String> aux = new ArrayList<String>();
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader("./texto.txt"));
            Scanner scan = new Scanner(buffRead);
            String lines = "";
            while(scan.hasNextLine()){
                lines = scan.nextLine();
                aux.add(lines);
            }
            scan.close();
            }catch (Exception e) {
                System.out.println("Erro ao colocar na lista!");
            }
            return aux;
    }
}
