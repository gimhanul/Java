package classs;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같음");
        }
        else {
            System.out.println("다름");
        }
    }
}
