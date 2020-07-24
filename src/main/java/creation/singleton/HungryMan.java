package creation.singleton;

/**
 * @author zhongjinhui
 * @date 2020/7/24 17:34
 * @description 饿汉式
 */
public class HungryMan {
    private static final HungryMan INSTANCE = new HungryMan();

    public static HungryMan getInstance() {
        return INSTANCE;
    }

    private HungryMan() {
    }
}
