package creation.factory.abstractfactory;

import creation.factory.simplefactory.IRuleConfigParser;
import creation.factory.simplefactory.XmlRuleConfigParser;

/**
 * @author zhongjinhui
 * @date 2020/7/31 14:52
 * @description
 */
public class XmlConfigParserFactory implements IConfigParserFactory {

    @Override
    public IRuleConfigParser createRuleConfigParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemConfigParser() {
        return new XmlSystemConfigParser();
    }
}
