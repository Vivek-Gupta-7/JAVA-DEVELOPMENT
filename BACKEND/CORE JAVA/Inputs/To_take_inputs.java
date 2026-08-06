import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class To_take_inputs {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        // 1st way
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        // 2nd way (it prints ASCII value so we need to substract 48 from the input)
        // it can take only single digit for printing multiple numbers we need to use loop

        System.out.println("ENTER A NUMBER");
        int nums = System.in.read();
        System.out.println(nums-48);

        // 3rd way
        // it can take input from anywhere not only from keyboard
        // in place of (in) we need to give the location from where we need to take the input
        System.out.println("Enter a number");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int numss= Integer.parseInt(bf.readLine());
        System.out.println(numss);
        bf.close();







    }
}
