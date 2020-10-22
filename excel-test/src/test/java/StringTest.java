import com.liujia.entity.Person;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ex_111806190
 * @since 2020-10-13 9:28
 */
public class StringTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        /*String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2); //false
        System.out.println(s1 == s5); //true
        System.out.println(s1 == s6); //false
        System.out.println(s1 == s6.intern()); //true
        System.out.println(s2 == s2.intern()); //false
*/



    }

    /**
     * 字符串反转
     *
     * @param originStr
     * @return
     */
    public static String reverse(String originStr) {
        if (originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }


    /**
     * 字符在文件中出现了几次
     *
     * @return
     */
    public static int countWordInFile(String fileName, String word) throws IOException {


        int counter = 0;
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line = null;
            while ((line = br.readLine()) != null) {
                int index = -1;
                while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
                    counter++;
                    line = line.substring(index + word.length());
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return counter;
    }


    /**
     * 当前目录文件夹
     */
    public static void currentDirect(String fileName) {
        File file = new File(fileName);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }


    /**
     * 当前目录下所有文件
     */
    public static void currentDirectChildren(String fileName) {
        File file = new File(fileName);
        _walkDirectory(file, 0);
    }


    private static void _walkDirectory(File f, int level) {
        if (f.isDirectory()) {
            for (File temp : f.listFiles()) {
                _walkDirectory(temp, level + 1);
            }
        } else {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("t");
            }
            System.out.println(f.getName());
        }
    }
}

