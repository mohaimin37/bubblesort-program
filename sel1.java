public class sel1 {
    public static void main(String[] args) {
        int flag; 
        int temp =0;
        int a [] = {38,52,9,18,6,63,13} ;
        for (int i =0; i<a.length;i++) {
             for (int j =i+1;j<a.length; j++) {
                if (a[i]<a[j]) {
                    //swap
                    temp = a[i];
                    a[i] =a[j];
                    a[j] = temp;

                }
             }
        }

        for (int i =0;i<a.length;i++) {
            System.out.print(a[i] +" ");
        }
    }
}
