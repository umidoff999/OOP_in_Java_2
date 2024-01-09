public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(12, 58, 58);
        System.out.println("The time is " + time1);
        System.out.println("Next Hour is " + time1.nextHour());
        System.out.println("Next Minute is " + time1.nextMinute());
        System.out.println("Next Second is " + time1.nextSecond());
        System.out.println("Previous Hour is " + time1.previousHour());
        System.out.println("Previous Minute is " + time1.previousMinute());
        System.out.println("Previous Second is " + time1.previousSecond());

        MyTime time2 = new MyTime(23, 59, 59);
        System.out.println("The time is " + time2);
        System.out.println("Next Hour is " + time2.nextHour());
        System.out.println("Next Minute is " + time2.nextMinute());
        System.out.println("Next Second is " + time2.nextSecond());
        System.out.println("Previous Hour is " + time2.previousHour());
        System.out.println("Previous Minute is " + time2.previousMinute());
        System.out.println("Previous Second is " + time2.previousSecond());
    }
}

