
public class Time {

    private int hr;
    private int min;
    private int sec;

    public Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    public Time(int hr, int min, int sec) {
        int carryMin = sec / 60;
        this.sec = sec % 60;
        int carryHr = (min + carryMin) / 60;
        this.min = (min + carryMin) % 60;
        this.hr = hr + carryHr;
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }

    public Time add(Time foo) {
        int carryMin = (this.sec + foo.sec) / 60;
        int newSec = (this.sec + foo.sec) % 60;
        int carryHr = (this.min + foo.min + carryMin) / 60;
        int newMin = (this.min + foo.min + carryMin) % 60;
        int newHr = (this.hr + foo.hr + carryHr);
        return new Time(newHr, newMin, newSec);
    }

}
