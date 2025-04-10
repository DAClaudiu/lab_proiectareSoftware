package ro.ulbs.paradigme.lab6.problema2;

public class NewIntCalculator extends ACalculator {
    public NewIntCalculator(Integer item) {
        state=item;
    }
    public NewIntCalculator add(Integer item) {
        state=(Integer)state+item;
        return this;
    }
    public NewIntCalculator subtract(Integer item) {
        state=(Integer)state-item;
        return this;
    }
    public NewIntCalculator multiply(Integer item) {
        state=(Integer)state*item;
        return this;
    }

    public NewIntCalculator divide(Integer item) {
        state=(Integer)state/item;
        return this;
    }


    @Override
    protected void init() {
     state=0;

    }

    @Override
    public NewIntCalculator clear() {
        this.init();
        return this;
    }

}
