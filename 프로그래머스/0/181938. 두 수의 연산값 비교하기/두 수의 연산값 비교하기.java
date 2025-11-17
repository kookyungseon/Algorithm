class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int plus = Integer.parseInt(a+""+b) ;
        int mul = 2 * a *b;
        

        if(plus<mul){
            
            answer =mul;
        }else{
            
            answer = plus;
        }
        
        
        return answer;
    }
}