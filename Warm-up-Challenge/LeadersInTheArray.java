import java.util.ArrayList;

public class LeadersInTheArray {

	public static void main(String[] args) {
		int[] arr= {16,17,4,3,5,2};
		StringBuffer str=new StringBuffer();
		ArrayList<Integer> res=new ArrayList<>();
		res=leadersArray(arr);
		for(int i=res.size()-1;i>=0;i--) {
			str.append(res.get(i)+" ");
		}
		System.out.println("leaders in the array are:- "+str);

	}
	
	public static ArrayList<Integer> leadersArray(int[] arr) {
		int max=0;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] >= max) {
				max=arr[i];
				list.add(max);	
			}
		}
		return new ArrayList<>(list);	
	}

}
