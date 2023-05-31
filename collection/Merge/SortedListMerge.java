package collection.Merge;
import java.util.ArrayList;
import java.util.List;
public class SortedListMerge {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 5, 6);
        List<Integer> list2 = List.of(2, 3, 4);
        List<Integer> mergedList = mergeLists(list1, list2);
        System.out.println(mergedList);
    }

    private static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
