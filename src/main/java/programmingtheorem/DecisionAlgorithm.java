package programmingtheorem;

public class DecisionAlgorithm {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        // páros-e? isEven vagy ha páratlan isOdd vagy van-e kerítése a háznak hasFence
        boolean isEven = false; // kezdeti érték
        for(int num: numbers) {
            if(num%2==0) {
                isEven = true;
                break;
            }
        }
    }

    public static boolean deideIfnumIsEven(int[] numbers) {
        boolean isEven = false; // kezdeti érték
        for(int num: numbers) {
            if (num % 2 == 0) {
                isEven = true;
                break;
            }
        }
    }
}
