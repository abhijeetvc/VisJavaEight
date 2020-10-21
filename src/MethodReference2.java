// b) Reference to an instance method of particular object

import java.util.ArrayList;
import java.util.List;

public class MethodReference2 {

    public static void main(String[] args) {

        Student s1=new Student();
        s1.setId(1);
        s1.setName("A");
        s1.setAge(30);

        Student s2=new Student();
        s2.setId(2);
        s2.setName("B");
        s2.setAge(25);

        List<Student> list1=new ArrayList<>();
        list1.add(s1);
        list1.add(s2);

        System.out.println("Before sorting...");
        System.out.println(list1);
        CompareStudents cs=new CompareStudents();

        System.out.println("After sorting...");
        list1.sort(cs::compareStudents);
        System.out.println(list1);

    }

}

class CompareStudents{

    public int compareStudents(Student o1,Student o2){
        return o1.getAge()-o2.getAge();
    }
}