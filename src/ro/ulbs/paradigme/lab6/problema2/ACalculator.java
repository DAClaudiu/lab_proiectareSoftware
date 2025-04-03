package ro.ulbs.paradigme.lab6.problema2;

public abstract class ACalculator {
    protected Object state;
    protected abstract void init();
    public Object result() {
        return state;
    };
    public abstract ACalculator clear();


}
