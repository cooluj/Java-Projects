public class Observation {
  //instance data
  private String id;
  private String description;
  private double temp;
  private int windDir;
  private double windSpeed;
  private double pressure;
  private int humidity;
  private boolean obsType;
  /**
   * Constructs an Observation object with the specified parameters and sets
   * the other instance data to their default values. toString will output a
   * short observation, if this constructor is used.
   * @param the weather station id
   * @param description Short description of the current weather
   * @param temp temperature
   * @param windDir wind direction in degrees
   */
  public Observation(String id, String description, double temp, int windDir) {
    this.id = id;
    this.description = description;
    this.temp = temp;
    this.windDir = windDir;
    obsType = true;
  }
  /**
   * Constructs an Observation object with the specified parameters.
   * toString will output a full observation, if this constructor is used.
   * @param the weather station id
   * @param description Short description of the current weather
   * @param temp temperature
   * @param windDir wind direction in degrees
   * @param windSpeed wind speed in knots
   * @param pressure barometric pressure in mb
   * @param humidity relative humidity
   */
  public Observation(String id, String description, double temp, int windDir, double windSpeed, double pressure, int humidity) {
    this.id = id;
    this.description = description;
    this.temp = temp;
    this.windDir = windDir;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
    this.humidity = humidity;
    obsType = false;
  }
  /**
   * @return a String representing this observation
   */
  public String toString() {
    if (obsType == true) {
      return (id+": "+temp+" degrees; "+description+" (wind: "+windDir+" degrees)");
    } else if (obsType != true) {
      return (id+": "+temp+" degrees; "+description+" (wind: "+windSpeed+" knots @ "+windDir+" degrees); barometric pressure: "+pressure+"; relativity humidity: "+humidity);
    } else {
      return ("");
    }
  }
  /**
   * Determines if the temperature of this observation is colder than other.
   * @param other the other other observation
   * @return true if this observation's temperature is colder than other; otherwise false.
   */
  public boolean colderThan(Observation other) {
    return temp < other.temp;
  }
  /**
   * Returns the Beaufort number on the Beaufort wind force scale.
   * @return the Beaufot number for the current observation
   * For more details, see https://en.wikipedia.org/wiki/Beaufort_scale
   */
  public int getBeaufortNumber() {
    if (windSpeed < 1) {
      return 0;
    } else if (windSpeed >= 1 && windSpeed <= 3) {
      return 1;
    } else if (windSpeed >= 4 && windSpeed <= 6) {
      return 2;
    } else if (windSpeed >= 7 && windSpeed <= 10) {
      return 3;
    } else if (windSpeed >= 11 && windSpeed <= 16) {
      return 4;
    } else if (windSpeed >= 17 && windSpeed <= 21) {
      return 5;
    } else if (windSpeed >= 22 && windSpeed <= 37) {
      return 6;
    } else if (windSpeed >= 28 && windSpeed <= 33) {
      return 7;
    } else if (windSpeed >= 34 && windSpeed <= 40) {
      return 8;
    } else if (windSpeed >= 41 && windSpeed <= 47) {
      return 9;
    } else if (windSpeed >= 48 && windSpeed <= 55) {
      return 10;
    } else if (windSpeed >= 56 && windSpeed <= 63) {
      return 11;
    } else if (windSpeed >= 64) {
      return 12;
    }
    return 0;
  }
  /**
   * Returns a string representation of the wind conditions. Summarize the
   * Beaufort number into 4 categories; calm; breezy; wind flags out; storm 
   * @return a string representation of the wind conditions
   */
  public String getWindConditions() {
    int beau = getBeaufortNumber();
    if (beau <= 2) {
      return "Wind is calm";
    } else if (beau >= 3 && beau <= 5) {
      return "Nice breeze today";
    } else if (beau >= 6 && beau <= 9) {
      return "Wind flags are out";
    } else if (beau >= 10) {
      return "Storm is coming";
    } else {
      return "";
    }
  }
  /**
   * Gets the weather station ID
   * @return the weather station id
   */
  public String getId() {
    return id;
  }

  /**
   * @return the temp
   */
  public double getTemp() {
    return temp;
  }

}