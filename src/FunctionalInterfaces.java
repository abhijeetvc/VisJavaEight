import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

//interface Demo{
//    Integer calculateLength(String str);
//}
//

public class FunctionalInterfaces {//implements Demo {

    public static void main(String[] args) {

//        FunctionalInterfaces fi=new FunctionalInterfaces();
//        System.out.println(fi.calculateLength("Viswesh"));

        //Function Interface
        Function<String,Integer> f= str->str.length();
        Integer i=f.apply("Viswesh");
        System.out.println(i);

        Function<Integer,Integer> f1=a->a*5;
        Integer i1=f1.apply(5);
        System.out.println(i1);

        //Function Chaining
        Function<String,Integer> f2= str->str.length();
        Function<Integer,Integer> f3=a->a*5;
        Function<Integer,Integer> f4=b->b+10;
        Integer i2=f2.andThen(f3).andThen(f4).apply("Viswesh");
        System.out.println(i2);

        //BiFunction Interface
        BiFunction<Integer,Integer,Integer> bi=(a,b)->a+b;
        Integer i3=bi.apply(35,20);
        System.out.println(i3);

        //BinaryOperator Interface
        BinaryOperator<Integer> bo=(x,y)->x+y;
        Integer i4=bo.apply(45,60);
        System.out.println(i4);

        //UnaryOperator Interface
        UnaryOperator<Integer> f5=a->a+10;
        Integer i5=f5.apply(20);
        System.out.println(i5);

        //Predicate Interface
        List<Integer> list1= Arrays.asList(5,10,15,20,25,30);

        //It takes an argument and return boolean
        Predicate<Integer> p=x->x>10;
        List<Integer> list2=list1.stream().filter(p)
                .collect(Collectors.toList());
        System.out.println(list2);

        // BiPredicate Interface
        //It takes two arguments and return boolean
        BiPredicate<String,Integer> bip=(a,b)->{
          return a.length()==b;
        };
        Boolean b=bip.test("Abhi",4);
        System.out.println(b);

        // Consumer Interface
        // It takes an argument and return nothing
        Consumer<Integer> c=a-> System.out.println(a);
        c.accept(28);

        // BiConsumer Interface
        BiConsumer<Integer,Integer> c1=(a,a1)-> System.out.println(a+a1);
        c1.accept(30,40);

    }

//    @Override
//    public Integer calculateLength(String str) {
//        return str.length();
//    }
}
