class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mull =1;
        int plus =0;
        
        
        
        for(int i= 0; i<num_list.length; i++){
            
            mull = mull * num_list[i];
            plus = plus + num_list[i];
            
            
            
        }
        if(mull<plus*plus){
            
            answer =1;
        }else {
            answer =0;
        }
        
        System.out.println(mull);
         System.out.println(plus*plus);
        
        
        
        return answer;
    }
}