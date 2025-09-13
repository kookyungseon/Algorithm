class Solution {
    public int solution(int n) {
        int answer = 0;
        int i =1;
        
        for(; i < n; i++){
            
            if(n%i ==1){
                answer = i;
                break;
                 
            }
        }
        return answer;
    }
}