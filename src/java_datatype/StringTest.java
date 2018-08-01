package java_datatype;

public class StringTest {

    public static void main(String[] args){
        String a = "bbb";
        String b = "bbb";
        String c = new String("bbb");
        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(a == c.intern()); // true
        System.out.println(a.equals(c)); // true

        // intern 方法保证相同内容的字符串变量引用到相同的内存对象
        // String a = "bbb" 会自动将新建的字符串对象放入String Pool中
    }
}
