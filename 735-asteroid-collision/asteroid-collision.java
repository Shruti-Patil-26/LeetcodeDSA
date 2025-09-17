class Solution {
    public int[] asteroidCollision(int[] ast) {
        LinkedList<Integer> lt=new LinkedList();

        for(int i=0;i<ast.length;i++)
        {
            if(ast[i]>0)
                lt.add(ast[i]);
            else
            {
                while(lt.size()!=0 && lt.getLast()>0 && lt.getLast()<Math.abs(ast[i]))
                    lt.removeLast();

                if(lt.size()!=0 && lt.getLast()==Math.abs(ast[i]))
                    lt.removeLast();
                else if(lt.size()==0 || lt.getLast()<0)
                    lt.add(ast[i]);
            }
        }
        int []sol=new int[lt.size()];
        for(int i=0;i<lt.size();i++)
            sol[i]=lt.get(i);
        return sol;
    }
}