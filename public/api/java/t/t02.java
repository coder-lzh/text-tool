package xxx.xxx.xxx;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface ServiceA<T> {
}

public interface ServiceB<T> {
}

public class ServiceImpl implements ServiceA<EntityA>, ServiceB<EntityB> {

    public static void main(String[] args) {
        Type[] genericInterfaces = ServiceImpl.class.getGenericInterfaces();
        if (genericInterfaces.getClass().isAssignableFrom(ParameterizedType[].class)) {
            for (Type genericInterface : genericInterfaces) {
                ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Type type = actualTypeArguments[0];
                if (type instanceof Class) {
                    Class<?> clazz = (Class<?>) type;
                    System.out.println(clazz);
                }
            }
        }
    }

}

public class EntityA {
}

public class EntityB {
}
