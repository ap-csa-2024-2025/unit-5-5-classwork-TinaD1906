import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create objects and test your classes in here

    //I want to be able to change my objects, BUT I cannot because everything is private 
    Dog myDog = new Dog();
    myDog.setBreed("pitbull");
    System.out.println("your dog is a " + myDog.getBreed());


    p1.setX (5);
    p2.y = 10;
    System.out.println(p1.x + "" + p1.y);
    p2.x = p1.y;


    Scanner sc = new Scanner(System.in);
    Point2D p1 = new Point2D();

    System.out.println("give me two numbers");
    int in_x = sc.nextInt();
    int in_y = sc.nextInt();

    p1.setX(in_x);
    p1.setY(in_y);


    String str = new String("hello");
    Point2D p = new Point2D();

    System.out.println(str);
    System.out.println(p);
  }
}
