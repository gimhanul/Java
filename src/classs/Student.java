package classs;

public class Student {
    int num;
    int dormitoryNumber;
    int classNubi;
    String name;
    String school;
    final String birthday;
    final String country = "KOREA";
    boolean inSchool = false;

    public Student(String school, int num, int dormitoryNumber, String birthday) {
        this.num = num;
        this.dormitoryNumber = dormitoryNumber;
        this.school = school;
        this.birthday = birthday;
    }

    public Student(int num, int dormitoryNumber, String name, String birthday) {
        this("부산소마고", num, dormitoryNumber, birthday);
        this.name = name;
    } // ALT + insert 단축키

    public Student(int num, int dormitoryNumber, String birthday) {
        this("대구소마고", num, dormitoryNumber, birthday);
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

    public boolean isInSchool() {
        return inSchool;
    }

    public void setInSchool(boolean inSchool) {
        this.inSchool = inSchool;
    }

    public void showInfo() {
        System.out.println("===================");
        System.out.println("이름: "+name);
        System.out.println("생일: "+birthday);
        System.out.println("국적: "+country);
        System.out.println("학번: "+num);
        System.out.println("학교: "+school);
        System.out.println("기숙사 호실: "+dormitoryNumber);
        System.out.println("교실 너비: "+classNubi);

        if(isInSchool()) {
            System.out.println("이 학생은 학교에 있습니다.");
        }
        else {
            System.out.println("이 학생은 학교에 없습니다.");
        }
    }
}
