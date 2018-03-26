package amdocs.testing.automation.Level0GenricPrograms;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		char[] webSiteName = { 'T', 'O', 'O', 'L', 'S', 'Q', 'A'};
		String webSite = new String(webSiteName);  
		System.out.println( webSite );

		String sPopularTopic = "Selenium Automation Framework";
		  int ilength = sPopularTopic.length();

		  //Print the value of String variable & int Variable
		  System.out.println("Popular Topic of ToolsQA: " +  sPopularTopic);
		  System.out.println("Length of the Popular Topic: " +  ilength);
		  
		  
		//Declaring the String Variables
		  String sPopularTopic_1 = "Selenium Automation Framework";
		  String sPopularTopic_2 = "Basic Java Tutorial";
		  String sSpace = " ";
 
		  //Print the value of Concat String
		  //String1.concat(String2);
		  System.out.println("First Output");
		  System.out.println(sPopularTopic_1.concat(sPopularTopic_2));
 
		  //Another way of using String Concat
		  //"String1".concat(String2);
		  System.out.println("Second Output");
		  System.out.println("Selenium Automation Framework".concat(sPopularTopic_2));
 
		  //Another way of using String Concat
		  //"String1" + "String2";
		  System.out.println("Third Output");
		  System.out.println("Selenium Automation Framework" + "Basic Java Tutorial");
 
		  //Another way of using String Concat
		  //"String1" + String + "String2";
		  System.out.println("Fourth Output");
		  System.out.println("Selenium Automation Framework" +sSpace+ "Basic Java Tutorial");
		  
		  
		//Compare two String: This would compare two strings
		  //If the twos strings are equal, it will return 'true' else it will return 'false'
		  boolean bCompareResult = sPopularTopic_1.equals(sPopularTopic_2);
		  System.out.println("The result of String Comparison is : " + bCompareResult);

	//	  String sPopularTopic_1 = "Selenium Automation Framework";
	//	  String sPopularTopic_2 = "Basic Java Tutorial";
		  
		  //Character at: This would return the single character at index value from the String
		  char cIndex = sPopularTopic_1.charAt(6);
		  System.out.println("The fifth character of Popular Topic 1 is : " + cIndex);
 
		  //Contains: This would return 'true' if the passed string is contained in the another String
		  boolean bContainResult = sPopularTopic_1.contains("Framework");
		  System.out.println("The result of string Framework is contained in the String sPopularTopic_1 is : " + bContainResult);
 
		  //Index of: This would return the starting index of the passed string
		  int iIndex = sPopularTopic_1.indexOf("Framework");
		  System.out.println("The start index of the string Framework is : " + iIndex);
 
		  //Sub String First index: This would return the sub string of the string from the passed index number
		  String sSubString = sPopularTopic_1.substring(iIndex);
		  System.out.println("The sub string from the index value "+iIndex+" is : " + sSubString);
 
		  //Sub String First & Last index: This would return the sub string from first index to end index
		  sSubString = sPopularTopic_1.substring(8, 19);
		  System.out.println("The sub string of Popular Topic 1 from index 8 to 18 is : " + sSubString);
 
		  //To Lower Case: It would return the complete string in the lower case
		  String sLowerCase = sPopularTopic_1.toLowerCase();
		  System.out.println("The lower case of the Popular Topic 1 is : " + sLowerCase);
 
		  
		//Split: It breaks the string in to two parts from the passed argument and store it in to array
		  String [] aSplit = sPopularTopic_1.split("Automation");
		  System.out.println("The first part of the array is : " + aSplit[0]);
		  System.out.println("The last part of the array is : " + aSplit[1]);
 
 
	}

}
