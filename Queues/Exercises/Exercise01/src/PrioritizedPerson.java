public class PrioritizedPerson extends Person{
    private int priority;

    public PrioritizedPerson(String firstName, String lastName, int priority) {
        super(firstName, lastName);
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
    }
    @Override
    public String toString() {
        return super.toString()+ " (" + priority + ") ";
    }
}
