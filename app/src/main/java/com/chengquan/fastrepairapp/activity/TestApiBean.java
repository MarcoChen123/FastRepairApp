package com.chengquan.fastrepairapp.activity;

public class TestApiBean {

    private WeatherinfoBean weatherinfo;

    public WeatherinfoBean getWeatherinfo() {
        return weatherinfo;
    }

    public void setWeatherinfo(WeatherinfoBean weatherinfo) {
        this.weatherinfo = weatherinfo;
    }

    public static class WeatherinfoBean {
        private String city;
        private String cityid;
        private String temp;
        @com.google.gson.annotations.SerializedName("WD")
        private String wD;
        @com.google.gson.annotations.SerializedName("WS")
        private String wS;
        @com.google.gson.annotations.SerializedName("SD")
        private String sD;
        @com.google.gson.annotations.SerializedName("AP")
        private String aP;
        private String njd;
        @com.google.gson.annotations.SerializedName("WSE")
        private String wSE;
        private String time;
        private String sm;
        private String isRadar;
        @com.google.gson.annotations.SerializedName("Radar")
        private String radar;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityid() {
            return cityid;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getWD() {
            return wD;
        }

        public void setWD(String wD) {
            this.wD = wD;
        }

        public String getWS() {
            return wS;
        }

        public void setWS(String wS) {
            this.wS = wS;
        }

        public String getSD() {
            return sD;
        }

        public void setSD(String sD) {
            this.sD = sD;
        }

        public String getAP() {
            return aP;
        }

        public void setAP(String aP) {
            this.aP = aP;
        }

        public String getNjd() {
            return njd;
        }

        public void setNjd(String njd) {
            this.njd = njd;
        }

        public String getWSE() {
            return wSE;
        }

        public void setWSE(String wSE) {
            this.wSE = wSE;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getSm() {
            return sm;
        }

        public void setSm(String sm) {
            this.sm = sm;
        }

        public String getIsRadar() {
            return isRadar;
        }

        public void setIsRadar(String isRadar) {
            this.isRadar = isRadar;
        }

        public String getRadar() {
            return radar;
        }

        public void setRadar(String radar) {
            this.radar = radar;
        }
    }
}
