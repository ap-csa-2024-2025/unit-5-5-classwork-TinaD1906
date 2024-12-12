import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Person p = new Person();
    System.out.println("Enter the person's first name:");
    String firstName = sc.nextLine();

    System.out.println("Enter the person's last name:");
    String lastName = sc.nextLine();

    System.out.println("Enter the person's age:");
    int age = sc.nextInt();

    System.out.println("Enter the person's SSN:");
    int ssn = sc.nextInt();

    p.setFirstname(firstName);
    p.setLastname(lastName);
    p.setage(age);
    p.setsssn(ssn);

    System.out.println()



    // Create objects and test your classes in here

    //I want to be able to change my objects, BUT I cannot because everything is private 
    //Dog myDog = new Dog();
    //myDog.setBreed("pitbull");
    //System.out.println("your dog is a " + myDog.getBreed());


    //p1.setX (5);
    //p2.y = 10;
    //System.out.println(p1.x + "" + p1.y);
    //p2.x = p1.y;


    //Scanner sc = new Scanner(System.in);
    //Point2D p1 = new Point2D();

    //System.out.println("give me two numbers");
    //int in_x = sc.nextInt();
    //int in_y = sc.nextInt();

    //p1.setX(in_x);
    //p1.setY(in_y);


    //String str = new String("hello");
    //Point2D p = new Point2D();

    //System.out.println(str);
    //System.out.println(p);
  }
}
