
package questão1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;


public class ValidarData {
    public static boolean isDateValid(String strDate) {
    String dateFormat = "dd/MM/uuuu";

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat).withResolverStyle(ResolverStyle.STRICT);
    try {
        LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
        return true;
    } catch (DateTimeParseException e) {
       return false;
    }  
   }
}