import java.util.Scanner;
class funct{
    public static void printMyName(String name) {
        System.out.println(name);
        return ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String name = sc.next();
        printMyName(name);
    }

}