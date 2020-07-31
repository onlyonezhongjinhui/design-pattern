package creation.factory.simplefactory;

/**
 * @author zhongjinhui
 * @date 2020/7/31 11:19
 * @description
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {
        load("xxx");
    }

    public static String getFileExtension(String filePath) {
        return "json";
    }

    public static String getFileContent(String filePath) {
        return "...";
    }

    public static RuleConfig load(String filePath) {
        var fileExtension = getFileExtension(filePath);
        var parser = RuleConfigParserFactory.createParser(fileExtension);
        var content = getFileContent(filePath);
        return parser.parse(content);
    }
}
