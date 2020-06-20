package Utilities;

public class BrowserUtils {

    public static void waitForSee(){
        //It will be used to pause our test execution
        //just provide number of seconds as a parameter
        /**
         * This method will put on pause execution
         * @param   milliseconds
         */
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
