package java_datatype;

public class TypeConversion {

    public static void main(String[] args){
        byte a = -128;
//        整数赋值时，在类型的范围之内，否则也会报错
//        a = a + 1; 报错，int类型无法隐式转换成byte类型
        a = (byte) (a + 1);
        System.out.println(a);
        a += 1; // += 可以做到隐式转换
        System.out.println(a);

//        float b = 1.0; 1.0是double类型，不能隐式向下转型
        float b = 1.0f;
//        b = b + 1.0;
        b += 1.0;
        System.out.println(b);
        double c = b;
        System.out.println(c);
    }
}
