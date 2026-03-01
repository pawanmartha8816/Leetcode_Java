class Solution {
    public int singleNumber(int[] on) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<on.length;i++){
            int a=on[i];
            if(h.containsKey(a)) h.put(a,h.get(a)+1);
            else h.put(a,1);
        }
        System.out.println(h);
        int t=0;
        for(Map.Entry<Integer,Integer> entry:h.entrySet()){
            if(entry.getValue()==1){
                t=entry.getKey();
                break;
            }
        }
        return t;
    }
}