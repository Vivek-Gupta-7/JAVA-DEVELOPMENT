package Threads;


class Counter
{
    int count;
    //	public void increment()

    // synchronised - we used here the method as if both the method t1 and t2 works together we will loss lots of value
    // so instead if only one method run while the other wait then we will get full value of iteration
    public synchronized void increment()
    {
        count++;
    }
}

public class Race_condition {
    public static void main(String[] args) throws InterruptedException{

        Counter c=new Counter();

        Runnable obj1=()->
        {
//    		for(int i=1;i<=1000;i++)
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };

        Runnable obj2=()->
        {
//    		for(int i=1;i<=1000;i++)
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();


        // wait till both t1 and t2 reaches the main method after that it will print
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

