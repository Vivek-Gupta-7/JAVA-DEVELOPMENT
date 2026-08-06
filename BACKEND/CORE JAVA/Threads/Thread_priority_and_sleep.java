package Threads;


class V extends Thread
{

    public void run()
    {
        for(int i = 1;i<=100;i++)

        {
            System.out.println("hi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

class P extends Thread {

    public void run()
    {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}



public class Thread_priority_and_sleep {
    public static void main(String[] args) {

        V obj1 = new V();
        P obj2 = new P();

        // to check the priority of the class

        System.out.println(obj1.getPriority());


        // to set the priority of the class

        obj2.setPriority(Thread.MAX_PRIORITY);




        obj1.start();
        try {
            Thread.sleep(2);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();

    }
}
