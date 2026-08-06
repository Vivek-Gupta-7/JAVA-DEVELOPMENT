@FunctionalInterface
interface B
{
    void show(int i);
}


public class Functional_interface {

        public static void main(String a[]){

            // A obj = new A()
            // {
            //     public void show(int i){
            //         System.out.println("in show" + i);
            //     }
            // };

            //ITNA NA LIKHKE HUMLOG LAMBDA EXPRESSON USE KAR SAKTE HAIN

            B obj = (int i)-> System.out.println("in show " +  i);



            obj.show(5);
        }
    }

