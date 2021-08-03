package zliu.elliot.JointIntelligentDrillServer.dao;

import org.apache.ibatis.annotations.Mapper;
import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryProperty;

import java.util.List;

@Mapper
public interface MilitaryPropertyDao {

     List<MilitaryProperty> getAllProperty();

     int saveProperty(MilitaryProperty militaryProperty);

     int deleteProperty(String uuid);

     int modifyProperty(MilitaryProperty militaryProperty);

}
