package functional.programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviouralTest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        List<Integer> squaredNumbers = mapAndCreateNewList(numbers, x -> x * x);
        List<Integer> addNumbers = mapAndCreateNewList(numbers, x -> x + 2);
        List<Integer> cubeNumbers = mapAndCreateNewList(numbers, x -> x * x*x);
        System.out.println(squaredNumbers);
        System.out.println("--------");
        System.out.println(addNumbers);
        System.out.println("--------");
        System.out.println(cubeNumbers);

    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }
}
