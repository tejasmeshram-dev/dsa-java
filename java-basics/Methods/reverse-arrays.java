import java.util.Arrays;
public class ReverseArray {
    public static int[] reverseArray(int[] n){
        int[] reversed = new int[n.length];
        int j=0;
        for(int i=n.length-1;i>=0;i--){
            reversed[j] = n[i];
            j++;
        }
        return reversed;
    }
    public static void main(String args []){
        int []numbers={1,2,3,4,5,6};
        int[] result = reverseArray(numbers);
        System.out.println(Arrays.toString(result));
    }
}
