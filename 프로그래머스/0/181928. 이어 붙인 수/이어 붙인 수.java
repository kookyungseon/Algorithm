class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String add = "";        
        
        for(int i =0; i<num_list.length; i++){
            
            if(num_list[i] % 2 == 0){
                
                odd = odd + num_list[i];
                System.out.println(odd);
                
                
            }else{
                
                add = add + num_list[i];
            }
      

            
        }
         answer = Integer.parseInt(odd) + Integer.parseInt(add);
        return answer;
    }
}