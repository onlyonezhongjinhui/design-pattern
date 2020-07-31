package creation.factory.simplefactory;

/**
 * @author zhongjinhui
 * @date 2020/7/31 11:13
 * @description 规则配置解析接口
 */
public interface IRuleConfigParser {

    /**
     * 解析规则配置
     *
     * @param configText 配置文本
     * @return creation.factory.simplefactory.RuleConfig
     * @author zhongjinhui
     * @date 2020/7/31 11:13
     */
    RuleConfig parse(String configText);

}
