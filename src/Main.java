public class Main {

    public static void main(String[] args) {
    GenericListAgregator <Integer> arrOfInt = new GenericListAgregator<>(new Integer[]{1,2,3,4,5,6,7,8,9,10});
    arrOfInt.PrintVal();

    GenericListAgregator <Double> arrOfDouble = new GenericListAgregator<>(new Double[]{12.5, 11.5, 15.5, 0.5, 1.1});
        arrOfDouble.PrintVal();

    }
}
