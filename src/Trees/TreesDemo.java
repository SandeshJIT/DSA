package Trees;

public class TreesDemo {
    public class Tree{
        Tree leftNode;
        Tree rightNode;
        int data;
        public Tree(int data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }
    Tree root;
    TreesDemo(){
        this.root = null;
    }
    public Tree insertData(Tree root,int data){
        // System.out.println(data);
        if(root == null){
            Tree newNode = new Tree(data);
            return newNode;
           
        }
        else if(root.data > data){
            root.leftNode = insertData(root.leftNode,data);
        }
        else{
            root.rightNode = insertData(root.rightNode, data);
        }
        return root;
      

    }

   


    public void inorderTraversal(Tree temp){
        if(temp!=null){
            System.out.println(temp.data);
            inorderTraversal(temp.leftNode);
            inorderTraversal(temp.rightNode);
        }
    }
    public void insert(int data){
        root = insertData(root, data); 
        
    }
    public void inorder(){
        inorderTraversal(root);
    }
    
}
