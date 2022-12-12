public class IoC {

    public static void main (String[] args) {
        IoC container = new IoC();

        User me = container.new User();

        me.add ("Leonid");
    }
    
    public class User {
        MySQLDatabase database;

        public User(){
            database = new MySQLDatabase();

        }

        public void add(String data){
                database.persist(data);
        }
    }

    public class MySQLDatabase {
        public void persist(String data){
            System.out.println("My SQL database has persisted data" + data);    
        }
    }
}
