import org.jetbrains.annotations.NotNull;

import static java.lang.System.err;

public class decrypt {
	@SuppressWarnings("ReassignedVariable")
	public decrypt(@NotNull String decMessage, String keyString) {
		var decryptedMessage = new StringBuilder();
		final var seedLength = 26;
		{
			var i = 0;
			while (i < decMessage.length()) {
				var j = decMessage.charAt(i) - keyString.charAt(i);
				var c = (char) j;
					if (c < 'a') decryptedMessage.append((char) (decMessage.charAt(i) + (seedLength - keyString.charAt(i))));
					else decryptedMessage.append((char) j);
				i++;
			}
		}
		err.println("\nDecrypted message: \n" + decryptedMessage);
	}
}