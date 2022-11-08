package com.ihblu.factory.presenter;

import androidx.annotation.StringRes;

/**
 * @author wyl
 */
public interface BaseContract {

    interface View<T extends Presenter> {
        /**
         * public show error msg
         * @param str
         */
        void showError(@StringRes int str);

        /**
         * public show loading
         */
        void showLoading();

        /**
         * set a presenter
         * @param presenter
         */
        void setPresenter(T presenter);
    }

    interface Presenter {
        /**
         * public start
         */
        void start();

        /**
         * public destroy
         */
        void destroy();
    }
}