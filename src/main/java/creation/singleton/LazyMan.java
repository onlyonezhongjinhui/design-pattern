package creation.singleton;

/**
 * @author zhongjinhui
 * @date 2020/7/24 17:35
 * @description 懒汉式
 */
public class LazyMan {
    private static LazyMan instance;

    public static synchronized LazyMan getInstance() {
        if (instance == null) {
            instance = new LazyMan();
        }
        return instance;
    }

    private LazyMan() {
    }
}
