package creation.factory.abstractfactory;

import creation.factory.simplefactory.IRuleConfigParser;
import creation.factory.simplefactory.JsonRuleConfigParser;

/**
 * @author zhongjinhui
 * @date 2020/7/31 14:52
 * @description
 */
public class JsonConfigParserFactory implements IConfigParserFactory {

    @Override
    public IRuleConfigParser createRuleConfigParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemConfigParser() {
        return new JsonSystemConfigParser();
    }
}
