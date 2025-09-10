class Solution {
    public int solution(int n, int t) {
        int answer = n;
        
        // n마리 /t시간 후엔 n의 x2
        
        //7마리 ->> 7*2...14*2...-> t번 수행 
        
    for(int i =0; i<=t; i++){
        answer = answer * 2;
    }
            
         
      
        return answer/2;
    }
}