package anonymous.interfacee;

public class Anonymous {
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV 켬");
        }

        @Override
        public void turnOff() {
            System.out.println("TV 끔");
        }
    };

    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio 켬");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio 끔");
            }
        };

        localVar.turnOn();
    }

    void method2(RemoteControl rc) {
        rc.turnOn();
    }
}
