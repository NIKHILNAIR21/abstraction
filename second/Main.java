class Student{
    int age;
    int standard;
    String firstName;
    String lastName;

    void getName(){
        System.out.println(firstName+" "+lastName+ " Standard " +standard+" age "+age);
    }

}

public class Main{
    public static void main(String argus[]) {
     Student obj = new Student();

     obj.age = 10;
     obj.standard=3;
     obj.firstName="Nikhil";
     obj.lastName="Nair";
        
       obj.getName(); 
    }
}