package javaapplication2;

public class JavaApplication2 {

   
    public static void main(String[] args) {
            Quavo Quavoobj = new Quavo();
            Quavo Quavoobj2 = new Quavo(5);
            Quavo Quavoobj3= new Quavo(5,13);
            Quavo Quavoobj4 = new Quavo(5,13,40);
            
            System.out.printf("%s\n", Quavoobj.tomilitary());
            System.out.printf("%s\n", Quavoobj2.tomilitary());
            System.out.printf("%s\n", Quavoobj3.tomilitary());
            System.out.printf("%s\n", Quavoobj4.tomilitary());
    }
    
}
