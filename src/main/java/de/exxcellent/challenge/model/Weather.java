package de.exxcellent.challenge.model;

/**
 * class Weather
 *
 * @author Florian Wörle
 */
public class Weather {

    int day;
    int mxT;
    int mnT;
    float avT;
    float avDP;
    int hrPTPcpn;
    int pDir;
    float avSp;
    int dir;
    int mxS;
    float skyC;
    int mxR;
    int mn;
    float rAvSLP;

    public Weather(String content) {
        String[] weatherData = content.split(",");
        this.day = Integer.parseInt(weatherData[0]);
        this.mxT = Integer.parseInt(weatherData[1]);
        this.mnT = Integer.parseInt(weatherData[2]);
        this.avT = Float.parseFloat(weatherData[3]);
        this.avDP = Float.parseFloat(weatherData[4]);
        this.hrPTPcpn = Integer.parseInt(weatherData[5]);
        this.pDir = Integer.parseInt(weatherData[6]);
        this.avSp = Float.parseFloat(weatherData[7]);
        this.dir = Integer.parseInt(weatherData[8]);
        this.mxS = Integer.parseInt(weatherData[9]);
        this.skyC = Float.parseFloat(weatherData[10]);
        this.mxR = Integer.parseInt(weatherData[11]);
        this.mn = Integer.parseInt(weatherData[12]);
        this.rAvSLP = Float.parseFloat(weatherData[13]);
    }

    public int getDay() {
        return day;
    }

    public float getrAvSLP() {
        return rAvSLP;
    }

    public int getMxT() {
        return mxT;
    }

    public int getMnT() {
        return mnT;
    }
}
