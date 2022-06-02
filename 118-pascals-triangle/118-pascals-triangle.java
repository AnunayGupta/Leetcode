class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<>() ; 
        for(int i = 0 ; i < numRows ; i++)
        {
            int num = 1 ; 
            int denom =1 ; 
            List< Integer> l = new ArrayList<>() ;
            int ans = 1 ; 
            l.add(ans) ;
            for(int j = 1 ; j <=i ;j++)
            {
                ans *=  i +1- j ; 
                ans /=  j ;
                l.add(ans) ; 
            }
            list.add(l) ; 
        }
        return list ; 
    }
}