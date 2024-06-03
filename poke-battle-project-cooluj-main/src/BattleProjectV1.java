import java.util.Scanner;

public class BattleProjectV1 {

                public static void main(String[] args) {
                                // Pokemon 1's stats
                                String pokemon2 = "";
                                String pokemon1Name = "Pikachu";
                                int pokemon1Level = 25;
                                int pokemon1Attack = 112;
                                int pokemon2Defense = 96;
                                // Use the Pokemon's Stamina value as it's initial HP.
                                int pokemon1HP = 111;
                                String pokemon1AttackName = "Thunderbolt";
                                int pokemon1AttackPower = 80; 
                                double pokemon1STAB = 1.2;
                                pokemon2 = battleStart(pokemon1Name);
                                
                                
                }
                


                public static String battleStart(String pokemon1Name) {
                                Scanner console = new Scanner(System.in);
                                System.out.println("Another trainer is issuing a challenge!");
                                System.out.println();
                                System.out.println(pokemon1Name + " appeared.");
                                System.out.println();


                                System.out.print("Which Pokemon do you choose?");
                
                                String pokemon2Name = console.nextLine();
                                System.out.println();

                                System.out.println("You chose " + pokemon2Name + "!");
                                System.out.println();
                                System.out.println("It's a Pokemon battle between " + pokemon1Name + " and " + pokemon2Name + "!  Go!");
                                return pokemon2Name;
                
                }

                public static int damage(int level, int attack, int defense, int power, double stab) {
                                double TRA = stab * (Math.random() * 0.15 + 0.85);
                                int retur = (int) (power * ( (double) attack/defense) * TRA / 2) + 1;
                                return retur;
                }
                
                
}
