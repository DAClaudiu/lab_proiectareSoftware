package ro.ulbs.paradigme.lab6;

public class IntCalculator {
    private int state;
    public IntCalculator(int state) {
        this.state = state;
    }
    public IntCalculator add(int item) {
        state=state+item;
        return this;
    };
    public IntCalculator subtract(int item) {
        state=state-item;
        return this;
    };
    public IntCalculator multiply(int item) {
        state=state*item;
        return this;
    };
    public int result() {
        return state;
    };
    public IntCalculator clear() {
        state=0;
        return this;
    }



}
