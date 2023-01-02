package app.demo;
import java.lang.reflect.*;

class NewInstanceDemo{
    public NewInstanceDemo(){
        System.out.println("Default constructor");
    }
    public NewInstanceDemo(int a, long b){
        System.out.println("Two parameter constructor : int,long => "+a+":"+b);
    }
    public NewInstanceDemo( int a, long b, String c){
        System.out.println("Three parameter constructor : int,long,String => "+a+":"+b+":"+c);
    }
    public static void main(String args[]) throws Exception {

        NewInstanceDemo object = (NewInstanceDemo)Class.forName("app.demo.NewInstanceDemo").getDeclaredConstructor().newInstance();

        Constructor constructor1 = NewInstanceDemo.class.getDeclaredConstructor( new Class[] {int.class, long.class});
        NewInstanceDemo object1 = (NewInstanceDemo)constructor1.newInstance(new Object[]{1,2});

        Constructor constructor2 = NewInstanceDemo.class.getDeclaredConstructor( new Class[] {int.class, long.class, String.class});
        NewInstanceDemo object2 = (NewInstanceDemo)constructor2.newInstance(new Object[]{1,2, "605.784 course"});

    }
}