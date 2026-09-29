public class MultiParameterMethod {
    public static void introduce(String name, int age, String skill){
        System.out.println("Name: "+name );
        System.out.println("Age: "+age);
        System.out.println("Skill: "+skill);
    }
    public static void main(String[] args){
        introduce("Zun",23,"Java");
    }
}
