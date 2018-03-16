public abstract class OrderedList extends List {

    //redefining insertAtFront to not do anything
    public void insertAtFront (Object newData) {
        System.out.println("This method is not supported");
        return;
    }

    //redefining insertAtBack to not do anything
    public void insertAtBack(Object newData){
        System.out.println("This method is not supported");
        return;
    }

    protected abstract int compare(Object obj1, Object obj2); 

    public boolean insert(Object newData) {
        ListNode conductor = firstNode;
        ListNode previous = null;

        while(conductor != null && compare(newData, conductor.getData())> 0){
                previous = conductor;
                conductor = conductor.getNext();
        }

        //if duplicate returns false, conductor null check is to prevent the
        //null pointer exception
        if (conductor != null &&  compare(newData, conductor.getData()) == 0)
        {
            System.out.println("TK: duplicate");
            return false;
        }
        else {
            //if previous equals null, then the new element will be the first node
            if (previous == null){
                System.out.println("TK: prev = null");
                firstNode  = new ListNode(newData, conductor);
                return true;
            }


            //otherwise inserts element between previous and next
            else {
                ListNode newNode = new ListNode(newData, conductor);
                System.out.println("TK: conductor = " + conductor.getData());
                previous.setNext(newNode);
                return true;
            }
        }

    }

    public boolean remove(Object remData) {
        ListNode conductor = firstNode;
        ListNode previous = conductor;

        //checks if list is empty and returns an error
        if (firstNode == null)
        {
            System.out.println("TK: Empty List");
            return false;
        }

        //if FirstNode is to be deleted then deletes first node
        else if (compare(remData, firstNode.getData())== 0) {
            firstNode = firstNode.getNext();
            return true;
        }

        //otherwise loops through until a match is found
        while(conductor != null){

            if (compare(remData, conductor.getData())==  0){
                previous.setNext(conductor.getNext());
                return true;
            }

            previous = conductor;
            conductor = conductor.getNext();
        }
        System.out.println("TK: not found");
        return false;    
    }
}
