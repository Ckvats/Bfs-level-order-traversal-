 static ArrayList<ArrayList<Integer>> levelOrder(Node node)       // logic for bfs in java
    {
         ArrayList<ArrayList<Integer>> arr = new  ArrayList<ArrayList<Integer>>();
       
        if(node == null )
        {
            return arr;
        }
        else{
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            int c =q.size();
            ArrayList<Integer> ans = new ArrayList<Integer>();
            for(int i=0;i<c;i++){
                Node temp = q.poll();
            ans.add(temp.data);
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
            }
            arr.add(ans);
            
        }
        
        return arr;
        }
        
    }
}
