package javaappdateafter03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaAppDateAfter03 {

    
    public static void main(String[] args) throws ParseException {
      
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Date data1 = sdf.parse("01/02/2020");
        Date data2 = sdf.parse("20/02/2020");
        
        System.out.println("Data1 é apos data2?: " + data1.after(data2));
        
        
    }
    
}
