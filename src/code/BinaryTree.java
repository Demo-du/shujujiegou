package code;
class TreeNode{
	int value;
	TreeNode left_node;
	TreeNode right_node;
	public TreeNode(int value){
		this.value=value;
		this.left_node=null;
		this.right_node=null;
	}
}
public class BinaryTree {
    public TreeNode rootNode;
    public void Add_Node_To_Tree(int value){
    	if(rootNode==null){
    		rootNode=new TreeNode(value);
    		return;
    	}
    	TreeNode currentNode=rootNode;
    	while(true){
    		if(value<currentNode.value){
    			if(currentNode.left_node==null){
    				currentNode.left_node=new TreeNode(value);
    				return;
    			}else{
    				currentNode=currentNode.left_node;
    			}
    		}else{
    			if(currentNode.right_node==null){
					currentNode.right_node=new TreeNode(value);
					return;
				}else{
					currentNode=currentNode.right_node;
				}
    		}
    	}
    }
    public void InOrder(TreeNode node){
    	if(node!=null){
    		InOrder(node.left_node);
    		System.out.println(node.value);
    		InOrder(node.right_node);
    	}
    }
}
