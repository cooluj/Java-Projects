import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;
import java.util.ArrayList;

public class Steganography {

  public static void main(String[] args) {
    //System.out.println(Integer.parseInt((Integer.toBinaryString(1) + Integer.toBinaryString(2) + Integer.toBinaryString(3)), 2));

    Picture beach1dot12 = new Picture("img/beach.jpg");
    Pixel[][] thing = beach1dot12.getPixels2D();
    //System.out.println(thing[0][1].getRed() % 4);
    Picture balls = hideText(beach1dot12, "Hello World");
    Pixel[][] thing2 = balls.getPixels2D();
    System.out.println(thing2[0][11].getBlue() % 4);
    //revealText(balls);
    ////////////////////////////////////////////////////////////////
    // ACTIVITY 1 Client Code: Exploring Color



    ////////////////////////////////////////////////////////////////
    // ACTIVITY 2 Client Code: Hiding and Revealing a Picture

  
    ////////////////////////////////////////////////////////////////
    // ACTIVITY 3 Client Code: Identifying a Hidden Picture

    /**
	        // Exercise 3.1
	        Picture beach3dot1 = new Picture("img/beach.jpg");
	        beach3dot1.setTitle("3.1 Beach Original");
	        beach3dot1.explore();
	        // hide the robot and flower pictures in the beach picture
	        Picture robot3dot1 = new Picture("img/robot.jpg");
	        Picture flower3dot1 = new Picture("img/flower1.jpg");
	        if (canHide(beach3dot1, robot3dot1, 65, 208) && canHide(beach3dot1, flower3dot1, 280, 110)) {
	            Picture temp = hidePicture(beach3dot1, robot3dot1, 65, 208);
	            Picture hidden = hidePicture(temp, flower3dot1, 280, 110);
	            hidden.setTitle("3.1 Beach with Hidden Pictures");
	            hidden.explore();
	            Picture unhidden = revealPicture(hidden);
	            unhidden.setTitle("3.1 Beach with Revealed Pictures");
	            unhidden.explore();
	        }
	
	        // Exercise 3.2
	        Picture swanCopy1 = new Picture("img/swan.jpg");
	        Picture swanCopy2 = new Picture("img/swan.jpg");
	        System.out.print("Swan1 and swan2 are the same? ");
	        System.out.println(isSame(swanCopy1, swanCopy2));
	        swanCopy2 = testClearLow(swanCopy2);
	        System.out.print("Swans are the same after clearLow on swan2? ");
	        System.out.println(isSame(swanCopy1, swanCopy2));
	
	        // Exercise 3.3
	        Picture archCopy1 = new Picture("img/arch.jpg");
	        Picture archCopy2 = new Picture("img/arch.jpg");
	        Picture koala3dot3 = new Picture("img/koala.jpg");
	        Picture robot3dot3 = new Picture("img/robot.jpg");
	        ArrayList<Point> list33 = findDifferences(archCopy1, archCopy2);
	        System.out.print("Number of pixels different between arch and arch: ");
	        System.out.println(list33.size());
	        list33 = findDifferences(archCopy1, koala3dot3);
	        System.out.print("Number of pixels different between arch and koala: ");
	        System.out.println(list33.size());
	        archCopy2 = hidePicture(archCopy1, robot3dot3, 65, 102);
	        list33 = findDifferences(archCopy1, archCopy2);
	        System.out.print("Number of pixels different between arch with hidden ");
	        System.out.print("image and original arch image: ");
	        System.out.println(list33.size());
	        archCopy1.setTitle("3.3 Original Arch");
	        archCopy1.explore();
	        archCopy2.setTitle("3.3 Arch with Hidden Image");
	        archCopy2.explore();
	        Picture revealed3dot3 = revealPicture(archCopy2);
	        revealed3dot3.setTitle("3.3 Revealed Hidden Picture");
	        revealed3dot3.explore();
	
	        // Exercise 3.4
	        Picture templeCopy1 = new Picture("img/femaleLionAndHall.jpg");
	        Picture robot3dot4 = new Picture("img/robot.jpg");
	        Picture flower3dot4 = new Picture("img/flower1.jpg");
	        // hide pictures
	        Picture templeCopy2 = hidePicture(templeCopy1, robot3dot4, 50, 300);
	        Picture templeCopy3 = hidePicture(templeCopy2, flower3dot4, 115, 275);
	        templeCopy3.setTitle("3.4 Original Female Lion and Hall");
	        templeCopy3.explore();
	        if (!isSame(templeCopy1, templeCopy3)) {
	            ArrayList<Point> list34 = findDifferences(templeCopy1, templeCopy3);
	            System.out.print("Number of pixels different between temple with hidden ");
	            System.out.print("images and original arch image: ");
	            System.out.println(list34.size());
	            Picture templeCopy4 = showDifferentArea(templeCopy1, list34);
	            templeCopy4.setTitle("3.4 Show Different Area");
	            templeCopy4.explore();
	            Picture unhidden = revealPicture(templeCopy3);
	            unhidden.setTitle("3.4 Temple with Hidden Pictures");
	            unhidden.explore();
	        }
	         **/

    ////////////////////////////////////////////////////////////////
    // ACTIVITY 4 Client Code: Hiding and Revealing a Text Message

    /**
    // Exercise 4.4
    Picture beach4dot4 = new Picture("img/beach.jpg");
    beach4dot4.setTitle("4.4 Original Beach Image");
    beach4dot4.explore();
    Picture hiddenText = hideText(beach4dot4, "Have fun storming the castle");
    hiddenText.setTitle("4.4 Beach Image with Hidden Text");
    hiddenText.explore();
    String secret = revealText(hiddenText);
    if (secret.equals("Have fun storming the castle")) {
        System.out.println("If only you had a wheelbarrow. (Success!)");
    }
    else {
        System.out.println("Do you think it worked? (It didn't.)");
    }
    **/

    ////////////////////////////////////////////////////////////////
  }

  ////////////////////////////////////////////////////////////////////
  //
  // ACTIVITY 1 Methods: Exploring Color
  //

  //////////////////////////////////////////////////
  // Changing Colors (Exercise 1.6-1.8)

  // clear the lower (rightmost) two bits of each RGB in a pixel
  public static void clearLow(Pixel p) {
    // extract the red, green, and blue values from the pixel
    int r = p.getRed();
    int g = p.getGreen();
    int b = p.getBlue();
    // TODO (1.6): clear the lowest two bits of each RGB component
    /** not yet implemented **/

    //by dividing by four, we are isolating the last two bits
    //then we multiply by 4, to bring the bits to the front

    r = r / 4 * 4;
    g = g / 4 * 4;
    b = b / 4 * 4;

    // TODO (1.7): set the red, green, and blue component values of
    // the pixel to the new values using the RGB setter methods

    //this is just setting the values of the colors to the new cleraed bits
    p.setRed(r);
    p.setBlue(b);
    p.setGreen(g);
    /** not yet implemented **/

  }

  // create a copy of a picture and clear the lower two bits of each
  // pixel in the copy using the clearLow() method
  public static Picture testClearLow(Picture original) {
    // create a new picture as a copy of the original
    Picture copy = new Picture(original);
    // get the array of pixels from the copy
    Pixel[] pixels = copy.getPixels();
    // TODO (1.8): use a for each loop to iterate over the pixels
    // array and clear the low bits of each pixel in the array
    /** not yet implemented **/

    //clear the pixels of all the lists
    //turns out that there is no noticable difference to the human eye 
    for (Pixel p: pixels) {
      clearLow(p);
    }

    // return the copy
    return copy;
  }

  //////////////////////////////////////////////////
  // Setting Bits (Exercise 1.10-1.12)

  // set the lower (rightmost) two bits of each RGB in a pixel
  // to the higher (leftmost) two bits of each RGB in Color c
  public static void setLow(Pixel p, Color c) {
    // clear the lowest 2 bits for each RGB value of the pixel
    clearLow(p);
    // get the RGB components from the Color parameter
    int r = c.getRed();
    int g = c.getGreen();
    int b = c.getBlue();
    // TODO (1.10): get the highest two bits of each RGB component
    /** not yet implemented **/
    //when we divide by 64, we are isolating the first two bits of the 8 bit binary number
    //after doing that: 
    r = r / 64;
    g = g / 64;
    b = b / 64;

    // TODO (1.11): store the highest two bits of each RGB component
    // in the lower two bits of the "cleared" pixel
    /** not yet implemented **/
    //we can add them to the color to make them the last bits
    p.setRed(p.getRed() + r);
    p.setGreen(p.getGreen() + g);
    p.setBlue(p.getBlue() + b);

  }

  // create a copy of a picture; clear the lower two bits of the copy,
  // then set the lower two bits to the higher two bits of a color
  public static Picture testSetLow(Picture original, Color c) {
    // create a new picture as a copy of the original
    Picture copy = new Picture(original);
    // get the array of pixels from the copy
    Pixel[] pixels = copy.getPixels();
    // TODO (1.12): use a for each loop to iterate over the pixels;
    // set the lower two bits to the higher two bits of the color
    /** not yet implemented **/
    for (Pixel p: pixels) {
      setLow(p, c);
    }

    // return the copy
    return copy;
  }

  //////////////////////////////////////////////////
  // Revealing Bits (Exercise 1.13-1.14)

  // create a blank picture; reveal the hidden picture in the source
  // by setting the highest two bits of each pixel in the blank image
  // extracted from the lowest two bits of each pixel in the source
  public static Picture revealPicture(Picture hidden) {
    int r = 0;
    int g = 0;
    int b = 0;
    // get the 2D array of pixels from the source image
    Picture copy = new Picture(hidden);
    Pixel[][] source = copy.getPixels2D();
    // create a new (blank) picture with the same dimensions as the
    // picture that will contain the hidden image
    // get the 2D array of pixels from the new (blank) picture
    Pixel[][] target = hidden.getPixels2D();
    // TODO (1.13): iterate over the 2D array of the source pixels
    // using a nested for loop

    //in the nested for loop
    //moding by 4 then multiplying by 64 gets the lowest two bits
    //then we set those bits as the highest values in the piel
    for (int i = 0; i < source.length; i++) {
      for (int j = 0; j < source[0].length; j++) {
        Color c = target[i][j].getColor();
        r = c.getRed()/4;
        g = c.getGreen() / 4;
        b = c.getBlue() / 4;
        r *= 4;
        g *= 4;
        b *= 4;
        int lowRed = c.getRed() - r;
        int lowGreen = c.getGreen() - g;
        int lowBlue = c.getBlue() - b;
        int temp1 = source[i][j].getRed()/64;
        int temp2 = source[i][j].getGreen() / 64;
        int temp3 = source[i][j].getBlue() / 64;
        temp1*=64;
        temp2 *=64;
        temp3 *=64;
        source[i][j].setRed(source[i][j].getRed() - temp1);
        source[i][j].setGreen(source[i][j].getGreen() - temp2);
        source[i][j].setBlue(source[i][j].getBlue() - temp3);
        
        source[i][j].setRed(source[i][j].getRed() + (lowRed * 64));
        source[i][j].setGreen(source[i][j].getGreen() + (lowGreen * 64));
        source[i][j].setBlue(source[i][j].getBlue() + (lowBlue * 64));
        

      }
    }
    /** not yet implemented **/

    // TODO (1.14): inside of the nested for loop, get the 
    // lowest two bits of each RGB component value from the 
    // "source" pixels in the hidden image.  then set those
    // values as the highest two bits in the corresponding
    // "target" pixel of the revealed image
    /** not yet implemented **/

    // return the revealed image
    return copy;
  }

  ////////////////////////////////////////////////////////////////////
  //
  // ACTIVITY 2 Methods: Hiding and Revealing a Picture
  //

  // Exercise 2.8
  // returns true if source and secret images have the same dimensions
  //
  // **ATTENTION**:
  // Do not rewrite this method for exercise 3.0!  There is a separate
  // overloaded canHide() method that exists in the Activity 3 section
  // where the overloaded method will be implemented.
  //
  public static boolean canHide(Picture source, Picture secret) {
    // TODO (2.8): determine whether secret can be hidden in source,
    // which for this activity is only true if both the source image
    // and the secret image have the same exact dimensions
    /** not yet implemented **/

    //if the height and width are the exact same time: it will return true
    if (source.getHeight() == secret.getHeight() && source.getWidth() == secret.getWidth()) {
      return true;
    }
    return false;
  }

  // Exercise 2.9
  // creates a new Picture with data from secret hidden in the RGB
  // information of source (source has same dimensions as secret)
  public static Picture hidePicture(Picture source, Picture secret) {
    // TODO (2.9): hide a secret picture within a source picture
    /** not yet implemented **/
    //strat:
    //first thing is we get the first two bits of the secret picture
    //then we put that in the last two bits of the source image

    //creating a new picture that is a replica of the source
    Picture newSource = new Picture(source);

    Pixel[][] sourceArr = newSource.getPixels2D();
    Pixel[][] secretArr = secret.getPixels2D();
    for (int i = 0; i < sourceArr.length; i++) {
      for (int j = 0; j < sourceArr[0].length; j++) {
        //for every item in the 2d pixel array, we clear the last two bits
        //and set them as the first two bits in the secret  
        setLow(sourceArr[i][j], secretArr[i][j].getColor());

      }
    }

    return newSource;
  }

  ////////////////////////////////////////////////////////////////////
  //
  // ACTIVITY 3 Methods: Identifying a Hidden Picture
  //

  // Exercise 3.0
  // returns true if secret image can be embedded in the source image
  // at the specified row and column without exceeding the maximum
  // bounds of the source image. (maxrows = height, maxcols = width)
  public static boolean canHide(Picture source, Picture secret, int row, int col) {
    // the first couple of conditionals check edge cases

    //if the row or col is negative, then it will return false
    //since you can't have a negative row or col
    if (row < 0 || col < 0) {
      return false;
    }

    //if the row is bigger than the height, or the col is bigger than the width
    //if will return false
    if (row > source.getHeight() || col > source.getWidth()) {
      return false;
    }

    //if secret picture is bigger than the source
    //it will return false
    if (secret.getHeight() > source.getHeight() || secret.getWidth() > source.getWidth()) {
      return false;
    }

    //after the edge cases
    //if the source  - the row length is greater than or equal to the secret row length
    //AND the source col length - the secret col length is greater than or equal to the secret col length
    //then the picture will be able to fit
    if (source.getPixels2D().length - (row - 1) >= secret.getPixels2D().length) {
      if (source.getPixels2D()[0].length - (col - 1) >= secret.getPixels2D()[0].length) {
        return true;
      }
    }
    // TODO (3.0): determine whether the secret image can be
    // hidden inside the source image at position [row][col]
    /** not yet implemented **/

    //if the above if statement doesn't return true
    //then that means the picture can't fit
    //so it returns false
    return false;
  }

  // Exercise 3.1
  // creates a new Picture with data from secret hidden in the RGB
  // information in source beginning at pixel location (row, col)
  public static Picture hidePicture(Picture source, Picture secret, int row, int col) {
    //copying the source picture
    Picture newSource = new Picture(source);

    //creating a 2d array of the pixels in source and secret
    Pixel[][] secretPixels = secret.getPixels2D();
    Pixel[][] sourcePixels = newSource.getPixels2D();
    //row counters, 
    //one starts from row, and the other starts from 0, will be useful in while loop
    int rowCounter = 0;
    int rowCopy = row;

    //for all rows in secret
    while (rowCounter < secretPixels.length) {
      //column counters
      //one starts at 0, the other at column
      int colCopy = col;
      int colCounter = 0;
      //for all columns in secret 
      while (colCounter < secretPixels[0].length) {
        //clears the bottom two pixels of source, then adds the top two pixels of secret to the cleared source pixels
        setLow(sourcePixels[rowCopy][colCopy], secretPixels[rowCounter][colCounter].getColor());
        colCopy++;
        colCounter++;
      }
      rowCopy++;
      rowCounter++;

    }

    // TODO (3.1): hide a secret image within a source image that is
    // anchored at position [row][col] in the source image
    /** not yet implemented **/
    return newSource;
  }

  // Exercise 3.2
  // checks to see if two images are exactly the same
  public static boolean isSame(Picture image1, Picture image2) {
    // images won't be the same if the width or height is different
    if ((image1.getWidth() != image2.getWidth()) ||
      (image1.getHeight() != image2.getHeight())) {
      return false;
    }
    // get the 2D array of pixels for each image
    Pixel[][] pixels1 = image1.getPixels2D();
    Pixel[][] pixels2 = image2.getPixels2D();
    // TODO (3.2): compare the RGB values of pixel pairs at each
    // position [i][j] using a nested for loop
    /** not yet implemented **/

    //nested for loop that checks to see if every single pixel color is the same
    for (int i = 0; i < pixels1.length; i++) {
      for (int j = 0; j < pixels1[0].length; j++) {
        if (pixels1[i][j].getRed() != pixels2[i][j].getRed()) {
          return false;
        }
        if (pixels1[i][j].getBlue() != pixels2[i][j].getBlue()) {
          return false;
        }
        if (pixels1[i][j].getGreen() != pixels2[i][j].getGreen()) {
          return false;
        }
      }
    }
    return true;
  }

  // Exercise 3.3
  // returns arrayList of Points where pictures differ
  public static ArrayList < Point > findDifferences(Picture image1,
    Picture image2) {
    // create an ArrayList of Point objects
    ArrayList < Point > points = new ArrayList < Point > ();
    // return an empty list if the images are different sizes
    if (image1.getWidth() != image2.getWidth() ||
      image1.getHeight() != image2.getHeight()) {
      return points;
    }
    // get the 2D array of pixels for each image
    Pixel[][] pixels1 = image1.getPixels2D();
    Pixel[][] pixels2 = image2.getPixels2D();
    // TODO (3.3): create an ArrayList of points that contain all
    // of the positions where the RGB values differ between pixels.
    // compare RGB values of pixel pairs using a nested for loop
    /** not yet implemented **/

    //for every single pixel in the source 2d array
    //there is a conditional that checks to see if the pixels in source and secret are the same
    //if yes, then that pixel is added to the arraylist points
    for (int i = 0; i < pixels1.length; i++) {
      for (int j = 0; j < pixels1[0].length; j++) {
        if (pixels1[i][j].getRed() != pixels2[i][j].getRed() || pixels1[i][j].getBlue() != pixels2[i][j].getBlue() || pixels1[i][j].getGreen() != pixels2[i][j].getGreen()) {
          points.add(new Point(pixels1[i][j].getX(), pixels1[i][j].getY()));
        }

      }
    }
    return points;
  }
  ////
  // Exercise 3.4
  // Draw a rectangular outline around the area that bounds the points
  // where the RGB values are different from the original image
  public static Picture showDifferentArea(Picture image, ArrayList < Point > points) {
    // create a new picture as a copy of the original
    Picture copy = new Picture(image);
    // no need to draw a bounding box if the point list is empty
    if (points.size() == 0) {
      return copy;
    }

    // TASK 1
    // calculate the minimum and maximum row values as well as the
    // minimum and maximum column values for the bounding box that
    // contain all the points in the list

    // create four variables for the min and max row and column
    int minRow, maxRow, minCol, maxCol;
    // initialize the min and max values to the first point
    minRow = points.get(0).getRow();
    maxRow = points.get(0).getRow();
    minCol = points.get(0).getCol();
    maxCol = points.get(0).getCol();
    // TODO (3.4 part1): loop over the remaining points in the list
    // and find the minimum and maximum values of the bounding box
    /** not yet implemented **/

    //finding the minimum and maximum values of x and y in the list carrying all the points where source and secret are different
    for (int i = 1; i < points.size(); i++) {
      if (minRow > points.get(i).getRow()) {
        minRow = points.get(i).getRow();
      }
      if (maxRow < points.get(i).getRow()) {
        maxRow = points.get(i).getRow();
      }
      if (minCol > points.get(i).getCol()) {
        minCol = points.get(i).getCol();
      }
      if (maxCol < points.get(i).getCol()) {
        maxCol = points.get(i).getCol();
      }

    }

    //the min and max x and y values are the vertices of the secret image

    // TASK 2
    // draw bounding box outline using a bright red (255, 0, 0)
    // get the 2D array of pixels from the copy image
    Pixel[][] pixels = copy.getPixels2D();
    /** not yet implemented **/

    //drawing a line between the two max x's and two min x's
    for (int i = minCol; i <= maxCol; i++) {
      pixels[i][minRow].setRed(255);
      pixels[i][minRow].setGreen(0);
      pixels[i][minRow].setBlue(0);

      pixels[i][maxRow].setRed(255);
      pixels[i][maxRow].setGreen(0);
      pixels[i][maxRow].setBlue(0);
    }

    // TODO (3.4 part3): using a loop, "draw" the two vertical lines
    // of the bounding box by setting the pixels of the sides of the
    // box to the RGB values of a bright red color
    /** not yet implemented **/

    //drawing a line between the two max y's and two max x's 
    for (int i = minRow; i <= maxRow; i++) {
      pixels[minCol][i].setRed(255);
      pixels[minCol][i].setGreen(0);
      pixels[minCol][i].setBlue(0);

      pixels[maxCol][i].setRed(255);
      pixels[maxCol][i].setGreen(0);
      pixels[maxCol][i].setBlue(0);
    }

    // return the copy
    return copy;
  }

  ////////////////////////////////////////////////////////////////////
  //
  // ACTIVITY 4 Methods: Hiding and Revealing a Text Message
  //


  private static ArrayList < Integer > encodeString(String s) {
    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ";
    ArrayList < Integer > result = new ArrayList < Integer > ();
    for (int i = 0; i < s.length(); i++) {
      result.add(alpha.indexOf(s.substring(i, i + 1)) + 1);
    }
    // terminate the list with a zero
    result.add(0);
    // return the list
    return result;
  }


  private static String decodeString(ArrayList < Integer > codes) {
    String result = "";
    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ";
    for (int i = 0; i < codes.size(); i++) {
      result = result + alpha.substring(codes.get(i) - 1, codes.get(i));
    }
    return result;
  }

 
  private static int[] getBitPairs(int num) {
    int[] bits = new int[3];
    int code = num;
    for (int i = 2; i >= 0; i--) {
      bits[i] = code % 4;
      code = code / 4;
    }
    return bits;
  }

  // Exercise 4.2
  public static Picture hideText(Picture image, String s) {
    // use the method provided by the College Board to create
    // a list of integers that represents the encoded message,
    // which is always terminated by a zero (0)
    ArrayList < Integer > list = encodeString(s);
    // create a new picture as a copy of the original
    Picture copy = new Picture(image);

    /** not yet implemented **/

    //start at -1, since at the start of the loop, the program increments 1 which makes
    //index counter a valid index (0)
    int indexCounter = -1;
    Pixel[][] pixelList = copy.getPixels2D();
    for (int i = 0; i < pixelList.length; i++) {
      for (int j = 0; j < pixelList[0].length; j++) {
        //the index counter is counting the number of indexes in the 
        //encoded string list
        indexCounter++;
        //as soon as index counter is greater than the valid index value for a list
        //size -1
        //then the loop will break
        if (indexCounter > list.size() - 1) {
          break;
        }

        //getting the bit pairs of the encoded string
        int[] bitHolder = getBitPairs(list.get(indexCounter));
        //clearing the color pixels
        int r = pixelList[i][j].getRed();
        int g = pixelList[i][j].getGreen();
        int b = pixelList[i][j].getBlue();
        r = r / 4 * 4;
        g = g / 4 * 4;
        b = b / 4 * 4;

        //this is just setting the values of the colors to the new cleraed bits
        pixelList[i][j].setRed(r + bitHolder[2]);
        pixelList[i][j].setGreen(g + bitHolder[1]);
        pixelList[i][j].setBlue(b + bitHolder[0]);

      }
    }

    // return the copy
    return copy;
  }

  public static String toBinary(int n) {
    if (n == 3) {
      return "11";
    } else if (n == 2) {
      return "10";
    } else if (n == 1) {
      return "01";
    } else {
      return "00";
    }
  }
  
  public static String revealText(Picture source) {
    
    ArrayList < Integer > list = new ArrayList < Integer > ();

    /** not yet implemented **/


    Picture sourceCopy = new Picture(source);

    boolean keepChecking = true;
    Pixel[][] pixelArr = sourceCopy.getPixels2D();

    for (int i = 0; i < pixelArr.length; i++) {
      for (int j = 0; j < pixelArr[0].length; j++) {

        int r = pixelArr[i][j].getRed() % 4;
        int g = pixelArr[i][j].getGreen() % 4;
        int b = pixelArr[i][j].getBlue() % 4;

        
        if (keepChecking && !(r == 0 && g == 0 && b == 0)) {

          String bitPair1 = toBinary(r);
          String bitPair2 = toBinary(g);
          String bitPair3 = toBinary(b);
          String finalBinary = bitPair3 + bitPair2 + bitPair1;
          int finalBinaryToInt = Integer.parseInt(finalBinary, 2);
          list.add(finalBinaryToInt);
        } else {
          keepChecking = false;
        }
     

      }
    }


    return decodeString(list);
  }

};