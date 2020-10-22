/**
 * @author ex_111806190
 * @since 2020-10-13 14:57
 * 静态方法中没有this对象
 */
public class Outer {
    class Inner {
    }
    public static void foo() {
        new Outer().new Inner();
    }
    public void bar() {
        new Inner();
    }
    public static void main(String[] args) {
        new Outer().new Inner();
    }
}
