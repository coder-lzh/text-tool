config.map={name: 'star',age: 25}



@Value("#{${config.map}}")
private Map<String,String> mapConfig;

