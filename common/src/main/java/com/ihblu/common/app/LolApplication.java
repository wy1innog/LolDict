package com.ihblu.common.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: LolDict
 * @BelongsPackage: com.ihblu.common.app
 * @Author: wyl
 * @CreateTime: 2022-11-08  19:57
 * @Description: TODO
 * @Version: 1.0
 */
public class LolApplication extends Application {
    private static Application instance;
    private List<Activity> activities = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
                activities.add(activity);
            }

            @Override
            public void onActivityStarted(@NonNull Activity activity) {

            }

            @Override
            public void onActivityResumed(@NonNull Activity activity) {

            }

            @Override
            public void onActivityPaused(@NonNull Activity activity) {

            }

            @Override
            public void onActivityStopped(@NonNull Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(@NonNull Activity activity) {

            }
        });
    }

    public void finishAll() {
        for (Activity activity : activities) {
            activity.finish();
        }
    }

    public static Application getInstance() {
        return instance;
    }

    public static void showToast(final String msg) {
        Toast.makeText(instance, msg, Toast.LENGTH_SHORT).show();
    }

    public static void showToast(@StringRes int msgId) {
        showToast(instance.getString(msgId));
    }
}