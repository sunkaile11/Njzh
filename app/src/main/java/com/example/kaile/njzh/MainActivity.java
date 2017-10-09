package com.example.kaile.njzh;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import com.example.kaile.njzh.fragment.CourseFragment;
import com.example.kaile.njzh.fragment.LocationFragment;
import com.example.kaile.njzh.fragment.SettingFragment;
import com.example.kaile.njzh.fragment.ThingsFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mTabCourse;
    private LinearLayout mTabLocation;
    private LinearLayout mTabThings;
    private LinearLayout mTabSetting;

    private CourseFragment mCourse;
    private LocationFragment mLocation;
    private ThingsFragment mThings;
    private SettingFragment mSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        mTabCourse=(LinearLayout)findViewById(R.id.tab_course);
        mTabLocation=(LinearLayout)findViewById(R.id.tab_location);
        mTabThings=(LinearLayout)findViewById(R.id.tab_things);
        mTabSetting=(LinearLayout)findViewById(R.id.tab_setting);

        mTabCourse.setOnClickListener(this);
        mTabLocation.setOnClickListener(this);
        mTabThings.setOnClickListener(this);
        mTabSetting.setOnClickListener(this);

        setDefaultFragment();
    }

    private void setDefaultFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mCourse = new CourseFragment();
        transaction.replace(R.id.id_content, mCourse);
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        // 开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();

        switch(v.getId()){
            case R.id.tab_course:
                if (mCourse == null)
                {
                    mCourse = new CourseFragment();
                }
                // 使用当前Fragment的布局替代id_content的控件
                transaction.replace(R.id.id_content, mCourse);
                break;
            case R.id.tab_location:
                if (mLocation == null)
                {
                    mLocation = new LocationFragment();
                }
                // 使用当前Fragment的布局替代id_content的控件
                transaction.replace(R.id.id_content, mLocation);
                break;
            case R.id.tab_things:
                if (mThings == null)
                {
                    mThings = new ThingsFragment();
                }
                // 使用当前Fragment的布局替代id_content的控件
                transaction.replace(R.id.id_content, mThings);
                break;
            case R.id.tab_setting:
                if (mSetting == null)
                {
                    mSetting = new SettingFragment();
                }
                // 使用当前Fragment的布局替代id_content的控件
                transaction.replace(R.id.id_content, mSetting);
                break;
            default:
                break;
        }
        transaction.commit();
    }
}
