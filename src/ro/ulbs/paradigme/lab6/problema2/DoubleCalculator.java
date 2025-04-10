package ro.ulbs.paradigme.lab6.problema2;

public class DoubleCalculator extends ACalculator {
    public DoubleCalculator(Double item) {
        state=item;
    }
    public DoubleCalculator add(Double item) {
        state=(Double)state+item;
        return this;
    }
    public DoubleCalculator subtract(Double item) {
        state=(Double)state-item;
        return this;
    }
    public DoubleCalculator multiply(Double item) {
        state=(Double)state*item;
        return this;
    }
    public DoubleCalculator divide(Double item) {
        state=(Double)state/item;
        return this;
    }


    @Override
    protected void init() {
     state=0.0;

    }

    @Override
    public DoubleCalculator clear() {
        this.init();
        return this;
    }
}
