public class function {
    
    public static void prime(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count +=1;
            }
            
        }
        if(count > 2){
            System.out.println("not prime");
        }
        else{
            System.out.println("Prime");
        }
    }
    public static void main(String args[]){
             prime(10);
    }
}
