import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStream {
    public static void main(String[] args) {
        String stringArray[] = {"a", "s", "a", "d", "j", "k", "l", "o", "p", "p"};
        List<String> stringList = Arrays.asList(stringArray);
        boolean res = stringList.stream().anyMatch( str -> (str=="p"));
        System.out.println("Result : "+res);

        // distinct, skip, sorted
        Double doubleArray[] = {22.1, 19.0, 100.0, 201.2, 11.2, 24.5, 97.8, 80.6, 100.0, 19.0};
        List<Double> doubleList = Arrays.asList(doubleArray);

        doubleList.stream()
        .distinct() // remove duplicate data
        .skip(0)    // skip index from start
        .sorted()   // sort data
        .forEach( var -> System.out.print(var+" "));

        // filter, boxed
        List<Integer> evens = IntStream.range(1, 101) // {1,2,3,4,5,6,7,8,9,10, ..... ,99,100}
        .filter(i-> i%2 == 0)
        .boxed()    // 'Premitive' to 'Wrapper' conversion
        .collect(Collectors.toList());
        evens.forEach(e-> System.out.print(e+" "));

        Integer sum = IntStream.range(1, 101) // {1,2,3,4,5,6,7,8,9,10, ..... ,99,100}
        .reduce(0, (total, current) -> total + current);
        // .filter(i-> i%2 == 0)
        // .boxed()    // 'Premitive' to 'Wrapper' conversion
        // .collect(Collectors.toList());
        System.out.println("\nSum of [1-100] : "+sum);


    }
}
