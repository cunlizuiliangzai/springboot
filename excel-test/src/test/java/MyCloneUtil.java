import com.liujia.entity.Dog;
import com.liujia.entity.Person;
import lombok.Data;

import java.io.*;

/**
 * 深度克隆
 * @author ex_111806190
 * @since 2020-10-13 16:04
 */
public class MyCloneUtil {
    private MyCloneUtil() {
    }

    // 说明：调用ByteArrayInputStream 或 ByteArrayOutputStream对象的close 方法没有任何意义
    // 这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，这一点不同于对外部资源（如文件流）的释放
    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T clone(T obj) throws
            Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        oos.writeObject(obj);
        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bin);
        return (T) ois.readObject();

    }


    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setAge(12);
        person.setLastName("主人");
        Dog dog = new Dog();
        dog.setName("小狗");
        person.setDog(dog);

        Person clone = MyCloneUtil.clone(person);
        clone.setLastName("主人2");
        Dog dog2 = new Dog();
        dog2.setName("小狗2");
        clone.setDog(dog2);


        CloneModel cloneModel = new MyCloneUtil().new CloneModel();
        cloneModel.setName("clone");
        CloneModel clone1 = (CloneModel)cloneModel.clone();
        clone1.setName("clone1");

    }


    /**
     * 浅拷贝    基本数据类型是值的赋值 ，引用数据类型是地址值的赋值
     */
    @Data
    public class CloneModel implements Cloneable{

        private String name;

        private int age;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
