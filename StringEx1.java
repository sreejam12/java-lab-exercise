package string;

public class StringEx1 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		String s3="hello";
		System.out.println(s1+" "+s2+" "+s3);
		System.out.println(s1.concat("kamatchi"));
		//System.out.println(s1+" "+s2+" "+s3);
		//s1=s1.concat("kitty");
		System.out.println(s1+" "+s2+" "+s3);
		if(s1==s3) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		if(s1.equals(s3)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
