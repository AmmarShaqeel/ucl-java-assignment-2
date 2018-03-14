public class ListTest {
    public static void main (String args[]) {

            List list = new List("test");
            ListNode conductor = new ListNode(null,null);

            list.insertAtFront(Integer.valueOf(-1));
            list.insertAtBack(Integer.valueOf(2));
            list.insertAtBack(Integer.valueOf(5));
            list.insertAtBack(Integer.valueOf(9));

            conductor = list.getFirst();
            Object test = list.getFirst().getData();
            System.out.println("first node is: " + conductor.getData());

            System.out.println(list);

            Object removedData = list.removeFromFront();
            System.out.println("removed data is: " + removedData);

            conductor = list.getFirst();
            System.out.println("first node is: " + conductor.getData());

            removedData = list.removeFromBack();
            // we know removedData is of class Integer so
            // we "downcast" a superclass (Object) to a subclass (Integer)
            Integer i = (Integer) removedData;

            System.out.println("removed data is: " + i);
            System.out.println(list);
        }
}
