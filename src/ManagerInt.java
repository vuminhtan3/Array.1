import java.util.Random;

public class ManagerInt {
    Random random = new Random();
    int [] arrInt = new int[100];
    int [] sortedArray = new int[100];
    private int i;
    private int sum = 0;
    private int sumEven = 0;
    private int sumOod = 0;
    public ManagerInt() {
        for (i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(0, 100);
            this.arrInt[i] = arrInt[i];
        }
    }
    public void printArray(){
        for (i = 0; i < arrInt.length ; i++) {
            System.out.println(arrInt[i]);
        }
    }

    public void sumOfArray() {
        for (i = 0; i < arrInt.length; i++) {
            sum += arrInt[i];
        }
        System.out.println("Sum of array: " + sum);
    }

    public void sumOfEvenNumber(){
        for (i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 == 0){
                sumEven += arrInt[i];
            }
        }
        System.out.println("Sum of Even number in array: " + sumEven);
    }

    public void sumOfOddNumber() {
        for (i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 == 1){
                sumOod += arrInt[i];
            }
        }
        System.out.println("Sum of odd number in array: " + sumOod);
    }

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int j = 2; j < Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
    public void printPrimeNumber() {
        System.out.print("Prime numbers: ");
        for (i = 0; i < arrInt.length; i++) {
            if (isPrime(arrInt[i])) {
                System.out.print(arrInt[i] + "; ");
            }
        }
        System.out.println();
    }

    public void minOfArray(){
        int min = arrInt[0];
        for (i = 0; i < arrInt.length; i++) {
            if (min > arrInt[i]) {
                min = arrInt[i];
            }
        }
        System.out.println("Min of Array: " + min);
    }

    public void maxOfArray() {
        int max = arrInt[0];
        for (i = 0; i < arrInt.length; i++) {
            if (max < arrInt[i]) {
                max = arrInt[i];
            }
        }
        System.out.println("Max of Array: " + max);
    }

    public void copyArray() {
        for (i = 0; i < arrInt.length; i++) {
            sortedArray[i] = arrInt[i];
        }
    }
//    public void sortIncreasing() {
//        System.out.println("Sort Increasing:");
//        int temp = arrInt[0];
//        for (i = 0; i < arrInt.length - 1; i++) {
//            for (int j = i+1; j < arrInt.length; j++) {
//                if (arrInt[i] > arrInt[j]) {
//                    temp = arrInt[i];
//                    arrInt[i] = arrInt[j];
//                    arrInt[j] = temp;
//                }
//            }
//        }
//        for (i = 0; i < arrInt.length; i++) {
//            System.out.print(arrInt[i] + "; ");
//        }
//        System.out.println();
//    }
    public void sortIncreasing() {
        copyArray();
        System.out.println("Sort Increasing:");
        int temp = sortedArray[0];
        for (i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i+1; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        for (i = 0; i < arrInt.length; i++) {
            System.out.print(sortedArray[i] + "; ");
        }
        System.out.println();
    }
//    public void sortDecreasing() {
//        System.out.println("Sort Decreasing: ");
//        for (i = arrInt.length - 1; i >= 0; i--) {
//            System.out.print(arrInt[i] + "; ");
//        }
//        System.out.println();
//    }
    public void sortDecreasing() {
        System.out.println("Sort Decreasing: ");
        for (i = sortedArray.length - 1; i >= 0; i--) {
            System.out.print(sortedArray[i] + "; ");
        }
        System.out.println();
    }

    public void findSumOf2Item() {
        System.out.println("Pairs of numbers what the sum of 2 consecutive numbers is greater than the 3rd number:");
        for (i = 0; i < arrInt.length - 2; i++) {
            if (arrInt[i] + arrInt[i+1] > arrInt[i+2]) {
                System.out.print("("+arrInt[i] + "," + arrInt[i+1] + "); ");
            }
        }
    }

}
