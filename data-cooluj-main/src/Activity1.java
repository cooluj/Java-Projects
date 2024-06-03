import core.data.*;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.OutputStream;

public class Activity1 {
  public static void main(String[] args) {
    String stationID = "KSEA"; // Sea-Tac Airport
    avoidSSLError();
    System.out.println("The temperature at KSEA is " + getTempF(stationID) + "F");
    System.out.println(getConciseForecast(stationID));
    DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/KSEA.xml");
    ds.load();
    double temp = ds.fetchFloat("temp_f");
    System.out.println("Temperature: " + temp);
  }

  /**
   * Returns the current temperature in fahrenheit at the specified weather station
   * 
   * @param id the weather station id
   * @return the temperature
   */
  public static String getConciseForecast(String id) {
    avoidSSLError();
    String link = "http://weather.gov/xml/current_obs/" + id + ".xml";
    DataSource ds = DataSource.connect(link);
    ds.setCacheTimeout(15*60);
    ds.load();
    ds.printUsageString();
    double temp = ds.fetchFloat("temp_f");
    String loc = ds.fetchString("location");
    String find = "The temperature at " + loc + " is " + temp + "F";
    return find;
  }
  public static double getTempF(String id) {
    avoidSSLError();
    String link = "http://weather.gov/xml/current_obs/" + id + ".xml";
    DataSource ds = DataSource.connect(link);
    ds.load();
    double temp = ds.fetchFloat("temp_f");
    return temp;
  }
  /**
   * Returns a concise forecast for the specified weather station id
   * @param id the weather station id
   * @return a concise forecast 
   */

  public static void avoidSSLError() {

    TrustManager[] trustAllCerts = new TrustManager[] {
      new X509TrustManager() {
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
          return null;
        }
        public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
          //No need to implement.
        }
        public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
          //No need to implement.
        }
      }
    };
    // Install the all-trusting trust manager
    try {
      SSLContext sc = SSLContext.getInstance("SSL");
      sc.init(null, trustAllCerts, new java.security.SecureRandom());
      HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}