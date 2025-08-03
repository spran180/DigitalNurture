package SingletonDesign;

public class Logger {

    private static Logger logger;
    private Logger(){}

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                logger = new Logger();
            }
        }

        return logger;
    }
}
