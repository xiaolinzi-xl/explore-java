package java_datatype;

public class DataType {

    public static void main(String[] args){
        // 基本数据类型
        int a = 127;
        Integer b = 127;
        Integer c = new Integer(127);
        Integer d = Integer.valueOf(127);
        System.out.println(a == b); // true
        System.out.println(a == c); // true
        System.out.println(b == c); // false
        System.out.println(c == d); // false
        System.out.println(b == d); // true
        // Integer b = 1 自动装箱 Integer b = Integer.valueOf(1)
        // Integer.valueOf 方法可能会使用缓存池
        // integer的缓存池大小为 -128 ～ 127
        // new Integer 每次都会创建一个新对象
    }
}
