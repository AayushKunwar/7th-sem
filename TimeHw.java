
public class TimeHw {

    public static void main(String[] args) {
        Time foo1 = new Time(1, 2, 3);
        foo1.display();
        Time foo2 = new Time(0, 0, 72);
        foo2.display();
        Time foo3 = foo2.add(foo1);
        foo3.display();
    }
}
