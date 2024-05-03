public class Main {
    public static void main(String[] args) {

        //OOPS concepts -Object Oriented Programming
        //Classes and Objects
        //4 pillars of OOPS - Abstraction, Encapsulation, Inheritance and Polymorphism

//       Student s1=new Student("Mohan",110);
////       String output=s1.printDetails();
////        System.out.println(output);
////        System.out.println(s1.printDetails());
//        Student s2=new Student("Priya",111);
//        System.out.println(s2.name);
//        System.out.println(s2.rollNumber);
//        System.out.println(s2.printDetails());
        //comment Ctrl +/
//        Person p1=new Person();
//        p1.firstName="Akshay";
//        p1.lastName="Singh";
//        p1.printPersonFullName();
//        String s1="Phani";
//        System.out.println(s1.length());

        Employee suresh=new Employee(10,100000);
        //suresh.empId=10;
//        suresh.setEmpId(10);
//        //suresh.empSalary=100000;
//        suresh.setEmpSalary(100000);

//        System.out.println(suresh.printEmployeeInfo());
        Professor gupta=new Professor("Gupta","AI",100000);
        System.out.println(gupta.toString());
        /*Abstraction in Java is the process in which we only show essential details/functionality to the user. The non-essential implementation details are not displayed to the user.

In this article, we will learn about abstraction and what abstract means.

Simple Example to understand Abstraction:
Television remote control is an excellent example of abstraction. It simplifies the interaction with a TV by hiding the complexity behind simple buttons and symbols, making it easy without needing to understand the technical details of how the TV functions.

What is Abstraction in Java?
In Java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.*/


        //Abstraction -hiding - implementation- abstract classes and interfaces
        //Encapsulation - capsule - classes and objects
    }
}

class Student {

    String name;
    int rollNumber;

    public Student(String studentName, int studentRollNumber){

        name=studentName;
        rollNumber=studentRollNumber;

    }

    public String printDetails(){
        return "Student Name : "+name+"\n"+"Student roll Number : "+rollNumber;
    }
}