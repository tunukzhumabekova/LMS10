package Enum.LMS10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            switch (scanner.nextInt()) {
                case 1:
                    Days days1 = Days.Monday;
                    days1.method();
break;

                case 2:
                    Days day2 = Days.Tuesday;
                    day2.method();
                    break;
                case 3:
                    Days day3=Days.Wednesday;
                    day3.method();
                    break;
                case 4:
                    Days day4=Days.Thursday;
                    day4.method();
                    break;
                case 5:
                    Days day5=Days.Friday;
                    day5.method();
                    break;
                case 6:
                    Days day6=Days.Saturday;
                    day6.method();
                    break;
                case 7:
                    Days day7=Days.Sunday;
                    day7.method();
                    break;

            }
        }
    }
}
