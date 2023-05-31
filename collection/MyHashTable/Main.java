package collection.MyHashTable;

public class Main {
    public static void main(String[] args) {
        Map var = new Map();
        var.put("cuv1" ,"cuv2");
        var.print();
        var.put("cuvant1" ,"cuvant2");
        System.out.println(var.size());
        if(var.containtsKey("cuv"))
            System.out.println("Contine");
        else
            System.out.println("Nu contine");
        System.out.println(var.get("cuv1"));
    }
}
