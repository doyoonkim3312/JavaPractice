package ArrayFundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InvalidSubscript {
    public static void main(String[] args) throws IOException {
        int[] testArray = new int[10];


        BufferedReader usrBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of subscription you want to edit");
        String inputString = usrBufferedReader.readLine();

        while (true) {
            while (!isValid(inputString)) {
                System.out.println("INVALID INPUT DETECTED; ENTER NEW SUBSCRIPTION");
                inputString = usrBufferedReader.readLine();
            }

            if (Integer.parseInt(inputString) > 10) {
                System.out.println("OUT OF BOUNDARY: ENTER NEW SUBSCRIPTION");
                inputString = usrBufferedReader.readLine();
            } else {
                testArray[Integer.parseInt(inputString)] = 1000;
                break;
            }
        }

        for (int i = 0; i < testArray.length; i++) {
            System.out.println("INDEX " + (i+1) + ": " + testArray[i]);
        }

    }

    public static boolean isValid(String inputValue) {
        try {
            Integer.parseInt(inputValue);
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
