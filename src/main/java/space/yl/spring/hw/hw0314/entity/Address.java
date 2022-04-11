package space.yl.spring.hw.hw0314.entity;

/**
 * 地址类
 * @author yaojianfeng
 */
public class Address {
   private String country;
   private String province;
   private String cityName;
   private String streetName;
   private String communityName;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Address() {
    }

    public Address(String country, String province) {
        this.country = country;
        this.province = province;
    }

    public Address(String country, String province, String cityName, String streetName, String communityName) {
        this.country = country;
        this.province = province;
        this.cityName = cityName;
        this.streetName = streetName;
        this.communityName = communityName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Address{");
        sb.append("country='").append(country).append('\'');
        sb.append(", province='").append(province).append('\'');
        sb.append(", cityName='").append(cityName).append('\'');
        sb.append(", streetName='").append(streetName).append('\'');
        sb.append(", communityName='").append(communityName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
