package classs;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1206, 209, "김한울");
        Student s2 = new Student(2210, 513);
        Student s3 = new Student(1111, 111, "부산소마고");

        int num = s1.addAllNumToNum(1000, 100, 3);
        System.out.println(num); //2309
        System.out.println(s1.name);
        System.out.print(s2.school);
    } //main 치면 자동완성됨
}
