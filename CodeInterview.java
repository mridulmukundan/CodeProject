import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeInterview {

	final static String SPACE = " ";

	public static void main(String[] args) {

		for (String strInput : args) {
			List<String> strList = Arrays.asList(strInput.split(SPACE));
			StringBuilder sbOutput = new StringBuilder();
			Collections.reverse(strList);
			for (String strTemp : strList) {
				sbOutput.append(strTemp).append(SPACE);
			}

			System.out.println(sbOutput);
		}
	}
}
