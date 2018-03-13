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

            if (result == 1){
                ListNode newNode = new ListNode(newData, conductor);
                firstNode = newNode;
                return;
            }

            while(conductor.getNext() != null){

                result = compare(newData, conductor.getNext().getData());
            
                if (result == 1){
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

        while(conductor != null){

            int result = compare(newData, conductor.getData());
        
            if (result ==  0){
                ListNode newNode = new ListNode(newData, conductor.getNext());
                conductor.setNext(newNode);
                return;
            }

            conductor = conductor.getNext();
        }
        return true;    
    }
}
