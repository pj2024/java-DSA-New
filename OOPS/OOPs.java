public class OOPs {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(10);
        // System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());

        // BankAccount b1 = new BankAccount();
        // b1.username = "prathamesh2024";
        // // b1.pass = "abcdefgh"; // not access
        // b1.setPass("abcdefgh");


        Student s1 = new Student();
        s1.name = "Prathamesh";
        s1.age = 21;
        s1.marks[0] = 99;
        s1.marks[1] = 88;
        s1.marks[2] = 95;
        Student s2 = new Student(s1);
        // System.out.println(s2.name);
        // System.out.println(s2.age);

        // Arrays values pass call by reference
        s1.marks[2] = 100;
        s1.marks[1] = 90;

        for(int i=0; i<s2.marks.length;i++){
            System.out.println(s2.marks[i]);
        }
    }
}


class BankAccount{
    public String username;
    private String pass;

    public void setPass(String password){
        pass = password;
    }

}


class Student{
    String name;
    int age;
    int marks[] = new int[3];

    // shallow copy
    // Student(Student s1) {
        // marks = new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     marks = s1.marks;
    // }

    // deep copy
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;

        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }   
    }

    Student(){
        System.out.println("Constructor called...");
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}

class Student2{
    String name;
    int age;
    float percentage;

    void calPercent(int math, int phy, int chem){
        percentage = (math + phy + chem) / 3; 
    }
}
