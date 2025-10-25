class Solution {
    public String solution(String my_string) {
        String answer = "";
        
//         for each 문 => for(type 변수명 :iterate)
        for(char x : my_string.toCharArray()){
            if(Character.isLowerCase(x)){
                
                answer = answer + Character.toUpperCase(x);
                
            }else{
                answer = answer + Character.toLowerCase(x);
            }
            
        }
        
        
        return answer;
    }
}