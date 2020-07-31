package creation.factory.factorymethod;

import creation.factory.simplefactory.IRuleConfigParser;

/**
 * @author zhongjinhui
 * @date 2020/7/31 11:50
 * @description
 */
public interface IRuleConfigParserFactory {

    /**
     * 创建解析类
     *
     * @return creation.factory.simplefactory.IRuleConfigParser
     * @author zhongjinhui
     * @date 2020/7/31 11:51
     */
    IRuleConfigParser createParser();
}
