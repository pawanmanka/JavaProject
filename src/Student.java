public class Student {
    static int age = 34;
    static String name = "Pawan Manka";
    public static void display(){
        System.out.println("My name is "+name+".I am "+age+" years old");
    }
    public static void sayHello(String from, String to){
        System.out.println(from+" says hello to "+to);
    }
    public static void main(String[] args) {
        display();
        sayHello("Sam","William");
    }

}