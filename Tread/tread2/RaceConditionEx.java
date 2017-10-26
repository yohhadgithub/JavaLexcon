package chapter4.threads;

public class RaceConditionEx {

    private int number;
    private int number2;
    public void changeNumber() {
        if (number == 0) {
            System.out.println(Thread.currentThread().getName() + " | Changed");
            number = -1;
        }
        else {
         System.out.println(Thread.currentThread().getName() + " | Not changed");

        }

    }

    public static void main(String[] args) {
        final RaceConditionEx raceConditionEx = new RaceConditionEx();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    raceConditionEx.changeNumber();
                }
            }, "T" + i).start();
        }
    }
}
