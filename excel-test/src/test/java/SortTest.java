/**
 *
 *
 * 我是普通代码块
 * 我是构造函数
 * 我是静态代码块
 * 执行前
 * 我是普通代码块
 * 我是构造函数
 * 执行后
 * @author ex_111806190
 * @since 2020-10-14 15:25
 */
public class SortTest {

    static SortTest one = new SortTest("自己人");

    static {
        System.out.println("我是静态代码块");
    }

    {
        System.out.println("我是普通代码块");
    }
    public SortTest(){

    }

    public SortTest(String name){
        System.out.println("我是构造函数");
    }


    public static void main(String[] args) {
        System.out.println("执行前");
        SortTest main = new SortTest("main");
        System.out.println("执行后");
    }

}

 class JVMClass extends BaseCodeBlock {
    {
        System.out.println("子类的普通代码块");
    }
    public JVMClass() {
        System.out.println("子类的构造方法");
    }
    @Override
    public void msg() {
        System.out.println("子类的普通方法");
    }

    public static void msg2() {
        System.out.println("子类的静态方法");
    }

    static {
        System.out.println("子类的静态代码块");
    }

     public static void main(String[] args) {
         BaseCodeBlock bcb = new JVMClass();
         bcb.msg();
     }
    Other o = new Other();
}

class BaseCodeBlock {

    public BaseCodeBlock() {
        System.out.println("父类的构造方法");
    }

    public void msg() {
        System.out.println("父类的普通方法");
    }

    public static void msg2() {
        System.out.println("父类的静态方法");
    }

    static {
        System.out.println("父类的静态代码块");
    }

    Other2 o2 = new Other2();

    {
        System.out.println("父类的普通代码块");
    }
}

class Other {
    Other() {
        System.out.println("初始化子类的属性值");
    }
}

class Other2 {
    Other2() {
        System.out.println("初始化父类的属性值");
    }
}



class JVMClass2 {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getSingleton();
        Singleton2 s2 = Singleton2.getSingleton();
        System.out.println("s1:counter1 = "+ s1.counter1);
        System.out.println("s1:counter2 = "+s1.counter2);
        System.out.println("s2:counter1 = "+ s2.counter1);
        System.out.println("s2:counter2 = "+s2.counter2);
    }
}
class Singleton1{
    private static Singleton1 singleton = new Singleton1();
    public static int counter1;
    public static int counter2 = 0;
    public Singleton1(){
        counter1++;
        counter2++;
    }

    public static Singleton1 getSingleton(){
        return singleton;
    }
}
class Singleton2{

    public static int counter1;
    public static int counter2 = 0;
    private static Singleton2 singleton = new Singleton2();
    public Singleton2(){
        counter1++;
        counter2++;
    }

    public static Singleton2 getSingleton(){
        return singleton;
    }
}
