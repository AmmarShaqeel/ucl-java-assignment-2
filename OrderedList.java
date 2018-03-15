public abstract class OrderedList extends List {

    public void insertAtFront (Object newData) {
        System.out.println("This method is not supported");
        return;
    }

    public void insertAtBack(Object newData){
        System.out.println("This method is not supported");
        return;
    }

    protected abstract int compare(Object obj1, Object obj2); 

    public boolean insert(Object newData) {
        ListNode conductor = firstNode;
        ListNode previous = null;
        

        while(conductor != null && compare(newData, conductor.getData())>= 0){
                previous = conductor;
                conductor = conductor.getNext();
        }

        if (previous == null){
            System.out.println("TK: prev = null");
            firstNode  = new ListNode(newData, conductor);
            return true;
        }
        else if (conductor != null &&  compare(newData, conductor.getData()) == 0)
        {
            System.out.println("TK: duplicate");
            return false;
        }


        else {
            ListNode newNode = new ListNode(newData, conductor);
            previous.setNext(newNode);
            return true;
        }

    }

    public boolean remove(Object remData) {
        ListNode conductor = firstNode;
        ListNode previous = conductor;

        if (firstNode == null)
        {
            System.out.println("List is empty");
            return false;
        }


        int result = compare(remData, firstNode.getData());

        if (result == 0) {
            firstNode = firstNode.getNext();
            return true;
        }

        while(conductor != null){

            result = compare(remData, conductor.getData());
        
            if (result ==  0){
                previous.setNext(conductor.getNext());
                return true;
            }

            previous = conductor;
            conductor = conductor.getNext();
        }
        return false;    
    }
}
