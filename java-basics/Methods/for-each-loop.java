public class ForEachLoop {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        for(int number : numbers){
            System.out.println(number);
        }
        String name = "ZUNE";
        System.out.println("Array elements: "+numbers.length);
        System.out.println("String characters: "+name.length());
    }
}
