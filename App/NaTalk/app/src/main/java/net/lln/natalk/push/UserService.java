package net.lln.natalk.push;

/**
 * Created by Alva on 2018/6/12.
 */

public class UserService implements IUserService{
    @Override
    public String search(int hashCode){
        return "User:"+hashCode;
    }
}
