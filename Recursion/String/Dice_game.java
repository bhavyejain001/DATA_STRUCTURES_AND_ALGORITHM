import java.util.ArrayList;

public class Dice_game {
	
	//using ArrayList
//	static ArrayList<String> findCombinations(int currValue,int endValue) {
//		if(currValue==endValue) {
//			ArrayList<String> s=new ArrayList<>();
//			s.add("");
//			return s;
//		}
//		if(currValue > endValue) {
//			ArrayList<String> s=new ArrayList<>();
//			return s;
//		}
//		ArrayList<String> result=new ArrayList<>();
//		for(int dice=1;dice<=6;dice++) {
//			int newValue = currValue + dice;
//			ArrayList<String> temp=findCombinations(newValue, endValue);
//			for(String t:temp) {
//				result.add(dice+t);
//			}
//		}
//		return result;
//	}
	
	//using void
	static void findCombinations(int currValue,int endValue,String result) {
		if(currValue==endValue) {
			System.out.println(result);
			return;
		}
		if(currValue > endValue) {
			return ;
		}for(int dice=1;dice<=6;dice++) {
			int newValue = currValue + dice;
		findCombinations(newValue, endValue, result+dice);
		}
	}
	
	public static void main(String[] args) {
		findCombinations(0,6,"");
	}
}
