class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i =0 ; i < num_list.length; i++){
            
            answer[i] = num_list[num_list.length-1-i];
            //[1,2,3,4] -> [4,3,2,1]
        }
        return answer;
    }
}