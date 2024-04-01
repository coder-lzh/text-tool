public abstract class SuperClass<T> {

    protected final Class<T> getGenericClass() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        return (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }

}

public class Main extends SuperClass<User> {

    public static void main(String[] args) {
        System.out.println(new Main().getGenericClass());
    }

}

public class User {
}
