class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length +1];
        int aws =0;
        
        int last = num_list[num_list.length-1];
        int second = num_list[num_list.length-2];
        
        for(int i =0; i<num_list.length;  i++){
            
            answer[i] = num_list[i];
        }
        if(last > second){
            
           
            
            answer[num_list.length] = last-second;
        }else{
      
            answer[num_list.length] = 2*last;
        }
        
        
        return answer;
    }
}