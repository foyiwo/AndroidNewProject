package eie.robot.com.controller;

import android.content.Context;
import butterknife.BindView;

public class HomeRobotController extends BaseController {

    private Context mContext;
    public HomeRobotController(Context context, int ViewId) {
        super(context, ViewId);
        mContext = context;
    }

    @Override
    protected String getTitle() {
        return "机器总动员";
    }
}
