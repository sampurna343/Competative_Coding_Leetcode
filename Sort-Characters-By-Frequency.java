class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
           } 
           else{
            map.put(s.charAt(i),1);
           }
        }
        //System.out.println(map);
        		List<Character> list = new ArrayList(map.keySet());
		//System.out.println(list);
		Collections.sort(list, (c1,c2)-> -(map.get(c1)-map.get(c2)));
		//System.out.println(list);
		
		String res = "";
		for(Character c: list){ //e r t
			int charCount = map.get(c); //2 1 1
			for(int i=0;i<charCount;i++){  // 0,1
				res = res + c;  //"" "e" "ee" "eer" eert
			}
		}
    return res;
    }
}