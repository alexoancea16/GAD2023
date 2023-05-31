package patterns.Strategy;

class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        mergeSort(list, 0, list.length - 1);
    }

    private void mergeSort(Integer[] list, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(list, low, mid);
            mergeSort(list, mid + 1, high);
            merge(list, low, mid, high);
        }
    }

    private void merge(Integer[] list, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (list[i] <= list[j]) {
                temp[k] = list[i];
                i++;
            } else {
                temp[k] = list[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = list[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = list[j];
            j++;
            k++;
        }

        for (int m = 0; m < temp.length; m++) {
            list[low + m] = temp[m];
        }
    }
}
