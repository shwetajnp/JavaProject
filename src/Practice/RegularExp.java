package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
	Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
	Matcher matcher = pattern.matcher("Visit w3schools");
	Boolean matchfound = matcher.find();//github integration
	if(matchfound) {
		System.out.println("Match found");
	}
	else {
		System.out.println("Match not found");
	}
	}
}
