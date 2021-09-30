import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testcases
{
    Array a;
    ArrayDeletion ad;
    ArrayInsertion ai;
    LinkedList l;
    LinkedList1 l1;
    LinkedList2 l2;
    CircularLinkedList cl;
    Queue q;
    Queue1 q1;
    Queue2 q2;
    Dequeue dq;
    Stack st;
    Stack1 st1;
    @Before
    public void initialize()
    {
        a=new Array();
       ad=new ArrayDeletion();
       ai=new ArrayInsertion();
       l=new LinkedList();
       l1=new LinkedList1();
       l2=new LinkedList2();
       cl=new CircularLinkedList();
       q=new Queue(5);
       q1=new Queue1(5);
       q2=new Queue2();
       dq=new Dequeue(5);
       st=new Stack();
       st1=new Stack1();
    }
    @Test
    public void testlinearSearch()
    {
        Array.insert(5,0);
        Array.insert(2,1);
        Array.insert(7,2);
        Array.insert(4,3);
        Array.insert(3,4);
        Array.insert(0,5);
        Array.insert(1,6);
        Array.bubbleSort();
        boolean flag2=Array.binarySearch(3,0,6);
        boolean flag=Array.linearSearch(7);
        Assert.assertEquals(flag2,true);
        Assert.assertEquals(flag,true);
        Array.delete(6);
        boolean flag1=Array.linearSearch(7);
        Assert.assertEquals(flag1,false);
    }
    @Test
    public void testdeletion()
    {
        int [] arr={2,5,3,6,1};
        int [] arr2;
        arr2= ArrayDeletion.delete(arr,4);
        Assert.assertEquals(arr2[4],-1);
    }
    @Test
    public void testInsertion()
    {
        int [] arr={0,0,0,0,0,0,0,0,0,0,0};
        int [] arr2;
        arr2= ArrayInsertion.insert(arr,1,0);
        Assert.assertEquals(arr[0],1);
        arr2= ArrayInsertion.insert(arr,2,1);
        Assert.assertEquals(arr2[1],2);
        arr2= ArrayInsertion.insert(arr,55,9);
        Assert.assertEquals(arr2[9],55);
    }
    @Test
    public void testlinkedlist()
    {
        LinkedList.pushFront(4);
        LinkedList.pushFront(3);
        LinkedList.pushFront(2);
        LinkedList.pushFront(1);
        LinkedList.pushBack(5);
        LinkedList.pushBack(6);
        LinkedList.swap();
        LinkedList.Node node;
        node=l.utility1();
        Assert.assertEquals(node.key,6); //after swapping 1st value will be 6
        node=node.next;
        Assert.assertEquals(node.key,2);
        while (node.next!=null)
        {
            node=node.next;
        }
        Assert.assertEquals(node.key,1); //last value will be 1
    }
    @Test
    public void testlinkedlist1()
    {
        LinkedList1.pushFront(4);
        LinkedList1.pushFront(3);
        LinkedList1.pushFront(2);
        LinkedList1.pushFront(1);
        LinkedList1.pushBack(5);
        LinkedList1.pushBack(6);
        LinkedList1.popFront();
        LinkedList1.popBack();
        LinkedList1.pop(2);
        LinkedList1.Node node;
        node=l1.utility2();
        Assert.assertEquals(node.key,2); //after poping 1st element, my front is 2
        for (int j=0;j<2;j++)
        {
            node=node.next;
        }
        Assert.assertEquals(node.key,5); //After poping from 2nd posiotio, after front and back my 2nd element is 5
        while (node.next!=null)
        {
            node=node.next;
        }
        Assert.assertEquals(node.key,5); //After poping from back, my last is 5
    }
    @Test
    public void testlinkedlist2() throws Exception
    {
        LinkedList2.add(1);
        LinkedList2.add(2);
        LinkedList2.add(3);
        LinkedList2.add(4);
        LinkedList2.pushFront(0);
        int a=LinkedList2.topFront();
        Assert.assertEquals(a,0);
        LinkedList2.popFront();
        a=LinkedList2.topFront();
        Assert.assertEquals(a,1);
        LinkedList2.pushBack(5);
        a=LinkedList2.topBack();
        Assert.assertEquals(a,5);
    }
    @Test
    public void testCircularlist()
    {
        CircularLinkedList.pushFront(1);
        CircularLinkedList.pushFront(2);
        CircularLinkedList.pushFront(3);
        CircularLinkedList.pushFront(4);
        CircularLinkedList.pushBack(0);
        CircularLinkedList.display();
        CircularLinkedList.popFront();
        CircularLinkedList.popBack();
        CircularLinkedList.display();
        //After poping front na dback, we are testing list front and back
        CircularLinkedList.Node node;
        CircularLinkedList.Node node1;
        node=cl.utility3();
        node1=cl.utility3();
        Assert.assertEquals(node.key,3); //first element after poping
        while (node.next!=node1)
        {
            node=node.next;
        }
        Assert.assertEquals(node.key,1);
    }
    @Test
    public void testQueue() throws Exception
    {
        boolean flag=q.empty();
        Assert.assertEquals(flag,true);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
        flag=q.empty();
        Assert.assertEquals(flag,false);
        int a=q.size();
        Assert.assertEquals(a,2);
    }
    @Test
    public void testQueue1()
    {
        Queue1.enqueue(1);
        Queue1.enqueue(2);
        Queue1.enqueue(3);
        Queue1.enqueue(4);
        Queue1.enqueue(5);
        Queue1.display();
        Queue1.dequeue();
        Queue1.display();
        int a=q1.utility4();
        Assert.assertEquals(a,4);
    }
    @Test
    public void testQueue2()
    {
        Queue2.enqueue(1);
        Queue2.enqueue(2);
        Queue2.enqueue(3);
        Queue2.enqueue(4);
        Queue2.enqueue(5);
        Queue2.display();
        int a=Queue2.dequeue();
        Queue2.display();
        Assert.assertEquals(a,1); //front element

    }
    @Test
    public void testDequeue()
    {
        dq.addLeft(1);
        dq.addLeft(2);
        dq.addRight(3);
        dq.addRight(4);
        dq.addRight(5);
        dq.display();
    }
    @Test
    public void testStack()
    {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);
        Stack.push(6);
        Stack.push(7);
        Stack.push(8);
        Stack.push(9);
        Stack.display();
        Stack.pop();
        Stack.display();
        Stack.pop();
        Stack.display();
    }
    @Test
    public void testStack1()
    {
        Stack1.push(1);
        Stack1.push(2);
        Stack1.push(3);
        Stack1.push(4);
        Stack1.push(5);
        Stack1.push(6);
        Stack1.push(7);
        Stack1.push(8);
        Stack1.push(9);
        Stack1.display();
        int a=Stack1.pop();
        Assert.assertEquals(a,9);
        Stack1.display();
        a=Stack1.pop();
        Assert.assertEquals(a,8);
        Stack1.display();
    }
    @Test
    public void testStack2()
    {
        Stack2.push(1);
        Stack2.push(2);
        Stack2.push(3);
        Stack2.push(4);
        Stack2.push(5);
        Stack2.push(6);
        Stack2.push(7);
        Stack2.push(8);
        Stack2.push(9);
        Stack2.display();
        int b=Stack2.getSize();
        Assert.assertEquals(b,9);
        int a=Stack2.top();
        Assert.assertEquals(a,9);
        a=Stack2.pop();
        Stack2.display();
        b=Stack2.getSize();
        Assert.assertEquals(b,8);
        Assert.assertEquals(a,9);
        a=Stack2.pop();
        Stack2.display();
        Assert.assertEquals(a,8);
    }
}