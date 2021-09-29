import java.util.Scanner;

public class clockCount {
    int hour=0;
    int min=0;
    int sec=0;

    public void addSec() {
        Scanner console = new Scanner (System.in);
        System.out.println("What time is it?");
        System.out.println("Hour: ");
        hour = console.nextLine();
        System.out.println("Minutes: ");
        min = console.nextLine();
        System.out.println("Seconds: ");
        sec = console.nextLine();

        sec++;
        if (sec == 60) {
            min++;
            sec = 0;
            if (min == 60) {
                hour++;
                min = 0;
            }
        }/*
        int loopVal;
        int end_Value = 10;
        int addition = 0;

        for (loopVal = 1; loopVal < end_Value; loopVal++) (
                addition = addition + loopVal;
                )
        System.out.println("total = " + addition);*/

    }
}