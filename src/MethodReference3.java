// c) Reference to an instance method of an arbitrary object of particular type

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReference3 {

    public static void main(String[] args) {
      List<String> data=new ArrayList();

      data.add("C");
      data.add("D");
      data.add("a");
      data.add("B");
        System.out.println(data);
      Collections.sort(data,String::compareToIgnoreCase);
        System.out.println(data);

    }
}
