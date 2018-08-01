package java_datatype;

public class Dog {

    private String name;

    public Dog(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void func(Dog dog){
        System.out.println(dog.getName()); // A
        System.out.println(dog); // java_datatype.Dog@610455d6

        dog = new Dog("B");
//        dog.setName("c");
        System.out.println(dog.getName()); // B
        System.out.println(dog); // java_datatype.Dog@511d50c0
    }


    public static void main(String[] args){
        Dog dog = new Dog("A");
        System.out.println(dog.getName()); // A
        System.out.println(dog); // java_datatype.Dog@610455d6

        func(dog);

        System.out.println(dog.getName()); // A
        System.out.println(dog); // java_datatype.Dog@610455d6

        // java中的参数传递是传值，本质是将对象的地址以值的方式传递到形参中。
    }
}


