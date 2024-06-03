import java.util.Comparator;

import core.data.DataSource;

/*
Represents information about a NWS weather station
*/

public class WeatherStation {
  private String name;
  private String id;
  private String state;
  private double lat;
  private double lng;

  /**
   * Constructor
   * @param name The name of the station
   * @param id the id for the station
   * @param state the state in which this station is located
   * @param lat latitude of this station
   * @param lng longitude of this station
   */
  public WeatherStation(String name, String id, String state, double lat, double lng) {
    this.name = name;
    this.id = id;
    this.state = state;
    this.lat = lat;
    this.lng = lng;
  }

  /**
   * Gets the ID of the weather station
   * @return the ID of the weather station
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name of this station
   * @return the name of this station
   */
  public String getName() {
    return name;
  }
  
  public String getState() {
	  return state;
	  
  }

  /**
   * Determines if this weather station is located in the specified state
   * @param state the state
   * @return true if this weather station is in state; otherwise false
   */
  public static Comparator<WeatherStation> WeatherStationCompare = new Comparator <WeatherStation>(){
	  public int compare(WeatherStation ws1, WeatherStation ws2) {
		  Activity1.avoidSSLError();
		  String ws = ws1.getName().toUpperCase();
		  String ws3 = ws2.getName().toUpperCase();
		  
		  return ws.compareTo(ws3);
	  }
  };
  public boolean isLocatedInState(String state) {
    if (this.state.equals(state)) return true;
    return false;
  }

}