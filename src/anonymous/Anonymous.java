package anonymous;

public class Anonymous {
    Person field = new Person() {
        void work() {
            System.out.println("출근잉");
        }

        @Override
        void wake() {
            System.out.println("6시에 인남");
            work();
        }
    };

    void method1() {
        Person lovalVar = new Person() {
            void walk() {
                System.out.println("산책잉");
            }

            @Override
            void wake() {
                System.out.println("7시에 인남");
                walk();
            }
        };
        lovalVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}
