package arrayChallenge;
import java.util.*;
import java.io.*;

public class Main {
	public static String ArrayChallenge(String[] strArr) {
		Map<Integer,Integer>childToParent=new HashMap<>();
		for(String pair:strArr) {
			String[] nodes=pair.replaceAll("\\s+", "").replaceAll("[\\(\\)]", "").split(",");
			int child=Integer.parseInt(nodes[0]);
			int parent=Integer.parseInt(nodes[1]);
			if(childToParent.containsKey(child)) {
				return "false";
			}
			childToParent.put(child,parent);
		}
		Set<Integer> parents=new HashSet<>(childToParent.values());
		return parents.size()==strArr.length-1 ? "true": "false";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(ArrayChallenge(sc.nextLine().split(",")));

	}

}
