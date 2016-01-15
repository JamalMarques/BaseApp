package com.basesoft.baseapp.Activities;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by yamil.marques on 1/13/16.
 */
public class BaseActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;
    protected Toolbar toolBar;
    protected CharSequence mTitle;

    public Toolbar getToolBar(){
        return toolBar;
    }

    public void setActionBarTitle(String title) {
        mTitle = title;
        getSupportActionBar().setTitle(title);
        //CustomActionBarUtils.initializeCustomActionBarWithHomeUpEnabled(getActionBar(), title);
    }


}
