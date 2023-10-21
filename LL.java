class LL{

    Node head;

    class Node{
        Object data;
        Node next;
    
    Node(Object data){
        this.data=data;
        this.next=null;
      }
    }

    public void addFirst(Object data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
            return;
        }
        
        newNode.next=head;
        head=newNode;
    }

    public void addLast(Object data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }

        curr.next=newNode;
    }
    
    public void deleteFirst(){
        if(head==null || head.next==null){
            head=null;
            return;
        }
        head=head.next;
    }
    
    public void deleteLast(){
        if(head==null || head.next==null){
            return;
        }
        Node secondLast=head.next;
        while(secondLast.next.next!=null){
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("NULL");
    }


    public void reverse(){
        if(head==null || head.next==null){
           return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
           Node nextNode=currNode.next;
           currNode.next=prevNode;
           prevNode=currNode;
           currNode=nextNode;
       }
        head.next=null;
        head=prevNode;
    }

    public static void main(String agrs[]){
        LL list=new LL();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.print();
      //  list.deleteFirst();
        list.print();
       // list.reverse();
        list.deleteLast();
        list.print();

    }
}