import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
	static void findPerm(List<List<Integer>> perms,List<Integer> list,int start,boolean[] vis,int[] arr) {
		if(start==arr.length) {
			perms.add(new ArrayList<>(list));
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(vis[i]==false) {
				list.add(arr[i]);
				vis[i]=true;
				findPerm(perms, list, start+1, vis, arr);
				list.remove(list.size()-1);
				vis[i]=false;
			}
		}
	}
	
	static List<List<Integer>> findPermutations(int[] arr){
		List<List<Integer>> perms=new ArrayList<>();
		boolean[] vis=new boolean[arr.length];
		List<Integer> list=new ArrayList<>();
		findPerm(perms,list,0,vis,arr);
	return perms;	
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		List<List<Integer>> result=findPermutations(arr);
		System.out.println(result);
	}
}
