class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
     int n= fruits.length;
     int unp=0;
     boolean[] used= new boolean[n];
     for(int i=0;i<n;i++){
        boolean placed=false;
        for(int j=0;j<n;j++){
            if(!used[j]&&baskets[j]>=fruits[i]){
                used[j]=true;
                placed=true;
                break;
                }
                }
            if(!placed){
                unp++;
            }
     }   
     return unp;
    }
}