package eie.robot.com;

import android.app.Application;
import com.qmuiteam.qmui.arch.QMUISwipeBackActivityManager;
import com.vondear.rxtool.RxTool;

public class eieRobotApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RxTool.init(this);
        QMUISwipeBackActivityManager.init(this);
    }
}
