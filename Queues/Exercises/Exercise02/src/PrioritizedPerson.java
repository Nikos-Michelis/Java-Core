public class PrioritizedPerson extends Person implements Comparable<PrioritizedPerson>{
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

    @Override
    public int compareTo(PrioritizedPerson o) {

       return Integer.compare(o.getPriority(), priority);
	//return Integer.compare(priority, o.getPriority());
    }
}
