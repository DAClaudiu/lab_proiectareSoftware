package ro.ulbs.paradigme.lab11.Probleme.src.main.java.dataprocessing.impl;


import ro.ulbs.paradigme.lab11.Probleme.src.main.java.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.lab11.Probleme.src.main.java.storage.ISensorData;

public class BasicStepCountStrategy implements StepCountStrategy {
    private int totalSteps = 0;

    @Override
    public void consumeMessage(ISensorData sd) {
        totalSteps += sd.getStepsCount();
    }

    @Override
    public int getTotalSteps() {
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return this.getClass().getName();
    }
}
