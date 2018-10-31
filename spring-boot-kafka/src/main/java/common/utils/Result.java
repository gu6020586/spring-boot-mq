package common.utils;

public class Result {

    private Integer code;

    private String msg;

    private Object object;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Result success(Object data){

        Result result=new Result();

        result.setCode(10000);

        result.setObject(data);

        result.setMsg("成功");

        return result;

    }


    public static Result success(){
        return success(null);
    }

    //当错误时返回的值
    public static Result error(int code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


}
