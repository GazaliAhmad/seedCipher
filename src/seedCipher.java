import java.util.Scanner;
import static java.lang.System.err;
import static java.lang.System.out;

public class seedCipher {
		public static void main(String[] args) {
			
			out.println("\nEnter a message to encrypt: ");
			var enc = new Scanner(System.in);
			var encMessage = enc.nextLine();
			
			var keyString = randomKeyGen.randomKeyGenerator(encMessage);
			err.println("\nCopy the key (It's NOT RECOVERABLE): " + keyString);
			
			new encrypt(encMessage, keyString);
			
			out.println("\nEnter a message to encrypt: ");
			var dec = new Scanner(System.in);
			var decMessage = dec.nextLine();
			
			out.println("\nEnter the key: ");
			var key = new Scanner(System.in);
			var encKeyString = key.nextLine();
			
			new decrypt(decMessage, encKeyString);
	}
}