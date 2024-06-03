import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BattleProjectV1Test {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayInputStream inContent = new ByteArrayInputStream("Arcanine".getBytes());
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final InputStream originalIn = System.in;
	private final PrintStream originalErr = System.err;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		// set system.in in test methods to have more flexibility.
	    System.setErr(new PrintStream(errContent));
    
	}
	@AfterEach
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setIn(originalIn);
	    System.setErr(originalErr);
	}

	@Test
	void testBattleStart() {
		String pokemon1 = "Pikachu";
		String pokemon2 = "Rayquazza";
		
		String phrase1 = "Another trainer is issuing a challenge!\n\n" + pokemon1 + " appeared.\n\n";
	    String ask = "Which Pokemon do you choose?";
	    String phrase2 = "\nYou chose " + pokemon2 + "!\n\n";
		String phrase3 = "It's a Pokemon battle between " + pokemon1 + " and " + pokemon2 + "!  Go!";
		
		// Specify the Pokemon that the "user" types in.
		System.setIn(new ByteArrayInputStream(pokemon2.getBytes()));
		String shouldBeSameAsPokemon2Variable = BattleProjectV1.battleStart(pokemon1);
		
		String expectedOutput = phrase1 + ask + phrase2 + phrase3;
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
        	// Windows systems use a carriage return / new line combo
        	expectedOutput = expectedOutput.replaceAll("\n", "\r\n");
        }
        // does it match?
		assertEquals(expectedOutput,outContent.toString().trim());
	}

	@Test
	void testBattleStartRetVal() {
		String pokemon1 = "Pikachu";
		String pokemon2 = "Rayquazza";
		
		// Specify the Pokemon that the "user" types in.
		System.setIn(new ByteArrayInputStream(pokemon2.getBytes()));
		String shouldBeSameAsPokemon2Variable = BattleProjectV1.battleStart(pokemon1);

		// does it match?
		assertEquals(pokemon2,shouldBeSameAsPokemon2Variable);
	}
	@Test
	void testDamagePikachuAttackArcanine() {
		//Pikachu stats
		int pokemon1Level = 25;
		int pokemon1Attack = 112;
		int pokemon1AttackPower = 80; 
		//Arcanine stats
		int pokemon2Defense = 166;
		// Use the Pokemon's Stamina value as it's initial HP.
		int pokemon2HP = 207;
		double pokemon1STAB = 1.2;
		
		int moveEffect = BattleProjectV1.damage(pokemon1Level, pokemon1Attack, pokemon2Defense, pokemon1AttackPower, pokemon1STAB);
		assertTrue(moveEffect >= 28 && moveEffect <= 33);
	}

}
