class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]*2)){
                return true;
            }
            else if(map.containsKey(arr[i]/2) && arr[i]%2==0){
                return true;
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return false;
    }
}