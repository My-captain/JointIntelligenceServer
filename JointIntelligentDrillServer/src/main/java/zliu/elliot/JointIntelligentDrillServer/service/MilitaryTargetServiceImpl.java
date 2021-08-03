package zliu.elliot.JointIntelligentDrillServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zliu.elliot.JointIntelligentDrillServer.dao.MilitaryTargetDao;
import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryTarget;

import java.util.List;

@Service
public class MilitaryTargetServiceImpl implements MilitaryTargetService {

    @Autowired
    private MilitaryTargetDao militaryTargetDao;

    @Override
    public int saveTarget(MilitaryTarget militaryTarget) {
        return militaryTargetDao.saveTarget(militaryTarget);
    }

    @Override
    public int deleteTarget(String uuid) {
        return militaryTargetDao.deleteTarget(uuid);
    }

    @Override
    public int modifyTarget(MilitaryTarget militaryTarget) {
        return militaryTargetDao.modifyTarget(militaryTarget);
    }

    @Override
    public List<MilitaryTarget> getAllTargets() {
        return militaryTargetDao.getAllTargets();
    }
}
