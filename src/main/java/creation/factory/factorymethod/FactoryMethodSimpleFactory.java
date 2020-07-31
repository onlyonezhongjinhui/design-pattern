package creation.factory.factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhongjinhui
 * @date 2020/7/31 12:00
 * @description
 */
public class FactoryMethodSimpleFactory {
    private static final Map<String, IRuleConfigParserFactory> FACTORIES = new HashMap<>();

    static {
        FACTORIES.put("json", new JsonRuleConfigParserFactory());
        FACTORIES.put("xml", new XmlRuleConfigParserFactory());
        FACTORIES.put("yml", new YmlRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String fileExtension) {
        return FACTORIES.get(fileExtension);
    }
}
