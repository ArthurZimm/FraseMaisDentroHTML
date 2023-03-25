import java.net.MalformedURLException;

public class HTMLValidator{
   public static void codeVerify() throws MalformedURLException{
        int level = 1;
        int higherLevel= 0;
        String text= "";
        new ListHtml();
        
        for (int i = 0; i < ListHtml.EdListHtml ().size(); i++) 
        {
            String linhaAtual = ListHtml.EdListHtml().get(i);
            if (ColectHtml.isTag(linhaAtual)) {
                if (ColectHtml.identificarFechamentoTag(linhaAtual))
                    level--;
                else
                    level++;                 
            } else 
            {              
                level++;
                if (level > higherLevel) {
                    text = linhaAtual;
                    higherLevel = level;
                }
                level--;
            }
        }
        if (level != 1) {
            System.out.println("Malformed HTML"); 
        }
        System.out.println("text mais profundo: " + text.strip());
    
        }
}
