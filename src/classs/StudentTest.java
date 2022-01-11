package classs;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1206, 209, "김한울", "050415");
        Student s2 = new Student(2210, 513, "040722");
        Student s3 = new Student(1111, 111, "부산소마고", "111111");

        int num = s1.addAllNumToNum(1000, 100, 3);
        System.out.println(num);
        s1.setClassNubi(100);
        s2.setClassNubi(100, 200);

        s1.setInSchool(true);
        s3.setInSchool(true);

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();

    } //main 치면 자동완성됨
}
