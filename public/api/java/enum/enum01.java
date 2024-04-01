public enum StatusEnum {
    NORMAL("ok","正常"),
    NOT_NORMAL("stop","停用");

    private String val;

    private String desc;

    StatusEnum(String val, String desc) {
        this.val = val;
        this.desc = desc;
    }

    public StatusEnum getInstanceByCode(String code){
        List<StatusEnum> enums = Arrays.asList(StatusEnum.values());
        for (StatusEnum enumObj : enums){
            if (enumObj.val.equals(code)){
                return enumObj;
            }
        }
        throw new RuntimeException("没有找到对应的枚举");
    }

    public String getVal() {
        return val;
    }


    public String getDesc() {
        return desc;
    }
}
