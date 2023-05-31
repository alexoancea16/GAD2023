package collection.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("!");

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.set(2, "Goodbye");

        System.out.println("Modified list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove("World");

        System.out.println("Updated list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
