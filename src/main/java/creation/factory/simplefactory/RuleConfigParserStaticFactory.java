package creation.factory.simplefactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhongjinhui
 * @date 2020/7/31 11:07
 * @description 简单工厂(复用对象)
 */
public class RuleConfigParserStaticFactory {

    private static final Map<String, IRuleConfigParser> PARSERS = new HashMap<>();

    static {
        PARSERS.put("json", new JsonRuleConfigParser());
        PARSERS.put("xml", new XmlRuleConfigParser());
        PARSERS.put("yml", new YmlRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String fileExtension) {
        return PARSERS.get(fileExtension);
    }
}
