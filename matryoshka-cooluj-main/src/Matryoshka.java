public class Matryoshka {
  private Matryoshka innerDoll;
  private String name;
  private java.awt.Color hair;
  private boolean babushka;
  /**
   * Initializes the innerDoll to null.
   */
  public Matryoshka() {
    innerDoll = null;
  }
  /**
   * Initializes the name, hair color and whether this doll is wearing a babushka, which is a headscarf tied below the chin.
   * This is an innermost doll. Initialize the babushka, hairColor and name fields. A babushka is a headscarf tied below the chin.
   * @param name name of this doll
   * @param hair hair color
   * @param babushka true if the doll is wearing a babu
   */
  public Matryoshka(String name, java.awt.Color hair, boolean babushka) {
    //*** TO DO ***
    this.name = name;
    this.hair = hair;
    this.babushka = babushka;
  }
  /**
   * initializes the innerDoll to the specified doll
   * @param innerDoll the inner doll, which might contain other dolls.
   */
  public Matryoshka(Matryoshka innerDoll) {
    this.innerDoll = innerDoll;
  }
  /**
   * Initializes the name, hair color and whether this doll is wearing a babushka, which is a headscarf tied below the chin.
   * This is an innermost doll. Initialize the innerDoll, babushka, hairColor and name fields. A babushka is a headscarf
   * tied below the chin.
   * @param innerDoll the inner doll, which might contain other dolls.
   * @param name name of this doll
   * @param hair hair color
   * @param babushka true if the doll is wearing a babu
   */
  public Matryoshka(Matryoshka innerDoll, String name, java.awt.Color hair, boolean babushka) {
    // ** TO DO **
    this.hair = hair;
    this.name = name;
    this.innerDoll = innerDoll;
    this.babushka = babushka;
  
  }
  /**
   * Determines whether this doll has an inner doll.
   * @return true if this doll has an inner doll; false otherwise
   */
  public boolean hasInnerDoll() {
    return innerDoll != null;
  }
  /**
   * Returns the inner doll;
   * @return If this doll has an inner doll, a reference to that doll is returned; otherwise null.
   */
  public Matryoshka getInnerDoll() {
    return innerDoll;
  }
  /**
   * Recursive method that returns how many dolls.
   * @return how many dolls are contained within this doll, including this one.
   */
  public int howManyDolls() {
    // base case
    if (innerDoll == null)
      return 1;
    // recursive case
    int c = 1 + this.innerDoll.howManyDolls();
    return c;
  }
  /**
   * A recursive method that returns the number of dolls that are wearing babushkas, including the current one.
   * @return the number of dolls that are wearing babushkas, including the current one.
   */
  public int howManyWearingBabushkas() {
    //** TO DO **
    if (!hasInnerDoll()) {
      if (this.babushka) {
        return 1;
      }
      return 0;
    } else {
      if (this.babushka) {
        int c = 1 + this.innerDoll.howManyWearingBabushkas();
        return c;
      }
      return this.innerDoll.howManyWearingBabushkas();
    }
  }
  /**
   * A recursive method that returns the number of dolls, whose hair color is java.awt.Color.RED.
   * @return the number of dolls, whose hair color is java.awt.Color.RED.
   */
  public int redHeadCount() {
    //** TO DO **
    if (!hasInnerDoll()) {
      if (this.hair == java.awt.Color.RED) {
        return 1;
      }
      return 0;
    } else {
      if (this.hair == java.awt.Color.RED) {
        int c = 1 + this.innerDoll.redHeadCount();
        return c;
      }
      return this.innerDoll.redHeadCount();
    }
  }
  /**
   * A recursive method that returns the name of the doll that is alphabetically last among the current and inner dolls.
   * • If a Matryoshka has no inner doll, then its name is alphabetically last of the collection.
   * • If a Matryoshka has an inner doll, then return the name of the alphabetically last name
   * • of all the remaining dolls, including the current.
   * • Use the compareTo method in the String class to determine which name is later in the alphabet.
   * @return the name of the doll that is alphabetically last among the current and inner dolls.
   */
  public String lastName() {
    if (!hasInnerDoll()) {
      return name;
    } else 
    {
      if (this.name.compareTo(innerDoll.lastName()) > 0) {
        return this.name;
      }
    }
    return this.innerDoll.lastName();
  }
}