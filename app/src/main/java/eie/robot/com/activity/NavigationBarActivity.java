package eie.robot.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.qmuiteam.qmui.arch.QMUIFragmentActivity;

import eie.robot.com.R;
import eie.robot.com.common.mFunction;
import eie.robot.com.common.mGlobal;
import eie.robot.com.fragment.BaseFragment;
import eie.robot.com.fragment.HomeFragment;

public class NavigationBarActivity extends QMUIFragmentActivity {
    @Override
    protected int getContextViewId() { return R.id.qmuidemo; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            BaseFragment fragment = new HomeFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(getContextViewId(), fragment, fragment.getClass().getSimpleName())
                    .addToBackStack(fragment.getClass().getSimpleName())
                    .commit();
        }

        //保存导航栏页的Activity到全局类，以备后用
        mGlobal.mNavigationBarActivity = NavigationBarActivity.this;

        //动态获取权限
        mFunction.setPermissions(NavigationBarActivity.this);

    }

}
