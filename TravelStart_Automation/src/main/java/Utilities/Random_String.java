package Utilities;




import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class Random_String {

	private static final String CHAR_LIST ="abcdefghijklmnopqrstuvwxyz";

	private static final int RANDOM_STRING_LENGTH = 4;

	private static final String email = "h123t@testxp.com";

	private static final String username = "htara";

	private static final String message = "hellotara";
    
//	Random randomgenerator=new Random();
// 	int randomInt= randomgenerator.nextInt(1000);

	/*
	 *  [TestMethod]
	 *  [Description("Generate Random Email")] 
	 */

	public static String generateRandomString(){

		StringBuffer randStr = new StringBuffer();
		
		StringBuffer randStr2 = randStr.append(email);

		for(int i=0; i<RANDOM_STRING_LENGTH; i++){

			int number = getRandomNumber();

			char ch = CHAR_LIST.charAt(number);

			randStr2.insert(1, ch);

		}

		return randStr.toString();

	}
	
	/*
	 *  [TestMethod]
	 *  [Description("Generate Random UserName")] 
	 */
	public static String generateRandomStrin(){

		StringBuffer randStr = new StringBuffer();

		StringBuffer randStr2 = randStr.append(username);

		for(int i=0; i<RANDOM_STRING_LENGTH; i++){

			int number = getRandomNumber();

			char ch = CHAR_LIST.charAt(number);

			randStr2.insert(1, ch);

		}

		return randStr.toString();

	}

	/*
	 *  [TestMethod]
	 *  [Description("Generate Random Number")] 
	 */

	private static int getRandomNumber() {

		int randomInt = 0;

		Random randomGenerator = new Random();

		randomInt = randomGenerator.nextInt(CHAR_LIST.length());

		if (randomInt - 1 == -1) {

			return randomInt;

		} else {

			return randomInt - 1;

		} 

	}


	/*
	 *  [TestMethod]
	 *  [Description("Generate Random Message")] 
	 */
	
	public static String getRandommessage() {

		StringBuffer randStr = new StringBuffer();

		StringBuffer randStr2 = randStr.append(message);

		for(int i=0; i<RANDOM_STRING_LENGTH; i++){

			int number = getRandomNumber();

			char ch = CHAR_LIST.charAt(number);

			randStr2.insert(1, ch);

		}

		return randStr.toString();




	}

	/**
	 *  [TestMethod]
	 *  [Description("To get current date and time ")] 
	 */
	public static String getReportTime(){
		Date myDate = new Date();
		String time = (new SimpleDateFormat("dd MMMMM yyyy hh:mm a").format(myDate));
		return time;
	}





}