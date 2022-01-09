package classs;

public class Student {
    int num;
    int dormitoryNumber;
    String name;
    String school;

    public Student(String school, int num, int dormitoryNumber) {
        this.num = num;
        this.dormitoryNumber = dormitoryNumber;
        this.school = school;
    }

    public Student(int num, int dormitoryNumber, String name) {
        this("부산소마고", num, dormitoryNumber);
        this.name = name;
    } // ALT + insert 단축키

    public Student(int num, int dormitoryNumber) {
        this("대구소마고", num, dormitoryNumber);
        this.name = "모름";
    }
}
