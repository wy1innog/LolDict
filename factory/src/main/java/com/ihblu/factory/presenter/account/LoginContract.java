package com.ihblu.factory.presenter.account;

import com.ihblu.factory.presenter.BaseContract;

public interface LoginContract {
    interface View extends BaseContract.View<Presenter> {
        /**
         * login success
         */
        void loginSuccess();
    }

    interface Presenter extends BaseContract.Presenter {
        /**
         * qq login
         */
        void qqLogin();

        /**
         * wx login
         */
        void wxLogin();
    }
}