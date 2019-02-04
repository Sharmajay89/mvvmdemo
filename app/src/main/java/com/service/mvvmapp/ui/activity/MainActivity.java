package com.service.mvvmapp.ui.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import com.service.mvvmapp.R;
import com.service.mvvmapp.databinding.ActivityMainBinding;
import com.service.mvvmhelper.BR;
import com.service.mvvmhelper.activities.BindingActivity;

public class MainActivity extends BindingActivity<ActivityMainBinding,MainActivityVM> {
    @Override
    public MainActivityVM onCreate() {
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)


        return new MainActivityVM(this);
    }

    @Override
    public int getVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    /*BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.navigation_home :{
                    // message.setText(R.string.title_home);
                    return true;
                }
                case R.id.navigation_dashboard :{
                    //message.setText(R.string.title_home);
                    return true;
                }
                case R.id.navigation_notifications :{
                    //message.setText(R.string.title_home);
                    return true;
                }
            }
            return false;
        }
    };*/

}
