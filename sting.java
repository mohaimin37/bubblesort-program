import java.util.Scanner;
class sting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter name1 :");
        String name1 = sc.next();
        System.out.print("enter name2 :");
        String name2 = sc.next();

        if (name1.length()<name2.length()) {
            System.out.println("name 2 is greater" + "ie name 1 is smaller");
        }
        else {
            if (name1.length()>name2.length()) {
                System.out.println("name 1 is greater"+ "ie name 2 is smaller");

                
            }
            if (name1.length()==name2.length()) {
                System.out.println("both name are equal");
            }
        }
       

    }
}
