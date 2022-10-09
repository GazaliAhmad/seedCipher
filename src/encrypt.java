import org.jetbrains.annotations.NotNull;

import static java.lang.System.err;

public class encrypt {
	@SuppressWarnings("ReassignedVariable")
	public encrypt(@NotNull String message, @NotNull String keyString) {
		var encryptedMessage = new StringBuilder();
		final var seedLength = 26;
		{
			var i = 0;
			while (i < message.length()) {
				var j = message.charAt(i) + keyString.charAt(i);
				var c = (char) j;
					if (c > 'z') encryptedMessage.append((char) (message.charAt(i) - (seedLength - keyString.charAt(i))));
					else encryptedMessage.append((char) j);
				i++;
			}
		}
		err.println("\nEncrypted message: (COPY IT)\n" + encryptedMessage);
	}
}
