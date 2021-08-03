package zliu.elliot.JointIntelligentDrillServer.service;

import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryTrace;

public interface MilitaryTraceService {

    int saveTrace(MilitaryTrace militaryTrace);

    int deleteTrace(String uuid);

    int modifyTrace(MilitaryTrace militaryTrace);

    int deleteTraceByTarget(String targetId);
}
