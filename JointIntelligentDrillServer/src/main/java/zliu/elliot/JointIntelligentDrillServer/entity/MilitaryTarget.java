package zliu.elliot.JointIntelligentDrillServer.entity;

import java.util.List;

public class MilitaryTarget {

    private String uuid;

    private String targetName;

    private String properties;

    private MilitaryProperty militaryProperty;

    private String batch;

    private List<MilitaryTrace> targetTraces;

    public MilitaryTarget() {
    }

    public MilitaryTarget(String uuid, String targetName, String properties, MilitaryProperty militaryProperty, String batch) {
        this.uuid = uuid;
        this.targetName = targetName;
        this.properties = properties;
        this.militaryProperty = militaryProperty;
        this.batch = batch;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public MilitaryProperty getMilitaryProperty() {
        return militaryProperty;
    }

    public void setMilitaryProperty(MilitaryProperty militaryProperty) {
        this.militaryProperty = militaryProperty;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public List<MilitaryTrace> getTargetTraces() {
        return targetTraces;
    }

    public void setTargetTraces(List<MilitaryTrace> targetTraces) {
        this.targetTraces = targetTraces;
    }

    @Override
    public String toString() {
        return "MilitaryTarget{" +
                "uuid='" + uuid + '\'' +
                ", targetName='" + targetName + '\'' +
                ", properties='" + properties + '\'' +
                ", militaryProperty=" + militaryProperty +
                ", batch='" + batch + '\'' +
                '}';
    }
}
