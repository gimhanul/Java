package basic_api_class.object.equals;

public class MemberTest {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if(obj1.equals(obj2)) {
            System.out.println("가틍ㅁ");
        } else {
            System.out.println("다름");
        }

        if(obj1.equals(obj3)) {
            System.out.println("가틍ㅁ");
        } else {
            System.out.println("다름");
        }
    }
}
