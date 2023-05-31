package patterns.TemplateMethod;

class AscBubbleSort extends TemplateMethodBubbleSort {
    @Override
    boolean compare(int a, int b) {
        return a > b;
    }
}
