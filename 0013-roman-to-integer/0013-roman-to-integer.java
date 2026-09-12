class Solution {
    public int romanToInt(String s) {
     int sum=0;
     for(int i=0;i<s.length();i++){
        int curr=value(s.charAt(i));  
     if(i+1<s.length()&&curr<value(s.charAt(i+1))){
        sum -=curr;
     }else{
        sum +=curr;
     }
     }
      return sum;
    }
   int value(char curr){
    if(curr=='I')return 1;
    if(curr=='V')return 5;
    if(curr=='X')return 10;
    if(curr=='L')return 50;
    if(curr=='C')return 100;
    if(curr=='D')return 500;
    return 1000;
   }
}