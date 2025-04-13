import java.util.*;

public class twoDArray {
    public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the size of 2D Array :");
           int m = sc.nextInt();
           int n = sc.nextInt();

           System.out.println("Array created successfully of size " + m +" * " + n);

           int[][] demo = new int[m][n];
           
           System.out.println("Enter the values :");
        
           for(int i=0; i<m; i++){
               for(int j=0; j<n; j++){
                Scanner sc1 = new Scanner(System.in);
                demo[i][j] = sc1.nextInt();
               }
            System.out.println();
           }

           System.out.println("2D Array Created by you :");

           for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
             System.out.print(demo[i][j]+" ");
            }
            System.out.println();
          }
    }
}
