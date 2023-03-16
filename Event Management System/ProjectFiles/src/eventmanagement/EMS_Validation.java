
package eventmanagement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EMS_Validation //Creating Validation Class
{
    
    public static String validation(String r,String in)
    {
        Pattern p=Pattern.compile(r);
        Matcher m=p.matcher(in);
            if(m.matches())
            {
                return "VALID";
            }    
    return "INVALID";
    }
}
 //End of Creating Validation Class   

