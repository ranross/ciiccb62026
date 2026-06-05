public class Task3{
 public static void main(String[] args) {
String a = new String("Wow");
String b = "Wow!";
String c = a;
String d = c;

boolean b1 = a.equals(c);
boolean b2 = !d.equals(b + "!");
boolean b3 = !c.equals(b);

if (b1 && b2 && b3) {
    System.out.println("Success!");
} 
 }
}