import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class HourglassTest {

	@Test
	void testTopHalf1() {
	      // capture STDOUT
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // execute the main program created by the student
        Hourglass.topHalf(3);
        // convert the main output to a String
        String actualOutput = outputStream.toString();
        // restore STDOUT
        System.setOut(originalOut);
        // what is expected...
		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("|========|\n");
		expectedBuffer.append(" \\      /\n");
		expectedBuffer.append("  \\    /\n");
		expectedBuffer.append("   \\  /\n");

		String expectedStr = expectedBuffer.toString();
		
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr,actualOutput);
	}

	@Test
	void testTopHalf2() {
	      // capture STDOUT
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // execute the main program created by the student
        Hourglass.topHalf(4);
        // convert the main output to a String
        String actualOutput = outputStream.toString();
        // restore STDOUT
        System.setOut(originalOut);
        // what is expected...
		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("|==========|\n");
		expectedBuffer.append(" \\        /\n");
		expectedBuffer.append("  \\      /\n");
		expectedBuffer.append("   \\    /\n");
		expectedBuffer.append("    \\  /\n");

		String expectedStr = expectedBuffer.toString();
		
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr,actualOutput);
	}

	@Test
	void testBottomHalf1() {
	      // capture STDOUT
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // execute the main program created by the student
		Hourglass.bottomHalf(3);
        // convert the main output to a String
        String actualOutput = outputStream.toString();
        // restore STDOUT
        System.setOut(originalOut);
        // what is expected...
		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("   /::\\\n");
		expectedBuffer.append("  /::::\\\n");
		expectedBuffer.append(" /::::::\\\n");
		expectedBuffer.append("|========|\n");

		String expectedStr = expectedBuffer.toString();

		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr, actualOutput);
	}

	@Test
	void testBottomHalf2() {
	      // capture STDOUT
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // execute the main program created by the student
		Hourglass.bottomHalf(4);
        // convert the main output to a String
        String actualOutput = outputStream.toString();
        // restore STDOUT
        System.setOut(originalOut);

		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("    /::\\\n");
		expectedBuffer.append("   /::::\\\n");
		expectedBuffer.append("  /::::::\\\n");
		expectedBuffer.append(" /::::::::\\\n");
		expectedBuffer.append("|==========|\n");

		String expectedStr = expectedBuffer.toString();
		
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr, actualOutput);
	}

	@Test
	void testEdge1() {
	      // capture STDOUT
	        PrintStream originalOut = System.out;
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outputStream));
	        // execute the main program created by the student
	        Hourglass.edge(3);
	        // convert the main output to a String
	        String actualOutput = outputStream.toString();
	        // restore STDOUT
	        System.setOut(originalOut);
	        // what is expected...
		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("|========|\n");
		String expectedStr = expectedBuffer.toString();
		
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr, actualOutput);
	}

	@Test
	void testEdge2() {
	      // capture STDOUT
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // execute the main program created by the student
        Hourglass.edge(4);
        // convert the main output to a String
        String actualOutput = outputStream.toString();
        // restore STDOUT
        System.setOut(originalOut);
        // what is expected...

		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("|==========|\n");
		String expectedStr = expectedBuffer.toString();
		
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr, actualOutput);
	}

	@Test
	void testMiddle1() {
	      // capture STDOUT
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // execute the main program created by the student
        Hourglass.middle(3);
        // convert the main output to a String
        String actualOutput = outputStream.toString();
        // restore STDOUT
        System.setOut(originalOut);
        // what is expected...
		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("    ||\n");
		String expectedStr = expectedBuffer.toString();
		
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr, actualOutput);
	}
	@Test
	void testMiddle2() {
	      // capture STDOUT
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // execute the main program created by the student
        Hourglass.middle(4);
        // convert the main output to a String
        String actualOutput = outputStream.toString();
        // restore STDOUT
        System.setOut(originalOut);
        // what is expected...
		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("     ||\n");
		String expectedStr = expectedBuffer.toString();
		
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr, actualOutput);
	}

	@Test
	void testHourglass1() {
	      // capture STDOUT
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // execute the main program created by the student
        Hourglass.hourglass(3);;
        // convert the main output to a String
        String actualOutput = outputStream.toString();
        // restore STDOUT
        System.setOut(originalOut);
        // what is expected...
		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("|========|\n");
		expectedBuffer.append(" \\      /\n");
		expectedBuffer.append("  \\    /\n");
		expectedBuffer.append("   \\  /\n");
		expectedBuffer.append("    ||\n");
		expectedBuffer.append("   /::\\\n");
		expectedBuffer.append("  /::::\\\n");
		expectedBuffer.append(" /::::::\\\n");
		expectedBuffer.append("|========|\n");


		String expectedStr = expectedBuffer.toString();
		
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr, actualOutput);
	}

	@Test
	void testHourglass2() {
	      // capture STDOUT
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // execute the main program created by the student
        Hourglass.hourglass(4);;
        // convert the main output to a String
        String actualOutput = outputStream.toString();
        // restore STDOUT
        System.setOut(originalOut);
        // what is expected...

		//Build the expected string
		StringBuilder expectedBuffer = new StringBuilder();
		expectedBuffer.append("|==========|\n");
		expectedBuffer.append(" \\        /\n");
		expectedBuffer.append("  \\      /\n");
		expectedBuffer.append("   \\    /\n");
		expectedBuffer.append("    \\  /\n");
		expectedBuffer.append("     ||\n");
		expectedBuffer.append("    /::\\\n");
		expectedBuffer.append("   /::::\\\n");
		expectedBuffer.append("  /::::::\\\n");
		expectedBuffer.append(" /::::::::\\\n");
		expectedBuffer.append("|==========|\n");


		String expectedStr = expectedBuffer.toString();
		
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
			expectedStr = expectedStr.replaceAll("\n", "\r\n");
        }
		assertEquals(expectedStr, actualOutput);
	}

    @Test
    void testConstantCount() throws IllegalArgumentException, IllegalAccessException {
        // get the class constant (if any
        Integer classConstant = getClassConstant();
        // there should be at least 1
        assertTrue(classConstant != null, "Class constant not found.");
    }
    
    @Test
    void testConstantValue() throws IllegalArgumentException, IllegalAccessException {
        // get the class constant (if any)
        Integer classConstant = getClassConstant();
        // class constant should be a positive number
        assertTrue(classConstant != null && classConstant > 0,
        		   "Class constant must be a positive whole number");
    }
    
    @Test
    void testMethodCount() {
        // get a list of methods created by the student
        Class<Hourglass> c = Hourglass.class;
        Method[] methods = c.getMethods();
        // count how many methods are in the base class
        int methodCount = 0;
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].toString().contains("Hourglass")) {
                methodCount++;
            }
        }
        // there should be more than 1 (e.g. more than just 'main')
        assertTrue(methodCount > 2, "More than just main() and HourGlass methods required.");
    }
    
    @Test
    void testHourglassWithConstant() throws IllegalArgumentException, IllegalAccessException {
        // capture STDOUT
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // execute the main program created by the student
        Integer size = getClassConstant();
        Hourglass.hourglass();;
        // convert the main output to a String
        String actualOutput = outputStream.toString();
        // restore STDOUT
        System.setOut(originalOut);
        // what is expected...
   
        z = (size == null) ? 0 : size;
        String expectedOutput = hg();
        if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
            // Windows systems use a carriage return / new line combo
            expectedOutput = expectedOutput.replaceAll("\n", "\r\n");
        }
        // does it match?
        assertEquals(expectedOutput, actualOutput, 
        		     "Output does not match expected.");
    }
    
    // pay no attention to the man behind the curtain
    Integer getClassConstant() throws IllegalArgumentException, IllegalAccessException {
        // get the class constant created by the student
        Integer constant = null;
        Class<Hourglass> c = Hourglass.class;
        Field[] fields = c.getFields();
        // count how many final constants are in the base class
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].toString().contains("final")) {
                constant = fields[i].getInt(null);
                break;
            }
        }
        return constant;
    }

    // abandon all hope ye who enter here
    public String hg(){p("\u007C");for(int i=0;i<0b0010*z+0b0010; i++)
    p("\u003D");p("\u007C\n");for(int i=0;i<z;i++){for(int j=0;j<i+1;
    j++)p("\u0020");p("\u005C\u005C");for(int j=0; j<-0b0010*i+0b0010*z;
    j++)p("\u0020");p("\u002F\n");}for(int i=0;i<z+1;i++)p("\u0020");
    p("\u007C\u007C\n");for(int i=0;i<z;i++){for(int j=0;j<-1*i+z;j++)
    p("\u0020");p("\u002F");for(int j=0;j<0b0010*i+0b0010;j++)p("\u003A");
    p("\u005C\u005C\n");}p("\u007C");for(int i=0;i<0b0010*z+0b0010;i++)
    p("\u003D");p("\u007C\n");return o;}public void p(String s){o+=s;}
    int z=0;String o="";
}
