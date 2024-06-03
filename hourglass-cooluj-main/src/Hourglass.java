//////////////////////////////////////////////////////////////////////////////
//
// AP CS A
// Unit 4 - Iteration
// Hourglass Programming Project
//
// HourGlass
//
// written by <Ujjawal>
//

public class Hourglass {
	public static final int constant = 1;
	
	public static void main(String[] args) {
              
       }
	public static void topHalf(int size) {
		edge(size);
        int factor = size + 2;
        int spaces;
        for(int i = 1; i <= size; i ++) {
        	spaces = 2*factor - (2*i) - 2;
        	for(int j = 1; j <= i; j ++) {
                           System.out.print(" ");
                     }
        	System.out.print("\\");
        	for(int h = 1; h <= spaces; h ++) {
        		System.out.print(" ");
                     }
        	System.out.println("/");
              }
       }
	public static void bottomHalf(int size) {
              int spaces;
              int factor = size + 2;
              for(int i = size; i >= 1; i --) {
                     //System.out.println("In loop");
                     spaces = 2*factor - (2*i)-2;
                     for(int j = 1; j <= i; j ++) {
                           System.out.print(" ");
                     }
                     System.out.print("/");
                     for(int h = 1; h <= spaces; h ++) {
                           System.out.print(":");
                     }
                     System.out.println("\\");

              }
              edge(size);
       }
	public static void edge(int size) {
              System.out.print("|");
              int factor = size + 1;
              for(int i = 1; i <= factor* 2; i ++) {
                     System.out.print("=");
              }
              System.out.println("|");
       }
	public static void middle(int size) {
              int factor = size + 1;
              for(int i = 1; i <= factor; i ++) {
                     System.out.print(" ");
              }
              System.out.println("||");
       }
	public static void hourglass(int size) {

              topHalf(size);
              middle(size);
              bottomHalf(size);

       }
	public static void hourglass() {
              hourglass(constant);
       }
}

