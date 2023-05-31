package lambda.Consumer;

import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;

public class ConsumerTest {
    public static void main(String[] args) {
        consumer_1();
        consumer_2();
    }

    public static void consumer_1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Consumer<List<String>> consumer = List::clear;
        consumer.accept(list);
        Assert.assertEquals(list, new ArrayList<>());
    }

    public static void consumer_2() {
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c", "first", "second"));
        Consumer<List<String>> c = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");
        Consumer<List<String>> consumer = c.andThen(c2);
        consumer.accept(list1);
        Assert.assertEquals(list1, list2);
    }
}
