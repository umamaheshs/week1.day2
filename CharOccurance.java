package week1.day2;
public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count=0;

     char[] charArray = str.toCharArray();
     int length = charArray.length;
     for (int i = 0; i < charArray.length; i++) {
    	 if(charArray[i]=='w')
    		 count++;
		
	}
	 System.out.println("character occurs : "+count+" time(s)");

	}

}