
public class StringEs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "  Ciao come  va bello     ";
		
		//elimino spazi in testa e coda 
		s = s.trim();
		
		// elimino i singoli spazi con una stringa vuota
		s = s.replace(" ", "");
		System.out.println(s);
		
	}

}
