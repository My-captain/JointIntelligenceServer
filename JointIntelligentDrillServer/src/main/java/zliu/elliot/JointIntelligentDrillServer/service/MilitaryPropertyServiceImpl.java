package zliu.elliot.JointIntelligentDrillServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zliu.elliot.JointIntelligentDrillServer.dao.MilitaryPropertyDao;
import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryProperty;

import java.util.List;

@Service
public class MilitaryPropertyServiceImpl implements MilitaryPropertyService {

    @Autowired
    private MilitaryPropertyDao militaryPropertyDao;

    @Override
    public List<MilitaryProperty> getAllProperty() {
        return militaryPropertyDao.getAllProperty();
    }

    @Override
    public int saveProperty(MilitaryProperty militaryProperty) {
        return militaryPropertyDao.saveProperty(militaryProperty);
    }

    @Override
    public int deleteProperty(String uuid) {
        return militaryPropertyDao.deleteProperty(uuid);
    }

    @Override
    public int modifyProperty(MilitaryProperty militaryProperty) {
        return militaryPropertyDao.modifyProperty(militaryProperty);
    }
}
