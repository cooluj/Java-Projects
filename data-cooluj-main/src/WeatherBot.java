import core.data.*;

public class WeatherBot {
  private String id;
  /**
   * Constructs a WeatherBot object with the specified weather station id
   * @param stationID the weather station id
   */
  public WeatherBot(String id) {
    this.id = id;
  }

  /**
   * Gets an Observation object with the station id, short weather description, temperature
   * and wind direction.
   * @return an Observation object
   */
  public Observation getShortObservation() {
    Activity1.avoidSSLError();
    DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + this.id + ".xml");
    ds1.setCacheTimeout(15 * 60);
    ds1.load();
    Observation ob1 = ds1.fetch("Observation", "station_id", "weather", "temp_f", "wind_degrees");
    return ob1;
  }
  /**
   * Gets an Observation object with the station id, short weather description, temperature,
   * wind direction, wind speed in knots, barometric pressure in mb, and the relative humidity.
   * @return an Observation object
   */
  public Observation getLongObservation() {
    Activity1.avoidSSLError();
    DataSource ds2 = DataSource.connect("http://weather.gov/xml/current_obs/" + this.id + ".xml");
    ds2.setCacheTimeout(15 * 60);
    ds2.load();
    Observation ob2 = ds2.fetch("Observation", "station_id", "weather", "temp_f", "wind_degrees", "wind_kt", "pressure_mb", "relative_humidity");
    return ob2;
  }

  public static void main(String[] args) {

    WeatherBot bot = new WeatherBot("KSEA");
    Observation ob1 = bot.getShortObservation();
    Observation ob2 = bot.getLongObservation();
    System.out.println(ob1.toString());
    System.out.println(ob2.toString());

    WeatherBot bot2 = new WeatherBot("KRNT");
    Observation ob3 = bot2.getLongObservation();
    System.out.println(ob3.toString());

    if (ob2.colderThan(ob3)) {
      System.out.println("It is colder at " + ob2.getId() + " than " + ob3.getId());
    } else {
      System.out.println("It is warmer at " + ob2.getId() + " than " + ob3.getId());
    }

    System.out.println(ob2.getId() + ": " + ob2.getWindConditions());
    System.out.println(ob3.getId() + ": " + ob3.getWindConditions());
  }

}