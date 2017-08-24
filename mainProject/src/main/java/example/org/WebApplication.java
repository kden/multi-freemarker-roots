package example.org;

import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.MultiTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.utility.XmlEscape;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class WebApplication {

    @Bean(name = "freemarkerConfig")
    public FreeMarkerConfigurer freemarkerConfig() {
        Configuration freeMarkerConfig = new Configuration();
        ClassTemplateLoader ctl1 = new ClassTemplateLoader(this.getClass(), "/");
        ClassTemplateLoader ctl2 = new ClassTemplateLoader(this.getClass(), "/macros");
        ClassTemplateLoader ctl3 = new ClassTemplateLoader(this.getClass(), "/templates");


        MultiTemplateLoader mtl = new MultiTemplateLoader(new TemplateLoader[] { ctl1, ctl2, ctl3 });
        freeMarkerConfig.setTemplateLoader(mtl);

        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        configurer.setConfiguration(freeMarkerConfig);
        Map<String, Object> map = new HashMap<>();
        map.put("xml_escape", new XmlEscape());
        configurer.setFreemarkerVariables(map);
        return configurer;
    }

    public static void main(String[] args)
            throws Exception
    {

        SpringApplication.run(WebApplication.class, args);
    }

}
