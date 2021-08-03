package zliu.elliot.JointIntelligentDrillServer.entity;

public class MilitaryProperty {

    private String uuid;

    private String typeZh;

    private String typeEn;

    private Integer category;

    private Float maxSpeed;

    private Float attackRadius;

    private Float detectionRadius;

    public MilitaryProperty() {
    }

    public MilitaryProperty(String uuid, String typeZh, String typeEn, Integer category, Float maxSpeed, Float attackRadius, Float detectionRadius) {
        this.uuid = uuid;
        this.typeZh = typeZh;
        this.typeEn = typeEn;
        this.category = category;
        this.maxSpeed = maxSpeed;
        this.attackRadius = attackRadius;
        this.detectionRadius = detectionRadius;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTypeZh() {
        return typeZh;
    }

    public void setTypeZh(String typeZh) {
        this.typeZh = typeZh;
    }

    public String getTypeEn() {
        return typeEn;
    }

    public void setTypeEn(String typeEn) {
        this.typeEn = typeEn;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Float getAttackRadius() {
        return attackRadius;
    }

    public void setAttackRadius(Float attackRadius) {
        this.attackRadius = attackRadius;
    }

    public Float getDetectionRadius() {
        return detectionRadius;
    }

    public void setDetectionRadius(Float detectionRadius) {
        this.detectionRadius = detectionRadius;
    }

    @Override
    public String toString() {
        return "MilitaryProperty{" +
                "uuid='" + uuid + '\'' +
                ", typeZh='" + typeZh + '\'' +
                ", typeEn='" + typeEn + '\'' +
                ", category=" + category +
                ", maxSpeed=" + maxSpeed +
                ", attackRadius=" + attackRadius +
                ", detectionRadius=" + detectionRadius +
                '}';
    }
}
