import static java.lang.System.exit;

class StackUsingLinkedList
{
    Node top;
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public boolean isEmpty()
    {
            return top == null;
    }

    public int push(int data)
    {
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
        System.out.println("Element pushed in the stack successfully");
        return 1;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return 0;
        }
        else
        {
            int ans = top.data;
            top = top.next;
            System.out.println("\nRequired element is popped successfully");
            return ans;
        }
    }

    public int peek()
    {
        if(!isEmpty())
        {
            System.out.println("The element at the top of Stack is:" + " " + top.data);
            return top.data;
        }
        else{
            System.out.println("Stack is Empty");
            return -1;

        }
    }

    public void display()
    {
        if(top == null)
        {
            System.out.println("\n Stack Underflow Situation \n");
            exit(1);
        }
        else
        {
            Node current = top;
            System.out.println("Displaying the Required Linked List:");
            while(current != null)
            {

                System.out.println();
                System.out.println(current.data);
                current = current.next;
            }

        }
    }


}

public class StackUsingLinkedListMain {
    public static void main(String[] args) {
        StackUsingLinkedList obj = new StackUsingLinkedList();
//        obj.display();
//        obj.peek();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(500);
        obj.push(280);
        obj.display();
//        obj.peek();
        obj.pop();
//        obj.pop();
//        obj.display();
        obj.peek();
        obj.pop();
        obj.display();
    }
}
