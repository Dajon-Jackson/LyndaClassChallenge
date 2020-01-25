import java.awt.*;
public class Students {
    String name;
    int age;
    double gpa;
    String skinColor;
    String gender;

    public Students(String inputName, int inputAge, double inputGPA, String inputSkinColor, String inputGender)
    {
        this.name = inputName;
        this.age = inputAge;
        this.gpa = inputGPA;
        this.skinColor = inputSkinColor;
        this.gender = inputGender;
    }
    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("GPA : " + this.gpa);
        System.out.println("Skin Color : " + this.skinColor);
        System.out.println("Gender : " + this.gender + "\n");

    }
    public double gpaChange(double newGPA){
        this.gpa = newGPA;
        return gpa;
    }
    public int birthday(){
        this.age += 1;
        return age;
    }

}
