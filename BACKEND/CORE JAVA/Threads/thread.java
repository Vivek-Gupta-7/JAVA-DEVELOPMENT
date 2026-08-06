package Threads;


// Both the class we have created and called in the main method
// the main method will complete running the first class then again main mmethod will run the second class
// but if we can to run both simultaneously then we can use threads by extending the class with thread

class A extends Thread
{
//    public void show()
   public void run()
    {
        for(int i = 1;i<=100;i++)

        {
            System.out.println("hi");
        }
    }


}

class B extends Thread {
    //    public void show()
    public void run()
    {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");
        }


    }
}


public class thread {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        // we have extended it with thread but the consloe is printing sequence wise still like first 10 "hi" then 10 "hello"
        // we want on left side hi and right side hello
        // for that we need to write obj1.start and obj2.start then it will start from printing simultaneously
        // every thread have method run
        // Obj1.show ke jagha obj1.start hoga but class A mai start method nahi hain start dene se class mai run method hona padega only then run hoga multiple thread
//        obj1.show();
//        obj2.show();

        obj1.start();
        obj2.start();

    }
}

