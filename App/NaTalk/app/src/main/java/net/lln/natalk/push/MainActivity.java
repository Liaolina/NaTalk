package net.lln.natalk.push;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.ViewTarget;

import net.lln.natalk.common.Common;
import net.lln.natalk.common.app.Activity;
import net.lln.natalk.common.widget.PortraitView;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends Activity{

    @BindView(R.id.appbar)
    View mLayAppbar;
    @BindView(R.id.iv_portrait)
    PortraitView portraitView;
    @BindView(R.id.tv_title)
    TextView tv_title;
    @BindView(R.id.framlay_container)
    FrameLayout frameLayout_container;
    @BindView(R.id.navigation)
    BottomNavigationView bottomNavigationView;

    @Override
    protected int getContentLayoutId() {return R.layout.activity_main;}

    @Override
    protected void initData() {
        super.initData();

    }

    @Override
    protected void initWidget() {
        super.initWidget();
        Glide.with(this).load(R.drawable.bg_src_morning)
                .centerCrop()
                .into(new ViewTarget<View,GlideDrawable>(mLayAppbar) {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        this.view.setBackground(resource.getCurrent());
                    }
                });
    }

    @OnClick(R.id.iv_search)
    void onSearchMenuClick(){

    }
    @OnClick(R.id.bt_action)
    void onActionClick(){

    }
}
