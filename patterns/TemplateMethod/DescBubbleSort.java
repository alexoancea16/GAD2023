package patterns.TemplateMethod;

class DescBubbleSort extends TemplateMethodBubbleSort {
    @Override
    boolean compare(int a, int b) {
        return a < b;
    }
}
