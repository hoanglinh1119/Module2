package DeadLine;

import java.util.Comparator;

public class SortFollowName implements Comparator<StudentObjects> {
    @Override
    public int compare(StudentObjects studentObjects, StudentObjects t1) {
        return studentObjects.getName().compareTo(t1.getName());
    }
}
