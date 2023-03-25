import java.net.MalformedURLException;

public class HTMLValidator{
   public static void codeVerify() throws MalformedURLException{
        int level = 1;
        int higherLevel= 0;
        String text= "";
        new ListHtml();
        
        for (int i = 0; i < ListHtml.EdListHtml ().size(); i++) 
        {
            String currentline = ListHtml.EdListHtml().get(i);
            if (ColectHtml.isTag(currentline)) {
                if (ColectHtml.identificarFechamentoTag(currentline))
                    level--;
                else
                    level++;                 
            } else 
            {              
                level++;
                if (level > higherLevel) {
                    text = currentline;
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
