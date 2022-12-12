static class EmailNotif {
    public void sendEmail() {
            System.out.println("Email is sent !!!");
        }
}

public class My_Service {

    EmailNotif enotif;
 
    public My_Service (EmailNotif param) {
        this.enotif = param;
    }

    public static void main(String args[]) {
        My_Service ms = new My_Service(EmailNotif param);
        enotif.sendEmail();    
    }
}
