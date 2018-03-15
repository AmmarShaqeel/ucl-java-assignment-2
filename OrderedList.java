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
        
        if (firstNode == null){
            ListNode newNode = new ListNode(newData, null);
            firstNode = newNode;
            return true;
        }

        int result = compare(newData, conductor.getData());

        while(conductor != null && result >= 0){

            result = compare(newData, conductor.getData());

            if (result == 0) {
                System.out.println("TK: duplicate");
                return false;
            }
            else if (result <0) {
                break;
            }
            else{
                previous = conductor;
                conductor = conductor.getNext();
            }
        }

        if (previous == null){
            System.out.println("TK: prev = null");
            ListNode newNode = new ListNode(newData, null);
            firstNode = newNode;
            firstNode.setNext(conductor);
            return true;
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
