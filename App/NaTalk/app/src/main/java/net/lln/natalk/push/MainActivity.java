package net.lln.natalk.push;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import net.lln.natalk.common.Common;
import net.lln.natalk.common.app.Activity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends Activity implements IView{
    @BindView(R.id.tv_test)
    TextView tv_test;
    @BindView(R.id.ed_query)
    EditText ed_query;

    private IPresenter iPresenter;

    @Override
    protected int getContentLayoutId() {return R.layout.activity_main;}

    @Override
    protected void initData() {
        super.initData();
        iPresenter = new Presenter(this);
    }

    @OnClick(R.id.bt_submit)
    void onSubmit(){
        iPresenter.search();
    }

    @Override
    public String getInputString() {
        return ed_query.getText().toString();
    }

    @Override
    public void setResultString(String string) {
        tv_test.setText(string);
    }
}
