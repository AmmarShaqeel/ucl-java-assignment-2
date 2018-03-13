public class ListTestInteger {
    public static void main (String args[]) {

            IntegerOrderedList list = new IntegerOrderedList();

            list.insert(Integer.valueOf(-1));
            list.insert(Integer.valueOf(-2));
            list.insert(Integer.valueOf(2));
            list.insert(Integer.valueOf(5));
            list.insert(Integer.valueOf(9));
            list.insert("test");


            System.out.println(list);

            Object removedData = list.removeFromFront();
            System.out.println("removed data is: " + removedData);

            System.out.println(list);
            list.remove(7);
            System.out.println(list);
            list.remove(-1);
            System.out.println(list);
            list.remove(9);
            
            System.out.println(list);
        }
}
