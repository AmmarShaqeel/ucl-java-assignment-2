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

    public void insert(Object newData) {

        ListNode conductor = firstNode;

        try{

            int result = compare(newData, conductor.getData());

            if (result < 0){
                ListNode newNode = new ListNode(newData, conductor);
                firstNode = newNode;
                return;
            }

            while(conductor.getNext() != null){

                result = compare(newData, conductor.getNext().getData());
            
                if (result < 0){
                    ListNode newNode = new ListNode(newData, conductor.getNext());
                    conductor.setNext(newNode);
                    return;
                }

                conductor = conductor.getNext();
            }
            
            ListNode newNode = new ListNode(newData, null);
            conductor.setNext(newNode); 
        } catch (NullPointerException e) {
            ListNode newNode = new ListNode(newData, null);
            firstNode = newNode;
            return;
        }
    }

    public boolean remove(Object remData) {
        ListNode conductor = firstNode;
        ListNode previous = conductor;

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
