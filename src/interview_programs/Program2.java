package interview_programs;

import java.util.ArrayList;

public class Program2 {
	public static void main(String[] args) 
	{      
		String str = "abc23de76f9gh233ij45klm50";
		System.out.println(getIntegers(str));
	}
	public static ArrayList<Integer> getIntegers(String str)
	{
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(c>='0' && c<='9')
			{
				StringBuilder sb = new StringBuilder(c+"");
				i++;
				while(i<str.length() && str.charAt(i) >='0' && str.charAt(i)<='9'){
					sb.append(str.charAt(i)+"");
					i++;
				}
				list.add(Integer.parseInt(sb.toString()));
			}
		}
		return list;
	}
}
