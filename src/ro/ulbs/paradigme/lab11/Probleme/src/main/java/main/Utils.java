package ro.ulbs.paradigme.lab11.Probleme.src.main.java.main;


import ro.ulbs.paradigme.lab11.Probleme.src.main.java.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.lab11.Probleme.src.main.java.dataprocessing.impl.BasicStepCountStrategy;
import ro.ulbs.paradigme.lab11.Probleme.src.main.java.dataprocessing.impl.FilteredStepCountStrategy;

public class Utils {
    public static final String BASIC_STRATEGY = "basic";
    public static final String FILTERED_STRATEGY = "filtered";

    public static StepCountStrategy getStrategy(String type) {
        StepCountStrategy impl;
        switch (type) {
            case FILTERED_STRATEGY:
                impl = new FilteredStepCountStrategy();
                break;
            default:
                impl = new BasicStepCountStrategy();
        }
        return impl;
    }
}
