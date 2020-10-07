import java.util.Arrays;

public class GenericListAgregator<T extends Number> {
    T[] arr;

    public GenericListAgregator(T[] arr) {
        if (arr == null) {
            throw new IllegalStateException("Массив не должен быть null");
        }

        this.arr = arr;
    }

    public double getAvgValue(){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i].doubleValue();
        }
        return sum/arr.length;
    }

    public double getMaxValue(){
        double maxValue = arr[0].doubleValue();

        for (int i = 1; i < arr.length; i++){
            if (arr[i].doubleValue() > maxValue){
                maxValue = arr[i].doubleValue();
            }
        }

        return maxValue;
    }

    public double getMinValue() {
        double minValue = arr[0].doubleValue();

        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i].doubleValue()) {
                minValue = arr[i].doubleValue();
            }
        }
        return minValue;

    }

    public  void PrintVal()
    {
        System.out.println("Array of " + arr.getClass().getTypeName() + ": " + Arrays.toString(arr));
        System.out.println("Avarage value: " + getAvgValue());
        System.out.println("Min value: " + getMinValue());
        System.out.println("Max values: " + getMaxValue());
    }


}
