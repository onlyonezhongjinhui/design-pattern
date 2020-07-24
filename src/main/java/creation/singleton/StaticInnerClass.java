package creation.singleton;

/**
 * @author zhongjinhui
 * @date 2020/7/24 18:00
 * @description 静态内部类式
 */
public class StaticInnerClass {

    public static StaticInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    private StaticInnerClass() {
    }
}
