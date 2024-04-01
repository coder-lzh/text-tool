config.list=1,2,3
config.list2=3,4,5


// 两种方式都可以

@Value("${config.list}")
private List<Integer> listConfig;
@Value("#{'${config.list2}'.split(',')}")
private List<Integer> listConfig2;

