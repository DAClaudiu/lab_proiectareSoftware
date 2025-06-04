package ro.ulbs.paradigme.lab11.Probleme.src.main.java.storage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Problem 11.3.2:
 * A decorator for ISensorData that adds +20 to the wrapped object's step count,
 * and prints a formatted timestamp in toString().
 */
public class DecoratedSensorData implements ISensorData {
    private final ISensorData wrapee;

    /**
     * Constructor: wrap an existing ISensorData instance.
     *
     * @param original the ISensorData object to decorate
     */
    public DecoratedSensorData(ISensorData original) {
        this.wrapee = original;
    }

    /**
     * Returns 20 + (getStepsCount of the wrapped object).
     */
    @Override
    public int getStepsCount() {
        return wrapee.getStepsCount() + 20;
    }

    /**
     * Just delegate timestamp to the wrapped object.
     */
    @Override
    public long getTimestamp() {
        return wrapee.getTimestamp();
    }

    /**
     * Override toString() to show:
     *   steps=<original steps>   time=<HH:mm:ss.SSS>
     *
     * Note: we use wrapee.getStepsCount() here (not the +20 version),
     *       so you can see the raw data plus the formatted time.
     */
    @Override
    public String toString() {
        // Format the timestamp as HH:mm:ss.SSS
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        Date       date = new Date(wrapee.getTimestamp());
        String     timestr = sdf.format(date);

        // Show the original step count (before adding 20) and the formatted time
        return String.format("steps=%5d   time=%s", wrapee.getStepsCount(), timestr);
    }
}
