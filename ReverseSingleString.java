import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSingleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = new String("New York Times");
		
		StringBuilder sbOutput = new StringBuilder();
		List<String> strList = Arrays.asList(inputString.split(" "));
		Collections.reverse(strList);
		System.out.println(strList);
		for (String s2: strList)
		{
			sbOutput.append(s2).append(" ");
		}
		//System.out.println(strList);
		System.out.println(sbOutput);
	}

}
