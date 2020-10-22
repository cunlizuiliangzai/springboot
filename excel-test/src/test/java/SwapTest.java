import java.util.concurrent.CountDownLatch;

/**
 * @author ex_111806190
 * @since 2020-10-12 11:23
 */
public class SwapTest {


    /**
     *  Java 语言的方法调用只支持参数的值传递。当一个对象实例作为一
     * 个参数被传递到方法中时，参数的值就是对该对象的引用。
     */

    public static void swap( int x,  int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        swap(a,b);
        System.out.println(a);  //5
        System.out.println(b);  //10
    }

}
