package app.demo;

public class StdOutHello implements Hello {
    
    public StdOutHello () {
        System.out.println("..... I am StdIOutHello constructor ...... ");
    }
    
    @Override
    public void sayHello () {
        System.out.println("StdOutHello says HELLO!!!");
    }
}

