import java.util.HashMap;

public class ProfessorAndParties {

	public static void main(String[] args) {
		long[] arr= {1,3,4,5,6};
		if(uniqueColor(arr)) {
			System.out.println("Girl's Party");
		}else {
			System.out.println("Boys's Party");
		}
	}
	public static boolean uniqueColor(long[] arr) {
//		HashMap<Integer, Boolean> map = new HashMap<>();
//		for(int i = 0; i<arr.length; i++) {
//			if(map.get((int)arr[i])==null) {
//				map.put((int) arr[i], true);
//			}
//			else {
//				return false;
//			}
//		}
//		return true;
		for(int i = 0; i<arr.length; i++) {
			if(arr[Math.abs((int)arr[i])]>=0) {
				arr[Math.abs((int)arr[i])] = - arr[Math.abs((int)arr[i])];
			}
			else {
				return false;
			}
		}
		return true;;
	}	
}
