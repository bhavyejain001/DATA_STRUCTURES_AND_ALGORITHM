
		/*Input:  
		[
		  "abcd",
		  "bnrt",
		  "crmy",
		  "dtye"
		]
		Output: true
		Explanation:
		The first row and first column both read "abcd".
		The second row and second column both read "bnrt".
		The third row and third column both read "crmy".
		The fourth row and fourth column both read "dtye".
*/

public class Valid_Word_Square {
	public static void main(String[] args) {
		String[] words= {"abcd",
					     "bnrt",
					     "crmy",
					 	 "dtye"  };
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words[i].length();j++) {
				if(j >= words.length || words.length <= i ||words[i].charAt(j)!=words[j].charAt(i)) {
					System.out.println("Not A Valid Word Square");
					return;
				}
			}
		}
		System.out.println("Valid Word Square");			
	}
}
