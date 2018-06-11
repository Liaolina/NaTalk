package net.lln.natalk.common.app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Kryna on 2018/6/11.
 */

public abstract class Fragment extends android.support.v4.app.Fragment{
    protected View mView;
    protected Unbinder mUnbinder;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //初始化参数
        initArgs(getArguments());

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(mView==null) {
            int layid = getContentLayoutId();
            //初始化当前的根布局，但不在创建时就添加到container里面
            View view = inflater.inflate(layid, container, false);
            initWidget(view);
            mView = view;
        }else{
            if(mView.getParent()!=null){
                //把当前view从父控件中移除
                ((ViewGroup)mView.getParent()).removeView(mView);
            }
        }
        return mView;

    }

    /**
     * 界面初始化完成后
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //view创建完成后初始化数据
        initData();
    }

    /**
     * 初始化相关参数
     */
    protected void initArgs(Bundle bundle){

    }

    /**
     * 得到当前界面的资源文件Id
     * @return 资源文件id
     */
    @LayoutRes
    protected abstract int getContentLayoutId();

    /**
     * 初始化控件
     */
    protected void initWidget(View view){
        ButterKnife.bind(this,view);
    }

    /**
     * 初始化数据
     */
    protected void initData(){}

    /**
     * 返回按键触发时调用
     * @return 返回true代表已经处理返回逻辑，Activity不用再finish
     * 返回false,代表没有处理
     */
    public boolean onBackPressed(){
        return false;
    }
}
