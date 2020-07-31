package creation.factory.abstractfactory;

import creation.factory.simplefactory.IRuleConfigParser;
import creation.factory.simplefactory.YmlRuleConfigParser;

/**
 * @author zhongjinhui
 * @date 2020/7/31 14:52
 * @description
 */
public class YmlConfigParserFactory implements IConfigParserFactory {

    @Override
    public IRuleConfigParser createRuleConfigParser() {
        return new YmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemConfigParser() {
        return new YmlSystemConfigParser();
    }
}
