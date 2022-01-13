package interfacee;


public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("티비켬");
    }

    @Override
    public void turnOff() {
        System.out.println("티비끔");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
            this.volume = volume;
        }
        System.out.println("TV volume: " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색ing");
    }
}
