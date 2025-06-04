package ro.ulbs.paradigme.lab11.Probleme.src.main.java.storage;




import ro.ulbs.paradigme.lab11.Probleme.src.main.java.dataprocessing.StepCountStrategy;

import java.util.Observable;
import java.util.Observer;

// TODO Implement observer for changes in data repository, implement java.util.Observer interface
public class DataAggregator implements Observer {

    private StepCountStrategy strategy;
    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }
    @Override
    public void update(Observable o, Object arg) {

        if (arg instanceof ISensorData) {
            ISensorData sd = (ISensorData) arg;
            strategy.consumeMessage(sd);
        }

    }

    public String getResults() {
        return String.format("Strategy %s: stepsCount=%d", strategy.getStrategyDescription(), strategy.getTotalSteps());
    }
}
