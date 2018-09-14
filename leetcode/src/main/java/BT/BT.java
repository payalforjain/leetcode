package BT;



import java.util.Scanner;

/* Class BTNode */


/* Class BT */
class BT
{
    private BTNode root;

    /* Constructor */
    public BT()
    {
        root = null;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    /* Functions to insert data */
    public void insert(int data)
    {
        root = insert(root, data);
    }
    /* Function to insert data recursively */
    private BTNode insert(BTNode node, int data)
    {
        if (node == null)
            node = new BTNode(data);
        else
        {
            if (node.getRight() == null)
                node.right = insert(node.right, data);
            else
                node.left = insert(node.left, data);             
        }
        return node;
    }     
    /* Function to count number of nodes */
    public int countNodes()
    {
        return countNodes(root);
    }
    /* Function to count number of nodes recursively */
    private int countNodes(BTNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    /* Function to search for an element */
    public boolean search(int val)
    {
        return search(root, val);
    }
    /* Function to search for an element recursively */
    private boolean search(BTNode r, int val)
    {
        if (r.getData() == val)
            return true;
        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;
        return false;         
    }
    
    public static void main(String[] args)
   {            
       Scanner scan = new Scanner(System.in);
       /* Creating object of BT */
       BT bt = new BT(); 
       /*  Perform tree operations  */
       System.out.println("Binary Tree Test\n");          
       char ch;        
       do    
       {
           System.out.println("\nBinary Tree Operations\n");
           System.out.println("1. insert ");
           System.out.println("2. search");
           System.out.println("3. count nodes");
           System.out.println("4. check empty");

           int choice = scan.nextInt();            
           switch (choice)
           {
           case 1 : 
               System.out.println("Enter integer element to insert");
               bt.insert( scan.nextInt() );                     
               break;                          
           case 2 : 
               System.out.println("Enter integer element to search");
               System.out.println("Search result : "+ bt.search( scan.nextInt() ));
               break;                                          
           case 3 : 
               System.out.println("Nodes = "+ bt.countNodes());
               break;     
           case 4 : 
               System.out.println("Empty status = "+ bt.isEmpty());
               break;            
           default : 
               System.out.println("Wrong Entry \n ");
               break;   
           }
           /*  Display tree  */ 
           System.out.print("\nPost order : ");
   

           System.out.println("\n\nDo you want to continue (Type y or n) \n");
           ch = scan.next().charAt(0);                        
       } while (ch == 'Y'|| ch == 'y');               
   }
}