package net.lln.web.naTalk.push;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import net.lln.web.naTalk.push.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * @author Kryna
 */
public class Application extends ResourceConfig {
    public Application(){
        //注册逻辑处理的包名
        packages(AccountService.class.getPackage().getName());
        //注册json转换器
        register(JacksonJsonProvider.class);
        //注册日志打印输出
        register(Logger.class);
    }
}
