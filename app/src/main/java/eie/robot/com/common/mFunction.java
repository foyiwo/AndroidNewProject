package eie.robot.com.common;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;

public class mFunction {
    /**
     * 设置Android6.0的权限申请
     */
    public static void setPermissions(Activity mContext) {
        final String[] PERMISSION = new String[]{
                Manifest.permission.READ_CONTACTS,          // 读取联系人
                Manifest.permission.ACCESS_COARSE_LOCATION, //用于进行网络定位
                Manifest.permission.ACCESS_FINE_LOCATION,   //用于访问GPS定位
                Manifest.permission.WRITE_EXTERNAL_STORAGE, //写入外部存储
                Manifest.permission.READ_EXTERNAL_STORAGE,  //读取外部存储
                Manifest.permission.READ_PHONE_STATE,        //读取电话状态
                Manifest.permission.CAMERA                    //读取电话状态
        };
        if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED
                ||ContextCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                ||ContextCompat.checkSelfPermission(mContext, Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED
                ||ContextCompat.checkSelfPermission(mContext, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            //Android 6.0申请权限
            ActivityCompat.requestPermissions(mContext,PERMISSION,1);
        }else{
            Log.i("申请","权限申请ok");
        }
    }
}
