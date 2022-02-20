package string;

public class strRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCD";
		String rev=" ";
		/*int len=str.length();//4
		for(int i=len-1;i>=0;i--)//3
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse of string:"+rev);*/
		
		
		// using char array
	char a[]=str.toCharArray();
	int len=str.length();//4
	for(int i=len-1;i>=0;i--)//3
	{
		rev=rev+a[i];	
	}
	
	System.out.println("reverse of string:"+rev);
}

}
