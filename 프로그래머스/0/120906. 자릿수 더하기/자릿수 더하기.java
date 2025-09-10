class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            
            
            
            answer = answer+ n %10;
                
            n = n/10;
            
            
        }
        
//         int n2 = n/10;
//         int n3 = n2/10;
//         int n4 = n3/10;
        
//         int r1 = n%10;
//         int r2 = n2%10;
//         int r3 = n3%10;
//         int r4 = n4%10;
        
        
// 1234(n)/10 = -> 123(n2) n%10 -> r1
// 123(n2)/10 -> 12(n3) n2%10 -> r2
// 12(n3)/10 -> 1  n3%10 ->r3
        
        
        
        // answer = r1+r2+r3+r4;
     
        
        return answer;
    }
}