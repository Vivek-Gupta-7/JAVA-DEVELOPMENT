public class LaunchClassForNameEx {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // Demo d karta sirf toh sirf static wala print hota
        // uske baad instantiate kiya hain so non static wala bhi print hoga
        //Demo d = new Demo();

        // other way to do it only for static
//        Class.forName("Demo");

        // with instantiation

        Class.forName("Demo").newInstance();

    }
}


class Demo
{
    static
    {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance block ==> Non static");
    }
}