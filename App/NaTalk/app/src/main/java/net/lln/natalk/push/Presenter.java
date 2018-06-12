package net.lln.natalk.push;

import android.text.TextUtils;

/**
 * Created by Alva on 2018/6/12.
 */

public class Presenter implements IPresenter{

    private IView mView;
    public Presenter(IView mView){
        this.mView = mView;
    }

    @Override
    public void search() {
        //开启界面Loading
        String inputString = mView.getInputString();
        if(TextUtils.isEmpty(inputString)){
            //为空直接返回
            return;
        }
        int hashCode = inputString.hashCode();
        IUserService iUserService = new UserService();
        String serviceResult = iUserService.search(hashCode);
        String result = "Result:"+inputString+"-"+serviceResult;
        //关闭界面Loading
        mView.setResultString(result);
    }
}
