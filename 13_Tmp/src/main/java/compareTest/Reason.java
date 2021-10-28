package compareTest;

/**
 * @author Ren
 */


public class Reason {

    private int priority ;

    private String s;

    public Reason(int priority, String s) {
        this.priority = priority;
        this.s = s;
    }

    public Reason() {
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Reason{" +
                "priority=" + priority +
                ", s='" + s + '\'' +
                '}';
    }
}
