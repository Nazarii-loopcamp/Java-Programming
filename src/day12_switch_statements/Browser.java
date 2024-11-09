package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a browser type: ");
        String browser = key.nextLine();

        System.out.println("What is the webpage you want to navigate to: ");
        String webPage = key.next();

        // Opening $webpage in $browser

        switch (browser) { // browser --- > String ----- >  String, char, byte, short, int
            case "Chrome":
                System.out.println("Opening " + webPage + " in Chrome browser");
                break;
            case "Safari": // browser == "Safari" || browser == "safari" || browser == "SAFARI" --- > CANNOT DO -- >  case "Safari" || "SAFARI":
            case "safari":
            case "SAFARI":
                System.out.println("Opening " + webPage + " in Safari browser");
                break;
            case "Firefox":
                System.out.println("Opening " + webPage + " in Firefox browser");
                break;
            case "Opera":
                System.out.println("Opening " + webPage + " in Opera browser");
                break;
            case "Tor":
                System.out.println("Opening " + webPage + " in Tor browser");
                break;
            default:
                System.out.println("We do not have " + browser + " installed in our computer.");
        }


    }
}
