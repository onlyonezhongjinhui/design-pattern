package creation.factory.abstractfactory;

import creation.factory.simplefactory.IRuleConfigParser;

/**
 * @author zhongjinhui
 * @date 2020/7/31 14:43
 * @description 抽象工厂接口
 */
public interface IConfigParserFactory {

    /**
     * 创建规则配置解析器
     *
     * @return creation.factory.simplefactory.IRuleConfigParser
     * @author zhongjinhui
     * @date 2020/7/31 14:51
     */
    IRuleConfigParser createRuleConfigParser();

    /**
     * 创建系统配置解析器
     *
     * @return creation.factory.abstractfactory.ISystemConfigParser
     * @author zhongjinhui
     * @date 2020/7/31 14:51
     */
    ISystemConfigParser createSystemConfigParser();

    //此处可以扩展新的parser类型，比如IBizConfigParser
}
