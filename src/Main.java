import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Students Dajon = new Students("D'ajon",20, 2.69, "Brown", "male");
        Students Gaycob = new Students("Jacob", 21, 0.01, "Galactic Aqua Mica", "female");


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the student's First name: ");
        String scName = sc.next();
        System.out.println("Please enter the student's age: ");
        int scAge = sc.nextInt();
        System.out.println("Please enter the student's GPA: ");
        double scGPA= sc.nextDouble();
        System.out.println("Please enter the student's skin color: ");
        String scColor = sc.next();
        System.out.println("Please enter the student's gender: ");
        String scGender = sc.next();

        Students Mystery = new Students(scName, scAge, scGPA, scColor, scGender);
        Dajon.print();
        Gaycob.print();
        Mystery.print();

        System.out.println("Give " + Mystery.name + " a new GPA: ");
        System.out.println("Their GPA was successfully changed to " + Mystery.gpaChange(sc.nextDouble()));
        System.out.println("Time flies in this digital world! Happy birthday to " + Mystery.name + ", they are now " + Mystery.birthday() + " years old!");





    }
}