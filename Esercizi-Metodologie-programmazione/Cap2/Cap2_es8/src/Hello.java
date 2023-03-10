
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello, World!";
		s = s.replace("e", "%");
		s = s.replace("o","e");
		s = s.replace("%", "o");
		System.out.println(s);
	}

}
