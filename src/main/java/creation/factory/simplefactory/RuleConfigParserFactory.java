package creation.factory.simplefactory;

/**
 * @author zhongjinhui
 * @date 2020/7/31 11:07
 * @description 简单工厂
 */
public class RuleConfigParserFactory {

    public static IRuleConfigParser createParser(String fileExtension) {
        if ("json".equalsIgnoreCase(fileExtension)) {
            return new JsonRuleConfigParser();
        }

        if ("xml".equalsIgnoreCase(fileExtension)) {
            return new XmlRuleConfigParser();
        }

        if ("yml".equalsIgnoreCase(fileExtension)) {
            return new YmlRuleConfigParser();
        }

        throw new IllegalArgumentException("unknown file extension.");
    }
}
