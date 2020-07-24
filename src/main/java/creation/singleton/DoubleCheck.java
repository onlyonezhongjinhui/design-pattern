package creation.singleton;

/**
 * @author zhongjinhui
 * @date 2020/7/24 17:40
 * @description 双重检测
 */
public class DoubleCheck {
    private static DoubleCheck instance;

    public static DoubleCheck getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (DoubleCheck.class) {
            if (instance == null) {
                instance = new DoubleCheck();
            }
        }
        return instance;
    }

    private DoubleCheck() {
    }
}
