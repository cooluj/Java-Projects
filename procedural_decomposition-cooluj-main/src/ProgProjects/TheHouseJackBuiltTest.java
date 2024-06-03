package ProgProjects;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TheHouseJackBuiltTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@BeforeEach
	void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));

	}

	@AfterEach
	void tearDown() throws Exception {
	    System.setOut(originalOut);
	    System.setErr(originalErr);

	}

	@Test
	void testMain() throws UnsupportedEncodingException {
		ProgProjects.TheHouseJackBuilt.main(null);
		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("This is the house that Jack built.\n");
		expectedBuffer.append("\n");
		expectedBuffer.append("This is the malt that lay in the house that Jack built.\n");
		expectedBuffer.append("\n");
		expectedBuffer.append("This is the rat that ate the malt\n");
		expectedBuffer.append("That lay in the house that Jack built.\n");
		expectedBuffer.append("\n");
		expectedBuffer.append("This is the cat\n");
		expectedBuffer.append("That killed the rat that ate the malt\n");
		expectedBuffer.append("That lay in the house that Jack built.\n");
		expectedBuffer.append("\n");
		expectedBuffer.append("This is the dog that worried the cat\n");
		expectedBuffer.append("That killed the rat that ate the malt\n");
		expectedBuffer.append("That lay in the house that Jack built.\n");
		expectedBuffer.append("\n");
		expectedBuffer.append("This is the cow with the crumpled horn\n");
		expectedBuffer.append("That tossed the dog that worried the cat\n");
		expectedBuffer.append("That killed the rat that ate the malt\n");
		expectedBuffer.append("That lay in the house that Jack built.\n");
		expectedBuffer.append("\n");
		expectedBuffer.append("This is the maiden all forlorn\n");
		expectedBuffer.append("That milked the cow with the crumpled horn\n");
		expectedBuffer.append("That tossed the dog that worried the cat\n");
		expectedBuffer.append("That killed the rat that ate the malt\n");
		expectedBuffer.append("That lay in the house that Jack built.");

		String expectedStr = expectedBuffer.toString();
		
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr, outContent.toString(Charset.defaultCharset().displayName()).trim());
	}
	
}
