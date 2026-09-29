import java.util.Arrays;
public class Task{
    public static void main(String[] args){
        int[ ]numbers = new int[5];
        int[] reversed = new int[numbers.length];
        numbers[0]=10;
        numbers[2]=21;
        numbers[1]=12;
        numbers[3]=67;
        Arrays.sort(numbers);
        for(int number:numbers){
            System.out.print(number+" ");
        }
        numbers[3]=17;
        System.out.println("");
        for(int i=0;i<numbers.length;i++){
            reversed[numbers.length-1-i] = numbers[i];
        }
        System.out.print(Arrays.toString(reversed));
    }
}
