package DeadLine;

import java.util.Comparator;

public class SortFollowScoreDown implements Comparator<StudentObjects> {
    @Override
    public int compare(StudentObjects studentObjects, StudentObjects t1) {
        if (Integer.parseInt(studentObjects.getScore())==Integer.parseInt(t1.getScore())){
            return 0;
        }else if (Integer.parseInt(studentObjects.getScore())>Integer.parseInt(t1.getScore())){
            return -1;
        }else return 1;
    }
}

