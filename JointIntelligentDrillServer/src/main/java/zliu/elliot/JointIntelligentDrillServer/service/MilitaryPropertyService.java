package zliu.elliot.JointIntelligentDrillServer.service;

import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryProperty;

import java.util.List;

public interface MilitaryPropertyService {

    List<MilitaryProperty> getAllProperty();

    int saveProperty(MilitaryProperty militaryProperty);

    int deleteProperty(String uuid);

    int modifyProperty(MilitaryProperty militaryProperty);

}
