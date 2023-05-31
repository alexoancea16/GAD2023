package patterns.TemplateMethod;

    abstract class TemplateMethodBubbleSort {
        abstract boolean compare(int a, int b);

        void sort(Integer[] list) {
            int n = list.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (compare(list[j], list[j + 1])) {
                        int temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;
                    }
                }
            }
        }
    }

