class Main {

    public static void main(String[] args) {
        Month curMonth = Month.JANUARY;
        System.out.println(curMonth + " " +
                "mood is " + curMonth.moodForMonth + "\n" +
                " for all " + curMonth.daysOfMonth + " days of the month");

        Month.JANUARY.setTemperature(15);
        System.out.println(Month.JANUARY + " Temperature is: " + Month.JANUARY.getTemperature());
        curMonth.setTemperature(20);
        System.out.println(Month.JANUARY + " New Temperature is: " + curMonth.getTemperature());

    }
}