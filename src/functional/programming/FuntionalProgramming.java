package functional.programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FuntionalProgramming {
    public static void print(int number){
        System.out.println(number);
    }
    public static int add2(int a,int b){
        return a+b;
    }
    //LIST PRACTISE
    public static int listTry(List<Integer> numbers){
        //System.out.println(numbers);
        return numbers.stream()
//                .filter(numb->numb%2==0)
//                .map(nn->nn*nn)  //print squares of the numbers
//                .map(num->num+2) //adds 2 to the value

                //.reduce(0, (x,y)->x)
                .reduce(0, sumBinaryOperator());
                //forEach(System.out::println);

    }

    private static BinaryOperator<Integer> sumBinaryOperator() {
        return Integer::sum;
    }
BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return integer+integer2;
    }
};

    public static List<Integer> doubleList(List<Integer> numbers){
        return numbers.stream()
                .filter(isEvenPredicate())
                .map(squareFunction())
                .collect(Collectors.toList());
    }

    private static Function<Integer, Integer> squareFunction() {
        return x -> x * x;
    }

    private static Predicate<Integer> isEvenPredicate() {
        return x -> x % 2 == 0;
    }
}
