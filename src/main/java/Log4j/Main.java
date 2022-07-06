package Log4j;

import org.apache.log4j.Logger;

public class Main {
    private  static Logger Log=Logger.getLogger(String.valueOf(Main.class));
    private static Logger loggerToConsole = Logger.getLogger("MAIN1");
    private static Logger loggerToFile = Logger.getLogger("MAIN2");
    public static void main(String[] args) {


//        loggerToFile.error("Логіка");
//        loggerToConsole.info(time(20));
//        loggerToConsole.warn("Варн");
//        loggerToFile.error("Логіка2");

        Log.error("Помилка");
        Log.info("Інфа");
        Log.error("Excheption");
        Log.debug("Debug my code");
        Log.warn("WARN");

    }



}
