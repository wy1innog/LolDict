package com.ihblu.common.app;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ihblu.utils.LogUtil;

/**
 * @BelongsProject: LolDict
 * @BelongsPackage: com.ihblu.loldict.common
 * @Author: wyl
 * @CreateTime: 2022-11-08  17:37
 * @Description: TODO
 * @Version: 1.0
 */
public abstract class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtil.d(TAG, "onCreate: extras: " + getIntent().getExtras());
        initWidows();

        if (initArgs(getIntent().getExtras())) {
            int layId = getContentLayoutId();
            setContentView(layId);
            initView();
            initData();
        } else {
            finish();
        }
    }

    /**
     * 初始化相关参数
     * @param bundle
     * @return 如果参数正确返回True，错误返回False
     */
    protected boolean initArgs(Bundle bundle) {
        return true;
    }

    /**
     * 初始化窗口
     */
    protected void initWidows() {

    }

    protected void initView() {
    }

    protected void initData() {}
    /**
     * 得到当前界面的资源文件Id
     * @return
     */
    protected abstract int getContentLayoutId();
}