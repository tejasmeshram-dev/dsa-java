public class AgeCheck {
    public static boolean isAdult(int age){
            return age>=18;
    }
    public static void main(String[] args){
        boolean result = isAdult(10);
        System.out.println("Is the person an adult? : "+result);
    }
}
