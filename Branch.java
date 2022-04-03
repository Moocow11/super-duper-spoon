import java.util.Scanner;
public class Branch {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favoriteIceCream;

        System.out.println("");
        System.out.println("What is your favorite ice cream flavor?");
        favoriteIceCream=sc.nextLine();
        
        boolean based = favoriteIceCream.equals("cookie dough") || favoriteIceCream.equals("vanilla") 
        || favoriteIceCream.equals("chocolate") || favoriteIceCream.equals("peanut butter") 
        || favoriteIceCream.equals("cookies and cream");

        boolean mid = favoriteIceCream.equals("rocky road") || favoriteIceCream.equals("strawberry")
        || favoriteIceCream.equals("mango") || favoriteIceCream.equals("cotton candy");

        boolean cringe = !(based || mid);

        System.out.println("");
        if (based) {
            System.out.println("Actually Based");
            }
            else if (mid) {
                System.out.println("Eh, mid");
            }
            else if (cringe) {
                System.out.println("What is that? Kinda cringe");
            }
     }}
