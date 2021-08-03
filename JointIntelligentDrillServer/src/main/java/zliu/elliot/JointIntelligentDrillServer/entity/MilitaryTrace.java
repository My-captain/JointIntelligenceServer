package zliu.elliot.JointIntelligentDrillServer.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class MilitaryTrace {

    private String uuid;

    private String target;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Float altitude;

    private Timestamp appearanceTime;

    public MilitaryTrace() {
    }

    public MilitaryTrace(String uuid, String target, BigDecimal longitude, BigDecimal latitude, Float altitude, Timestamp time) {
        this.uuid = uuid;
        this.target = target;
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
        this.appearanceTime = time;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Float getAltitude() {
        return altitude;
    }

    public void setAltitude(Float altitude) {
        this.altitude = altitude;
    }

    public Timestamp getAppearanceTime() {
        return appearanceTime;
    }

    public void setAppearanceTime(Timestamp appearanceTime) {
        this.appearanceTime = appearanceTime;
    }

    @Override
    public String toString() {
        return "MilitaryTrace{" +
                "uuid='" + uuid + '\'' +
                ", target='" + target + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", altitude=" + altitude +
                ", time=" + appearanceTime +
                '}';
    }
}
