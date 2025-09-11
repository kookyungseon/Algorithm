class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        
        int i =0;
        while(n>0){
            
     
            answer[i] = (int)(n%10);
            i++;
            n = n/10;
        }
        return answer;
    }
}