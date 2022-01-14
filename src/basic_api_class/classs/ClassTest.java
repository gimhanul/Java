package basic_api_class.classs;

import inheritance.polymorphism.field.Car;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Car.class;

        Class c2 = Class.forName("inheritance.polymorphism.field.Car");

        Car car = new Car();
        Class c3 = car.getClass();

        showClassInfo(c1);
        showClassInfo(c2);
        showClassInfo(c3);

    }

    public static void showClassInfo(Class clazz) {
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
    }
}
