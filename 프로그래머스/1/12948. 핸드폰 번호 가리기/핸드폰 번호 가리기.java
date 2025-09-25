class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String first = phone_number.substring(0, phone_number.length()-4);
        String last = phone_number.substring(phone_number.length()-4);
        
        answer = "*".repeat(first.length()) +last;
        
    
        
        
        return answer;
    }
}