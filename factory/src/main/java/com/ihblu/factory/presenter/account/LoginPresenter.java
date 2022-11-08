package com.ihblu.factory.presenter.account;


import com.ihblu.factory.presenter.BasePresenter;

/**
 * @BelongsProject: LolDict
 * @BelongsPackage: com.ihblu.factory.presenter.account
 * @Author: wyl
 * @CreateTime: 2022-11-08  17:48
 * @Description: TODO
 * @Version: 1.0
 */
public class LoginPresenter extends BasePresenter<LoginContract.View>
        implements LoginContract.Presenter {
    private static final String TAG = "LoginPresenter";

    public LoginPresenter(LoginContract.View view) {
        super(view);
    }

    @Override
    public void qqLogin() {
        // TODO: use qq login interface
    }

    @Override
    public void wxLogin() {
        // TODO: use wx login interface
    }
}