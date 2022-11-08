package com.ihblu.loldict.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.ihblu.common.app.BaseActivity;
import com.ihblu.common.app.LolApplication;
import com.ihblu.factory.presenter.account.LoginContract;
import com.ihblu.loldict.R;
import com.ihblu.utils.LogUtil;

/**
 * @BelongsProject: LolDict
 * @BelongsPackage: com.ihblu.loldict.ui
 * @Author: wyl
 * @CreateTime: 2022-11-08  17:02
 * @Description: TODO
 * @Version: 1.0
 */
public class LoginActivity extends BaseActivity implements LoginContract.View, View.OnClickListener {
    private static final String TAG = "LoginActivity";

    private Button mBtnQQLogin;
    private Button mBtnWxLogin;
    private CheckBox mCbPrivacy;
    private LinearLayout mLlHelp;
    private LoginContract.Presenter mLoginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initView() {
        super.initView();
        mBtnQQLogin = findViewById(R.id.btn_qq_login);
        mBtnWxLogin = findViewById(R.id.btn_wx_login);
        mCbPrivacy = findViewById(R.id.cb_agree_privacy);
        mLlHelp = findViewById(R.id.ll_help);
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void showError(int str) {
        LolApplication.showToast(str);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        mLoginPresenter = presenter;
    }

    @Override
    public void loginSuccess() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLoginPresenter.destroy();
    }

    @Override
    public void onClick(View v) {
        if (v == mBtnQQLogin) {
            mLoginPresenter.qqLogin();
        } else if (v == mBtnWxLogin) {
            mLoginPresenter.wxLogin();
        } else if (v == mLlHelp) {
            LogUtil.d(TAG, "onClick: display help info");
        }
    }
}