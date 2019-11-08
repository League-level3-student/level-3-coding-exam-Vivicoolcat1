import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int numberOfTheSame = 0;
		
for(String s : hashmap1.keySet()) {
	String v = hashmap1.get(s);
	String t = hashmap2.get(s);
	if(v==t) {
		numberOfTheSame ++;
	}
	
}
			
return numberOfTheSame;
		
	}

}
