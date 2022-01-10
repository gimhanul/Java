package classs;

public class Student {
    int num;
    int dormitoryNumber;
    int classNubi;
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

    public void setClassNubi(int width) {
        classNubi = width * width;
    }

    public void setClassNubi(int width, int height) {
        classNubi = width * height;
    }

    public int addAllNumToNum(int ... values) {
        int sum = num;
        for(int value:values) {
            sum += value;
        }
        return sum;
    }
    public int addNumAndDormitoryNumber() {
        return num + dormitoryNumber;
    }

    public void showInfo() {
        System.out.println("===================");
        System.out.println("이름: "+name);
        System.out.println("학번: "+num);
        System.out.println("학교: "+school);
        System.out.println("기숙사 호실: "+dormitoryNumber);
        System.out.println("교실 너비: "+classNubi);
    }
}
