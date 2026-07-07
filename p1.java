public class StudentProfile {
    String name;
    long prn;

    public StudentProfile(String n, long p) {
        name = n;
        prn = p;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", PRN: " + prn);
    }

    public static void main(String[] args) {
        StudentProfile s1 = new StudentProfile("Ali Mehdi Jafri", 25070122031L);
        s1.displayDetails();
    }
}