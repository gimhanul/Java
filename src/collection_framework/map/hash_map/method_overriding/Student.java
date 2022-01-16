package collection_framework.map.hash_map.method_overriding;

public class Student {
    public int number;
    public String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student) obj;
            return (student.number == this.number) && (this.name.equals(student.name));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return number + name.hashCode(); //학번과 이름이 같다면 동일한 값 return
    }
}
