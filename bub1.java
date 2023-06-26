public class bub1 {
public static void main(String[] args) {
    int a [] = {19,36,29,12,5};
    int temp;
    for (int i = 0; i<a.length-1;i++) {
        for (int j =0;j<a.length-1-i;j++) {
            if (a[j]>a[j+1]) {
                //swap
                temp = a[j];
                a[j] =a[j+1] ;
                a[j+1] =temp;
            }
        }
    }
    for (int i= 0;i<a.length;i++) {
        System.out.print(a[i] + " ");
    }
}
}
