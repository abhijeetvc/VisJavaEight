import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class JavaEight {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,5,15,20,25,30);

        //Normal Java
//        for (Integer i:list) {
//            System.out.println(i);
//        }

        //Java 8, lambda expression
      //  Consumer<Integer> c=val-> System.out.println(val);
     //  list.forEach(val-> System.out.println(val));

        //Java 8, method reference
      //  list.forEach(System.out::println);

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

        //Normal java
//        list1.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        //Java 8, lambda expression
        list1.sort((o1,o2)->o1.getAge()-o2.getAge());

        System.out.println("After sorting...");
        System.out.println(list1);
    }
}
