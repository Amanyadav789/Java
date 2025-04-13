import java.util.*;

public class arrayCompareDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //maximum
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
              max = a[i];  
            }
        }
        
        //minimum
        for(int i=0; i<a.length; i++){
            if(a[i] < min){
              min = a[i];   
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}
