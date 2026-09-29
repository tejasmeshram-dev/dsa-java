public class GradeCakculator {
    public static char inGrade(int marks){
        if(marks>=90)
            return 'A';
        else if(marks>=75)
            return 'B';
        else if(marks>=60)
            return 'C';
        else if(marks>=40)
            return 'D';
        else
            return'F';
    }
    public static void main(String[] args){
        char grade= inGrade(82);
        System.out.println(grade);
    }
}
