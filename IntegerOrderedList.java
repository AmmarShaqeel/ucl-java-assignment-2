public class IntegerOrderedList extends OrderedList {

    protected int compare(Object obj1, Object obj2){ 
        if (((Integer) obj1) > ((Integer) obj2)) {
            return -1;
        }
        else if (((Integer) obj2).intValue() > ((Integer) obj1).intValue()) {
            return 1;
        }
        else {
            return 0;
        }
    }


}
