import org.jetbrains.annotations.NotNull;
import java.util.Random;

class randomKeyGen {
	
	@SuppressWarnings("ReassignedVariable")
	public static @NotNull String randomKeyGenerator(@NotNull String message) {
		final var key = new StringBuilder();
		final var seed = "lmabstcdpqryzfghijenokuvwx";
		final var seedLength = seed.length();
		final var random = new Random();
		final var limit = 127;
		
		{
			var i = 0;
			while (i < message.length()) {
				var j = random.nextInt(limit);
					var c = (char) j;
					if (c >= 'a' && c <= 'z') key.append(c);
					else key.append(seed.charAt(random.nextInt(seedLength)));
				i++;
			}
		}
		return key.toString();
	}
}


/*
{
	var i = 0;
		while (i < message.length()) {
			key.append(seed.charAt(random.nextInt(seedLength)));
			i++;
			}
		}
*/