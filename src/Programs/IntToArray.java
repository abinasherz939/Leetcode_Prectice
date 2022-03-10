package Programs;

public class IntToArray {

    public int [] intToArray(int num) {
        int number = 110101;
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        return numbers;
    }
}
