public class PalindromeList{
    public static void main(String[] args){

        MyNode root = MyNode.getSampleList();
        System.out.println("Original List");
        MyNode.display(root);
        System.out.println("Is the list palindrome ? "+isPalindrome(root));

    }

    private static boolean isPalindrome(MyNode root){

        MyNode fastPointer = root;
        MyNode slowPointer = root;

        while(fastPointer!=null){
            fastPointer = fastPointer.next;
            if(fastPointer!=null){
                fastPointer= fastPointer.next;
            }
            slowPointer = slowPointer.next;
        }

        MyNode starting = root;
        MyNode comparingNode = reverseList(slowPointer);

        while(comparingNode!=null){
            if(comparingNode.data != starting.data){
                return false;
            }
            comparingNode = comparingNode.next;
            starting = starting.next;
        }

        return true;

    }

    private static MyNode reverseList(MyNode root){

        MyNode current = root;
        MyNode next = null;
        MyNode prev = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;

    }
}

class MyNode{

    public int data ;
    public MyNode next ;

    MyNode(int data){
        this.data = data;
    }

    protected static MyNode getSampleList(){
        MyNode root = new MyNode(1);
        root.next = new MyNode(2);
        root.next.next = new MyNode(3);
        root.next.next.next = new MyNode(3);
        root.next.next.next.next = new MyNode(2);
        root.next.next.next.next.next = new MyNode(1);
        //root.next.next.next.next.next.next = new MyNode(3);
        return root;
    }

    protected static void display(MyNode root){

        MyNode temp = root;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }
}