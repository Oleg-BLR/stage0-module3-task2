package lang.print.gaps.task2;

public class AdvancedNamingConvention {

    private static final int ADULT_AGE = 18;

    private int age;
    private int number;
    public static void main(String[] args) {

        callByNumber(55555);
    }

    void callToFriend() {
        System.out.println("Calling to friend");
    }

    static void callByNumber(int number) {
        System.out.println("Calling to number" + " " + number);
    }
}
