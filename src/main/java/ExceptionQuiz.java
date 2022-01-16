class ArrayCalculation {

    int[] arr = {0, 1, 2, 3, 4};

    public int divide(int denominatorIndex, int numeratorIndex)throws ArithmeticException , ArrayIndexOutOfBoundsException{
        return arr[denominatorIndex] / arr[numeratorIndex];
    }
}
public class ExceptionQuiz {
    public static void main(String[] args) {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));

        try {
            System.out.println("1 / 0 = " + arrayCalculation.divide(1, 0));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생 :" + e.getMessage());
        }

        try {
            System.out.println("Try to divide using out of index element = "
                    + arrayCalculation.divide(5, 0));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException 발생 :" + e.getMessage());
            System.out.println("Index 범위 :" + (arrayCalculation.arr.length - 1) + "까지 입니다.");
        }
    }
}
