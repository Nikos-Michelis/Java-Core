import java.util.Comparator;
public class PrioritizedPersonComparator implements Comparator<PrioritizedPerson> {

    @Override
    public int compare(PrioritizedPerson o1, PrioritizedPerson o2) {
        /*if(o1.getPriority() > o2.getPriority()){
            return -1;
        } else if (o1 == o2) {
            return 0;

        } else {
            return 1;
        }*/
  
        return Integer.compare(o2.getPriority(),o1.getPriority());
    }
}
