package creation.factory.factorymethod;

import creation.factory.simplefactory.RuleConfig;

/**
 * @author zhongjinhui
 * @date 2020/7/31 11:19
 * @description
 */
public class FactoryMethodMain {

    public static void main(String[] args) {
        load1("xxx");
        load2("xxx");
    }

    public static String getFileExtension(String filePath) {
        return "json";
    }

    public static String getFileContent(String filePath) {
        return "...";
    }

    public static RuleConfig load1(String filePath) {
        var fileExtension = getFileExtension(filePath);
        IRuleConfigParserFactory factory;
        if ("json".equalsIgnoreCase(fileExtension)) {
            factory = new JsonRuleConfigParserFactory();
        } else if ("xml".equalsIgnoreCase(fileExtension)) {
            factory = new XmlRuleConfigParserFactory();
        } else if ("yml".equalsIgnoreCase(fileExtension)) {
            factory = new YmlRuleConfigParserFactory();
        } else {
            throw new IllegalArgumentException();
        }
        var parser = factory.createParser();
        var content = getFileContent(filePath);
        return parser.parse(content);
    }

    public static RuleConfig load2(String filePath) {
        var fileExtension = getFileExtension(filePath);
        IRuleConfigParserFactory factory = FactoryMethodSimpleFactory.getParserFactory(fileExtension);
        var parser = factory.createParser();
        var content = getFileContent(filePath);
        return parser.parse(content);
    }
}
