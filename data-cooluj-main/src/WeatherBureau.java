/*
 * Arrays and ArrayLists of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WeatherBureau {
  WeatherStation[] stations;
  ArrayList < WeatherStation > stations1 = new ArrayList < > ();

  /**
   * Constructor that initializes stations by connecting, loading
   * and fetching the weather stations serviced by the National
   * Weather Service
   */
  public WeatherBureau() {
	Activity1.avoidSSLError();
    DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
    stations = ds.fetchArray("WeatherStation", "station/station_name", "station/station_id", "station/state", "station/latitude", "station/longitude");
    stations1 = ds.fetchList("WeatherStation", "station/station_name", "station/station_id", "station/state", "station/latitude", "station/longitude");
  }

  /**
   * Gets all the weather stations as an array
   * @return he weather stations as an array
   */

  public WeatherStation[] getAllStationsArray() {
    return stations;
  }

  /**
   * Gets all the weather stations as an ArrayList
   * @return he weather stations as an ArrayList
   */
  public ArrayList < WeatherStation > getAllStationsList() {
    return stations1;
  }

  /**
   * Ges the list of weather stations in the specified state
   * @param state the state to filter with
   * @return the list of weather stations in the specified state
   */

  public ArrayList < WeatherStation > getStationsInState(String state) {
    ArrayList < WeatherStation > stnInState = new ArrayList < > ();
    for (int i = 0; i < stations1.size(); i++) {
      if (stations1.get(i).getState().equals(state)) {
        stnInState.add(stations1.get(i));
      }
    }
    return stnInState;
  }

  /**
   * Finds the Weather Station in the specified state with the coldest temperature.
   * @param state the state
   * @return An Observation for the weather station with the coldest temperature
   */
  public Observation getColdestInState(String state) {
    ArrayList < WeatherStation > stnInState = getStationsInState(state);
    WeatherBot wb = new WeatherBot(stnInState.get(0).getId());
    double lowestTemp = wb.getShortObservation().getTemp();
    String id = stnInState.get(0).getId();
    for (int i = 0; i < stnInState.size(); i++) {
      WeatherBot wb1 = new WeatherBot(stnInState.get(i).getId());
      if (wb1.getShortObservation().getTemp() < lowestTemp) {
        id = stnInState.get(i).getId();
      }
    }
    WeatherBot wb2 = new WeatherBot(id);
    return wb2.getShortObservation();
  }

  /**
   * Gets a list of all weather stations in a state sorted by their name.
   * @param state the state
   * @return list of all weather stations in a state sorted by their name
   */

  public WeatherStation[] getStationsInStateSortedByName(String state) {
    ArrayList < WeatherStation > sorted = getStationsInState(state);
    WeatherStation[] sortedArr = new WeatherStation[sorted.size()];
    for (int k = 0; k < sorted.size(); k++) {
      sortedArr[k] = sorted.get(k);
    }
    Arrays.sort(sortedArr, WeatherStation.WeatherStationCompare);
    return sortedArr;
  }
  /**
   * Sorts the array of WeatherStation using the Insertion Sort algorithm
   * @param arr the array of WeatherStation
   */
  public void insertionSort(WeatherStation[] arr) {
    for (int i = 1; i < arr.length; i++) {
      WeatherStation base = arr[i];
      String anchor = arr[i].getName();
      int j = i - 1;
      while (j >= 0 && arr[j].getName().compareTo(anchor) > 0) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = base;
    }
  }
  public static void main(String[] args) {
    WeatherBureau bureau = new WeatherBureau();
    WeatherStation[] stations = bureau.getAllStationsArray();
    for (WeatherStation ws: stations) {
      System.out.println(" " + ws.getId() + ": " + ws.getName());
    }
    System.out.println("Total number of stations: " + stations.length);

    System.out.println();

    System.out.println("Getting weather stations in Washington");
    ArrayList < WeatherStation > waStations = bureau.getStationsInState("NY");
    for (WeatherStation ws: waStations) {
      System.out.println(" " + ws.getId() + ": " + ws.getName());
    }
    System.out.println("Total number of stations: " + waStations.size());

    // System.out.println();
    // System.out.println("Getting coldest station in Washington");
    // Observation ob = bureau.getColdestInState("NY");
    // System.out.println("Coldest station is - " + ob);
    // System.out.println(ob);

    System.out.println();
    System.out.println("Sorting stations in Washington");
    WeatherStation[] filteredStations = bureau.getStationsInStateSortedByName("NY");
    for (WeatherStation ws: filteredStations) {
      System.out.println(" " + ws.getId() + ": " + ws.getName());
    }

  }
}