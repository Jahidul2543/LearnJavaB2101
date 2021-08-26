package yamloperations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.File;

public class YamlUtilities {

    /**
     *
     * Tutorials
     * 1. https://dzone.com/articles/read-yaml-in-java-with-jackson
     * 2. https://stackabuse.com/reading-and-writing-yaml-files-in-java-with-jackson/
     *
     * */
    public static void main(String[] args) {
       readYaml();
    }

    public static void readYaml(){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        String filePath = System.getProperty("user.dir") + "/src/main/java/yamloperations/user.yaml";
        try {
            User user = mapper.readValue(new File(filePath), User.class);
            System.out.println(ReflectionToStringBuilder.toString(user, ToStringStyle.MULTI_LINE_STYLE));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
