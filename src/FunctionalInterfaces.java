import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

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

    }

//    @Override
//    public Integer calculateLength(String str) {
//        return str.length();
//    }
}
