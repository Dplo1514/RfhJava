public class tryCatchQuiz {
    public class tryCatchQuiz0 {
        static class ArrayCalculation {

            int[] arr = { 0, 1, 2, 3, 4 };

            public int divide(int denominatorIndex, int numeratorIndex) throws ArithmeticException , ArrayIndexOutOfBoundsException {
                return arr[denominatorIndex] / arr[numeratorIndex];
            }
        }

        public class Main {
            public static void main(String[] args) {
                ArrayCalculation arrayCalculation = new ArrayCalculation();

                System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));

                try {
                    System.out.println("1 / 0 = " + arrayCalculation.divide(1, 0)); // java.lang.ArithmeticException: "/ by zero"
                }catch (ArithmeticException e){
                    System.out.println("ArithmeticException 발생 : " + e.getMessage());
                }
                try {
                    System.out.println("Try to divide using out of index element = "
                            + arrayCalculation.divide(5, 0)); // java.lang.ArrayIndexOutOfBoundsException: 5
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("IndexOutOfBoundsException 발생 :" + e.getMessage());
                    System.out.println(arrayCalculation.arr.length -1 + "해당 범위의 숫자를 인덱스해주세요");
                }

            }

        }
    }


}
