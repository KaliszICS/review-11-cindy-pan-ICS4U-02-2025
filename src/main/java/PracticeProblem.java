public class PracticeProblem {

	public static int[] createIntArray(){
		int numArray[];
		numArray = new int[5];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i + 1;
		}
		return numArray;
	}

	public static String[] createArray(String a, String b, String c, String d){
		String[] stringArray = {"","","",""};
		stringArray[0] = a;
		stringArray[1]=b;
		stringArray[2]=c;
		stringArray[3]=d;
		return stringArray;
	}

	public static int findValue(int tester, int[] find){
		int index =(-1);
		for (int a = 0; a<find.length; a++){
			if (find[a]==tester){
				index = a;
				a = find.length;
			}

		}
		return index;
	}

	public static int findThirdValue(String test, String[] word){
		int index = -1;
		int occur = 0;
		if (occur <3){
			for (int at=0; at<word.length; at++){
				if (test==word[at]){
					occur = occur+1;
				}
				if (occur==3){
					index = at;
				}
		
			}
		}
		
		return index;
	}
	
}