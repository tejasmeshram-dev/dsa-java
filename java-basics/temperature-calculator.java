public class TemperatureConvertor {
    public static void main (String[] args){
        double celsius = 27.7;
        double fahrenheit;

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Celsius : " + celsius);
        System.out.println("Fahrenheit : " + fahrenheit);
    }
}
