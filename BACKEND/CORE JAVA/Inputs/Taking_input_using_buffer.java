import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taking_input_using_buffer {
    public static void main(String[] args) throws IOException {

        int i =0;
        int j=0;

//        try
//        {
//            j=18/i;
//            System.out.println("bye");
//        }
//        // we can also use "finally" in place of "catch"
//        catch(Exception e)
//        {
//            System.out.println("something went wrong");
//
//        }
//        // finally we can use as it will return the statement inside this irrespective of we get the result or not
//        finally
//        {
//            System.out.println("bye");
//        }

        int num =0;
        // we have written here as we are closing it in finally block where we have no opend or started it .
//        BufferedReader bf= null;
//        try
//        {
//            InputStreamReader in = new InputStreamReader(System.in);
//            bf= new BufferedReader(in);
//            num = Integer.parseInt(bf.readLine());
//            System.out.println(num);
//        }
//        finally {
//            bf.close();
//        }

        // it can be closed automatically if we write the inputstream inside try
        try(BufferedReader bf= new BufferedReader(new InputStreamReader(System.in)))
        {
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }

    }
}
