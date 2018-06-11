package net.lln.web.naTalk.push.service;

import net.lln.web.naTalk.push.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author Kryna
 */
//定义访问路径 127.0.0.1/api/account/...
@Path("/account")
public class AccountService {
    //GET 127.0.0.1/api/account/login
    @GET
    @Path("/login")
    public String get(){
        return "you get the login";
    }

    //POST 127.0.0.1/api/account/login
    @POST
    @Path("/login")
    //指定请求与返回的响应体为JSON
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User post(){
        User u = new User();
        u.setName("LLN");
        u.setSex(2);
        return u;
    }
}
