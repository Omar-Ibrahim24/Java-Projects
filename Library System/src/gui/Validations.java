package gui;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {



   public static int Name_Validation(String name)
    { 
    if(name.length()<6||name.length()>30)
    {
            return -1;
    }
    
for( int i=1;i<name.length();i++)
{
    if(Character.isJavaIdentifierStart(name.charAt(0))!=true || Character.isJavaIdentifierPart(name.charAt(i))!=true)
       return 0;
}
return 1;
    }


    public static boolean NumberValidation(String number) {
         boolean check=true;
        String tokens[]=number.split(number);
        for(int i=0;i<number.length();i++)
        {
            char s=number.charAt(i);
        if(Character.isDigit((s))==false)
        { check =false;
           break;
        }
        }
        return check;
        
        
        
        
    }
 public static boolean EmailValidation(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    

    

    public static void main(String[] args) {
    }
}

