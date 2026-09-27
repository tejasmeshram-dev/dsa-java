public class JobApplicability {
    public static void main(String[] args){
        String applicantName = "Zun zun";
        int applicantAge = 23;
        int yearExperience = 0;
        boolean learningJava = true;
        boolean learningSQL = true;

        boolean eligible = (applicantAge >= 18 && yearExperience >= 1 && learningJava && learningSQL);

        System.out.println("Applicant Name: " + applicantName);
        System.out.println("Applicant Age: " + applicantAge);
        System.out.println("Experience: " + yearExperience);
        System.out.println("Learning java: " + learningJava);
        System.out.println("Learning SQL: " + learningSQL);
        System.out.println("Eligible: " + eligible);
    }
}
