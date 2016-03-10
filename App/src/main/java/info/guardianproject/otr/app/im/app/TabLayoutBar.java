package info.guardianproject.otr.app.im.app;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

import info.guardianproject.otr.app.im.R;

/**
 * Created by janki on 17/6/15.
 */
public class TabLayoutBar extends TabActivity implements TabHost.OnTabChangeListener {


    TabHost tabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_bar_activity);


        tabHost = getTabHost();


        tabHost.setOnTabChangedListener(this);

        TabHost.TabSpec spec;
        Intent intent;


        intent = new Intent().setClass(this, NewChatActivity.class);
        spec = tabHost.newTabSpec("First").setIndicator("")
                .setContent(intent);

        tabHost.addTab(spec);


        intent = new Intent().setClass(this, AddContactActivity.class);
        spec = tabHost.newTabSpec("Second").setIndicator("")
                .setContent(intent);
        tabHost.addTab(spec);


    }

    @Override
    public void onTabChanged(String s) {
        for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
        {
            if(i==0)
                tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Integer.parseInt("red"));
               // tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.tab1);
            else if(i==1)
                tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Integer.parseInt("red"));
               // tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.tab2);

        }


        Log.i("tabs", "CurrentTab: " + tabHost.getCurrentTab());

        if(tabHost.getCurrentTab()==0)
            tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Integer.parseInt("green"));
           // tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.tab1_over);
        else if(tabHost.getCurrentTab()==1)
            tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Integer.parseInt("green"));
          //  tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.tab2_over);

    }
    }

