import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();			// 중복된 데이터는 담지 않음	sorting X
		Set<String> treeSet = new TreeSet<String>();				// 중복된 데이터는 담지 않음 sorting O
		String [] array = {"박지민" , "홍지민" , "박지민" , "한지민", "한지민", "이지민", "황지민"};
		for(String str : array) {
			hashSet.add(str);
			treeSet.add(str);
		}
		hashSet.add("신지민");
		System.out.println(hashSet.size());
		System.out.println(hashSet);
		System.out.println(treeSet.size());
		System.out.println(treeSet);
	}
}
