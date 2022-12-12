import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CurrentDate_Impl implements Content_to_Print {
    @Override
    public String getResult (){
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("MM-dd-YYYY");
        return dateformatter.format(localDate);
    }
}