class Solution {
    public int solution(int n) {
//         n는 10이면 2,4,6,8
       int answer  = 0;
        for(int i = 2; i <= n; i+=2){
   
            answer = answer + i;
        }
        return answer;
    }
}