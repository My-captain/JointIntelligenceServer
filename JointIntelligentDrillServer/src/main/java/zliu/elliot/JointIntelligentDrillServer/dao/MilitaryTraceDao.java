package zliu.elliot.JointIntelligentDrillServer.dao;

import org.apache.ibatis.annotations.Mapper;
import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryTrace;

@Mapper
public interface MilitaryTraceDao {

    int saveTrace(MilitaryTrace militaryTrace);

    int deleteTrace(String uuid);

    int modifyTrace(MilitaryTrace militaryTrace);

    int deleteTraceByTarget(String targetId);
}
