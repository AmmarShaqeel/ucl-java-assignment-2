public class IntegerOrderedList extends OrderedList {

    protected int compare(Object obj1, Object obj2){ 
        Integer n1 = (Integer) obj1;
        Integer n2 = (Integer) obj2;
        int result = n1.compareTo(n2);
        return result;
    }

}
