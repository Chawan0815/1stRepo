package SettingAndGettingData;

public class Test {
	public static void main(String[] args) {
        College college = new College(); // Create College object
        Info info = new Info();          // Create Info object

        info.setCollegeInfo(college);    // Set values using Info

        // Get and print values in Test
        System.out.println("Institute Name: " + college.getCollegeName());
        System.out.println("Established Year: " + college.getEstablishedYear());
    } 
}
