    public class MyService {

        static MyEmailNotification myEmailNotif;

        public MyService(MyEmailNotification notif_param) {
            this.myEmailNotif = notif_param;
        }
        public static void main(String[] data) {

            myEmailNotif = new MyEmailNotification();
        
            send("Leonid");
        
            myEmailNotif.generate (data);

        }   
    }     
    
    class MyEmailNotification {
        public void generate(String input) {
            System.out.println ("email sent with data = " + input);
        }
    }
        


