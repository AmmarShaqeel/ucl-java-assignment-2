public class ListTestInteger {
    public static void main (String args[]) {

            IntegerOrderedList list = new IntegerOrderedList();

            list.insert(Integer.valueOf(-1));
            list.insert(Integer.valueOf(2));
            list.insert(Integer.valueOf(5));
            list.insert(Integer.valueOf(9));


            System.out.println(list);

            Object removedData = list.removeFromFront();
            System.out.println("removed data is: " + removedData);

            System.out.println(list);

            removedData = list.removeFromBack();
            // we know removedData is of class Integer so
            // we "downcast" a superclass (Object) to a subclass (Integer)
            Integer i = (Integer) removedData;

            System.out.println("removed data is: " + i);
            System.out.println(list);
        }
}
