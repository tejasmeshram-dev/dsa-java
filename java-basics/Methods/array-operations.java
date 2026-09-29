public class ArrayOperations {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        numbers[1] = 200;
        numbers[3] = 400;
        System.out.println("");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
