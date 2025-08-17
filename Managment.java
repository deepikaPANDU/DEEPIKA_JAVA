import java.util.Scanner;
class Managment{
    String institute;
    public Managment(){
        System.out.println("Annamacharya University");
    }
}
class school extends Managment {
    String name;
    int age;
    String id;
    int marks;
    void display(String n, int a, String i, int m) {
        name = n;
        age = a;
        id = i;
        marks = m;
        System.out.println(name + " " + age + " " + id + " " + marks);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        school s=new school();
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the id ");
        String id = sc.nextLine();
        System.out.println("Enter the marks ");
        int marks = sc.nextInt();
        s.display(name, age, id, marks);
        sc.close();



    }
}
