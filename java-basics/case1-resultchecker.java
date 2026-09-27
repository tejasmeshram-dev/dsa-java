public class ResultCheck {
    public static void main (String[] args){
        String studentName = "Zun Zun";

        int mathMarks = 90;
        int javaMarks = 95;
        int sqlMarks = 99;

        int totalMarks = mathMarks + javaMarks + sqlMarks;

        int averageMarks = (mathMarks + javaMarks + sqlMarks) / 3;

        boolean result = (averageMarks >= 50 && mathMarks >= 40 && javaMarks >= 40 && sqlMarks >= 40);

        System.out.println("Student Name: " + studentName);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Java Marks: " + javaMarks);
        System.out.println("SQL Marks: " + sqlMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Avergae Marks: " + averageMarks);
        System.out.println("Passed: " + result);
    }
}
