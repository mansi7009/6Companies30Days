import java.util.*;
public class q1{
    public ArrayList<ArrayList<String>> Anagrams(String[] string_list) {
        // Code here
    HashMap<HashMap<Character,Integer>,ArrayList<String>> bmap = new HashMap<>();
    for(String str :string_list){
                // creating fmap for each str in string_list and checking whether bmap contains it or not 
            HashMap<Character,Integer> fmap = new HashMap<>();
        for(int i=0;i< str.length();i++){
            char ch = str.charAt(i);
            fmap.put(ch, fmap.getOrDefault(ch,0) + 1);
        }
        
        if(bmap.containsKey(fmap) == false){
            // adding the str in list and putting it across fmap in bmap
            ArrayList<String> ans = new ArrayList<>();
            ans.add(str);
            bmap.put(fmap,ans);
        }else{
            List<String> ans = bmap.get(fmap);
            ans.add(str);
        }
    }
    
    ArrayList<ArrayList<String>> res = new ArrayList<>();
    // values function gives us all the set of values present in the map
    for(ArrayList<String> val : bmap.values()){
        res.add(val);
    }
    return res;
}
}