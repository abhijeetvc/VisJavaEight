//Method References:

// 4 kinds of method references:
// a) Reference to static method of class
// b) Reference to an instance method of particular object
// c) Reference to an instance method of an arbitrary object of particular type
// d) Reference to constructor

import java.util.Arrays;
import java.util.List;

public class MethodReference1 {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("India","US","France","Germany");

        list.forEach(CheckRef::display);
    }
}

class CheckRef{
    public static void display(String str){
        System.out.println(str);
    }
}
