import java.util.*;

public class arrayDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the value to search in array");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();

        for(int i=0; i<a.length; i++){
            if(a[i] == x){
                System.out.println("value found at index "+ i);
            }
        }


    }
}
