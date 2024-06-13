public class Main {
    public static void main(String[] args) {
        TestTaker testTaker = new TestTaker();
        String[] door_fitting = {"Door1", "Door2", "Room3", "door4"};
        String[] codes = {"301", "301", "311", "001"};
        testTaker.door(door_fitting, codes);
    }
}