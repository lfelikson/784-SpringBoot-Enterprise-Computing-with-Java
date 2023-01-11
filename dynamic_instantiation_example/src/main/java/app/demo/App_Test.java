package app.demo;

public class App_Test {

    Bar aBar = null;
    String service = null;

    public App_Test() {};

    public App_Test (String xyz){
		this.service=xyz;
    }

    public static void main(String args[]) throws Exception{


    String barClassName = args[0];
        System.out.println("Class name to be instantiated is :" + barClassName);
    //    aBar = (Bar) Class.forName(barClassName).getDeclaredConstructor().newInstance();
    
    Bar aBar = (Bar)Class.forName(barClassName).getDeclaredConstructor().newInstance();
    
    aBar.doSomething();  
    
        }
}
