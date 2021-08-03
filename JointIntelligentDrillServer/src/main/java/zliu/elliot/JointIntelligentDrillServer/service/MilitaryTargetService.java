package zliu.elliot.JointIntelligentDrillServer.service;

import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryTarget;

import java.util.List;

public interface MilitaryTargetService {

    int saveTarget(MilitaryTarget militaryTarget);

    int deleteTarget(String uuid);

    int modifyTarget(MilitaryTarget militaryTarget);

    List<MilitaryTarget> getAllTargets();

}
