public class StringOrderedList extends OrderedList {

    protected int compare(Object obj1, Object obj2){ 
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        int result = s1.compareTo(s2);
        return result;
    }

    //contructors
    public List (String listName) {
        firstNode = lastNode = null;
        name = listName;
    }

    public List() {
        this("String Ordered List");
    }
}
