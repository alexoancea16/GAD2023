package collection.MySet;

public class Main {
    public static void main(String[] args) {
        MySet<Integer> set = new MySet<>();

        set.add(5);
        set.add(2);
        set.add(8);
        set.add(2);

        System.out.println("Size: " + set.size());

        System.out.println("Contains 8? " + set.contains(8));
        System.out.println("Contains 3? " + set.contains(3));

        set.remove(2);

        System.out.println("Size: " + set.size());

        for (int i = 0; i < set.size(); i++) {
            System.out.println("Element at index " + i + ": " + set.get(i));
        }
    }
}
