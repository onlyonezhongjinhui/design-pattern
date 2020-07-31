package creation.factory.abstractfactory;


/**
 * @author zhongjinhui
 * @date 2020/7/31 14:44
 * @description
 */
public interface ISystemConfigParser {

    /**
     * 解析系统配置
     *
     * @param configText 配置文本
     * @return creation.factory.abstractfactory.SystemConfig
     * @author zhongjinhui
     * @date 2020/7/31 14:47
     */
    SystemConfig parse(String configText);
}
