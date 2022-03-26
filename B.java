import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String email; 
        String address;
        System.out.println("Enter Your Name");
        name=sc.nextLine();
        System.out.println("Enter Your age");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Email");
        email=sc.nextLine();
        System.out.println("Enter Your Address");
        address=sc.nextLine();
        System.out.println("");
        System.out.println("\u001b[31mYour Name\u001b[39m: "+name);
        System.out.println("Your Age: "+age);
        System.out.println("Your Email: "+email);
        System.out.println("Your Address: "+address);

       
}
}