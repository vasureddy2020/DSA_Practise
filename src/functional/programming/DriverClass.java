package functional.programming;

import arraysds.ArrayOperations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//functional programming by in28minutes >>udemy pine labs rishi
public class DriverClass {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,5,6,7,8);


        List<String> names = List.of("Vasu Reddy","Veeri","RishiReddy","Ganesh","One");

        FuntionalProgramming.listTry(num);
        System.out.println(FuntionalProgramming.listTry(num));
        names.stream()
                .map(cou->cou+" "+cou.length()).sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
        List<Integer> doubleList = FuntionalProgramming.doubleList(num);
        //System.out.println(doubleList);
        //System.out.println(names.stream().map(x->x.length()).collect(Collectors.toList()));
    }

}
