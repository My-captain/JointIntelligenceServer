package zliu.elliot.JointIntelligentDrillServer.utils;

public class ResponseBase {
    public final transient static short SUCCESS = 0;
    public final transient static short FAILURE = 100;

    public ResponseBase() {
        this.code = SUCCESS;
    }

    public Short getCode() {
        return code;
    }

    public void setCode(Short code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean ifSuccess() {
        return this.code == ResponseBase.SUCCESS;
    }

    private Short code;
    private String msg;
    private Object data;
}