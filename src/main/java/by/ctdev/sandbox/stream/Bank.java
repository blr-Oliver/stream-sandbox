package by.ctdev.sandbox.stream;

public class Bank {
  private long id;
  private String name;
  private String description;
  private String phone;
  private String city;
  private String address;
  private double lat;
  private double lon;

  public long getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public String getPhone() {
    return phone;
  }
  public String getCity() {
    return city;
  }
  public String getAddress() {
    return address;
  }
  public double getLat() {
    return lat;
  }
  public double getLon() {
    return lon;
  }
  public void setId(long id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public void setLat(double lat) {
    this.lat = lat;
  }
  public void setLon(double lon) {
    this.lon = lon;
  }

}
