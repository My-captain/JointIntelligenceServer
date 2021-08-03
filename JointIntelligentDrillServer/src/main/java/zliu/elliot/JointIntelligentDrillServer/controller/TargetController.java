package zliu.elliot.JointIntelligentDrillServer.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryTarget;
import zliu.elliot.JointIntelligentDrillServer.entity.MilitaryTrace;
import zliu.elliot.JointIntelligentDrillServer.service.MilitaryPropertyService;
import zliu.elliot.JointIntelligentDrillServer.service.MilitaryTargetService;
import zliu.elliot.JointIntelligentDrillServer.service.MilitaryTraceService;
import zliu.elliot.JointIntelligentDrillServer.utils.ResponseBase;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("client")
public class TargetController {

    @Autowired
    private MilitaryTargetService militaryTargetService;

    @Autowired
    private MilitaryPropertyService militaryPropertyService;

    @Autowired
    private MilitaryTraceService militaryTraceService;

    @RequestMapping("getAllTarget")
    public String getAllTarget() {
        ResponseBase response = new ResponseBase();
        try {
            response.setData(militaryTargetService.getAllTargets());
        } catch (Exception e) {
            response.setCode(ResponseBase.FAILURE);
            response.setMsg(e.getMessage());
        }
        return JSON.toJSONString(response);
    }

    @RequestMapping("updateMilitaryTarget")
    public String updateMilitaryTarget(@RequestBody MilitaryTarget militaryTarget) {
        ResponseBase response = new ResponseBase();
        try {
            if (!StringUtils.hasLength(militaryTarget.getUuid())) {
                throw new Exception("参数错误");
            }
            militaryTargetService.modifyTarget(militaryTarget);
            /*militaryTraceService.deleteTraceByTarget(militaryTarget.getUuid());
            List<MilitaryTrace> targetTraces = militaryTarget.getTargetTraces();
            if (targetTraces != null) {
                targetTraces.forEach(trace -> {
                    trace.setUuid(UUID.randomUUID().toString().toUpperCase());
                    trace.setTarget(militaryTarget.getUuid());
                    militaryTraceService.saveTrace(trace);
                });
            }*/
        } catch (Exception e) {
            response.setCode(ResponseBase.FAILURE);
            response.setMsg(e.getMessage());
        }
        return JSON.toJSONString(response);
    }

    @RequestMapping("getAllMilitaryProperty")
    public String getAllMilitaryProperty() {
        ResponseBase response = new ResponseBase();
        try {
            response.setData(militaryPropertyService.getAllProperty());
        } catch (Exception e) {
            response.setCode(ResponseBase.FAILURE);
            response.setMsg(e.getMessage());
        }
        return JSON.toJSONString(response);
    }

    @RequestMapping("concatBatch")
    public String concatBatch() {
        return null;
    }

}
