class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> b) {
        TreeMap<Integer,Integer> h=new TreeMap<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<b.size();i++){
            int af=b.get(i);
            if(h.containsKey(af)){
                h.put(af,h.get(af)+1);
            }
            else{
                h.put(af,1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:h.entrySet()){
            if(entry.getValue()%2==1){
                a.add(entry.getKey());
            }
        }
        return a;
    }
}