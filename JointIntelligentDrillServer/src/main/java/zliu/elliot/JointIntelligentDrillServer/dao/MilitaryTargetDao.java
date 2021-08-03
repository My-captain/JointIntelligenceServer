package zliu.elliot.JointIntelligentDrillServer.dao;

import org.apache.ibatis.annotations.Mapper;
import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryTarget;

import java.util.List;

@Mapper
public interface MilitaryTargetDao {

    int saveTarget(MilitaryTarget militaryTarget);

    int deleteTarget(String uuid);

    int modifyTarget(MilitaryTarget militaryTarget);

    List<MilitaryTarget> getAllTargets();

}
