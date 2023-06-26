import java.util.Scanner;
class arpr3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt();
    int marks [] = new int[size];
    for (int i =0;i<=size;i++) {
        marks[i] = sc.nextInt();
        
    }
    int x = sc.nextInt();
    for (int i =0;i<size;i++) {
        if (x==marks[i]) {
            System.out.println("x found at index:"+i);
        }

    }


   } 
}