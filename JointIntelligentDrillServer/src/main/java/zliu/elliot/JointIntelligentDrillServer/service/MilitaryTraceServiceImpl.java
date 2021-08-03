package zliu.elliot.JointIntelligentDrillServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zliu.elliot.JointIntelligentDrillServer.dao.MilitaryTraceDao;
import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryTrace;

@Service
public class MilitaryTraceServiceImpl implements MilitaryTraceService{

    @Autowired
    private MilitaryTraceDao militaryTraceDao;

    @Override
    public int saveTrace(MilitaryTrace militaryTrace) {
        return militaryTraceDao.saveTrace(militaryTrace);
    }

    @Override
    public int deleteTrace(String uuid) {
        return militaryTraceDao.deleteTrace(uuid);
    }

    @Override
    public int modifyTrace(MilitaryTrace militaryTrace) {
        return militaryTraceDao.modifyTrace(militaryTrace);
    }

    @Override
    public int deleteTraceByTarget(String targetId) {
        return militaryTraceDao.deleteTraceByTarget(targetId);
    }
}
