package day44_map_function.enum_sample;

public class UsingBrowser {
    public static void main(String[] args) {

        Browser browser = Browser.CHROME;

        switch (browser) {
            case CHROME:
            case FIREFOX:
                System.out.println("Opening either Chrome or Firefox");
                break;
            case EDGE:
                System.out.println("Opening either Edge");
                break;
            case SAFARI:
                System.out.println("Opening either Safari");
                break;
            default:
                System.out.println("Unknown browser");

        }

    }
}
