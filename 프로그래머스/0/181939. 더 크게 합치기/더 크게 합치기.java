class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num = "" + a+ b;
        String num2 =""+ b+ a;
        
        
        int first = Integer.parseInt(num);
        int second = Integer.parseInt(num2);
        
        if(first>second){
            
            answer = first;
        }else{
            
            answer = second;
        }
        
        
        
        return answer;
    }
}