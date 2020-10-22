
import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 模拟一个栈  先进先出
 * @author ex_111806190
 * @since 2020-10-13 15:06
 */
public class MyStack<T> {

    private T[] elements;

    private int size = 0;

    //初始话容量
    private static final int INIT_CAPACITY = 16;
    public MyStack() {
        elements = (T[]) new Object[INIT_CAPACITY];
    }
    public void push(T elem) {
        ensureCapacity();
        elements[size++] = elem;
    }

    /**
     * 内存泄漏
     * @return
     */
    public T pop() {
        if(size == 0)
            throw new EmptyStackException();


        T[] result = (T[]) new Object[size - 1];
        System.arraycopy(elements, 0, result, 0, size-1);

        T element = elements[--size];
        elements = result;
        return element;
    }

    /**
     * 扩容为原来的两倍加1
     */
    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        MyStack<String> stringMyStack = new MyStack<>();
        stringMyStack.push("a");
        stringMyStack.push("b");
        stringMyStack.push("c");
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.pop();

    }
}
