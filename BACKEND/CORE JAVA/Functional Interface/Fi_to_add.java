@FunctionalInterface
interface A
{
    int add(int i,int j);
}

public class Fi_to_add {
    public static void main(String[] args) {
//         A obj = new A()
//         {
//             public int add(int i,int j){
//                 return i+j;
//             }
//         };
//
//         int result = obj.add(7,5);
//        System.out.println(result);

        //ITNA NA LIKHKE HUMLOG LAMBDA EXPRESSON USE KAR SAKTE HAIN

    A obj = ( i, j)-> i+j;
        int result = obj.add(7,5);
        System.out.println(result);


    }


}

