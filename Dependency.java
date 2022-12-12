import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class Dependency {
    public static void main(String... args) {                       	
        Dependency depend = new Dependency();
        Printer printer = depend.new Printer();
        printer.print("605.784 class"); 	       
} 

    public class Printer {
        CurrentDate curDate;
        public Printer(){
            curDate = new CurrentDate();
        }
        public void print(String data){
            System.out.println("Hello, " + data + ", printing ... " + curDate.getResult() );
        }
    }

    public class CurrentDate {
        public String getResult (){
            LocalDateTime localDate = LocalDateTime.now();
            DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("MM-dd-YYYY");
            return dateformatter.format(localDate);
        }
    }

}
