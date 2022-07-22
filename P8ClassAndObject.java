package phase1programs_2;

class ClassAndObject {
    
    String name;
    int rollno;
     
    

    ClassAndObject(String name, int rollno){

        this.name=name;
        this.rollno=rollno;

    }
}
public class P8ClassAndObject {

    public static void main(String[] args) {
        
    	ClassAndObject obj= new ClassAndObject("Abhishek" , 1);

        System.out.println("Student Name is: " + obj.name);
        System.out.println("Roll Number is: " + obj.rollno);
        

    }
}