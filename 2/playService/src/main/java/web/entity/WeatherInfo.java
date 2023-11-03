package web.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "WeatherInfo")
public class WeatherInfo {

    private String cityName;
    private String provinceName;
    private String cityCode;
    private String updateTime;
    private String temperature;
    private String weather;
    private String windDirection;
    private String windPower;
    private String futureDay1;
    private String futureTemperature1;
    private String futureWeather1;
    private String futureWindDirection1;
    private String futureWindPower1;
    private String futureDay2;
    private String futureTemperature2;
    private String futureWeather2;
    private String futureWindDirection2;
    private String futureWindPower2;

    public String getCityName() {
        return cityName;
    }

    @XmlElement(name = "city")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    @XmlElement(name = "province")
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityCode() {
        return cityCode;
    }

    @XmlElement(name = "citycode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    @XmlElement(name = "updatetime")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getTemperature() {
        return temperature;
    }

    @XmlElement(name = "temperature")
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeather() {
        return weather;
    }

    @XmlElement(name = "weather")
    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWindDirection() {
        return windDirection;
    }

    @XmlElement(name = "winddirection")
    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindPower() {
        return windPower;
    }

    @XmlElement(name = "windpower")
    public void setWindPower(String windPower) {
        this.windPower = windPower;
    }

    public String getFutureDay1() {
        return futureDay1;
    }

    @XmlElement(name = "futuraweather", required = true)
    public void setFutureDay1(String futureDay1) {
        this.futureDay1 = futureDay1;
    }

    public String getFutureTemperature1() {
        return futureTemperature1;
    }

    @XmlElement(name = "futuretemp", required = true)
    public void setFutureTemperature1(String futureTemperature1) {
        this.futureTemperature1 = futureTemperature1;
    }

    public String getFutureWeather1() {
        return futureWeather1;
    }

    @XmlElement(name = "futureweather", required = true)
    public void setFutureWeather1(String futureWeather1) {
        this.futureWeather1 = futureWeather1;
    }

    public String getFutureWindDirection1() {
        return futureWindDirection1;
    }

    @XmlElement(name = "futuredirection", required = true)
    public void setFutureWindDirection1(String futureWindDirection1) {
        this.futureWindDirection1 = futureWindDirection1;
    }

    public String getFutureWindPower1() {
        return futureWindPower1;
    }

    @XmlElement(name = "futurepower", required = true)
    public void setFutureWindPower1(String futureWindPower1) {
        this.futureWindPower1 = futureWindPower1;
    }

    public String getFutureDay2() {
        return futureDay2;
    }

    @XmlElement(name = "futuraweather1", required = true)
    public void setFutureDay2(String futureDay2) {
        this.futureDay2 = futureDay2;
    }

    public String getFutureTemperature2() {
        return futureTemperature2;
    }

    @XmlElement(name = "futuretemp1", required = true)
    public void setFutureTemperature2(String futureTemperature2) {
        this.futureTemperature2 = futureTemperature2;
    }

    public String getFutureWeather2() {
        return futureWeather2;
    }

    @XmlElement(name = "futureweather1", required = true)
    public void setFutureWeather2(String futureWeather2) {
        this.futureWeather2 = futureWeather2;
    }

    public String getFutureWindDirection2() {
        return futureWindDirection2;
    }

    @XmlElement(name = "futuredirection1", required = true)
    public void setFutureWindDirection2(String futureWindDirection2) {
        this.futureWindDirection2 = futureWindDirection2;
    }

    public String getFutureWindPower2() {
        return futureWindPower2;
    }

    @XmlElement(name = "futurepower1", required = true)
    public void setFutureWindPower2(String futureWindPower2) {
        this.futureWindPower2 = futureWindPower2;
    }

}

