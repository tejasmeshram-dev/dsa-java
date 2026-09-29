public class PrimeNumber {
    public static boolean isPrime(int a){
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count+=1;
            }
        }
        if(count==2)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        boolean result= isPrime(27);
        System.out.println("Is the number prime? "+result);
    }
}
