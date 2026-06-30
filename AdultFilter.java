import java.util.*;
import java.util.function.Predicate;

public class AdultFilter {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(10, 18, 25, 70, 80);

       
        Predicate<Integer> isAdult = age -> age >= 18;

     
        ages.forEach(age -> {
            if (isAdult.test(age)) {
                System.out.println(age);
            }
        });
    }
}
 