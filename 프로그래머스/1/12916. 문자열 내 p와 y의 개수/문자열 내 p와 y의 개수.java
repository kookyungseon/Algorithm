class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_count =0;
        int y_count =0;
        
        
        // 1. 모두 대문자로 변환
        
        s = s.toUpperCase();
        for(int i =0; i <s.length(); i++){
            if(s.charAt(i) =='P'){
                
                p_count++;
            }else if(s.charAt(i)=='Y'){
                
                y_count++;
            }
            
        }
        
        if(p_count == y_count){
            
            answer =  true;
        }else{
            
            answer = false;
        }
       
//         2. p 와 같으면 p_count 증가 
//         3. y 와 같으면 y_count 증가 
//         4. p_count 와 y_count 비교해서 같으면 true , 다르면 false 출력
        
        
        
        
        

        return answer;
    }
}