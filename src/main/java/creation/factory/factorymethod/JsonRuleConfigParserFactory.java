package creation.factory.factorymethod;

import creation.factory.simplefactory.IRuleConfigParser;
import creation.factory.simplefactory.JsonRuleConfigParser;

/**
 * @author zhongjinhui
 * @date 2020/7/31 11:52
 * @description
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
