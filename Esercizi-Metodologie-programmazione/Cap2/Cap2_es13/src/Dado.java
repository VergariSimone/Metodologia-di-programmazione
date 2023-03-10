import java.util.Random;
public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random dado = new Random();
	    System.out.println(dado.nextInt(6)+1);
	}

}
