package festival;

public class Ex35getMiddle메소드 {

	public static void main(String args[]) {
		
        System.out.println(getMiddle("power"));

	}
    public static String getMiddle(String str) {
		
		String[] arr = new String[str.length()-1];
		arr = str.split("");
		String result = "";
		if(str.length()%2==1) {
			result = arr[str.length()/2];
		}
		else {
			result = arr[str.length()/2-1] + arr[str.length()/2];
		}
		return result;
    }
}