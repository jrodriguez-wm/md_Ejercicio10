package mx.com.webmaps.md_ejercicio10;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    TabLayout tabLayout;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= (Toolbar) findViewById(R.id.toolbar_id);

        setSupportActionBar(toolbar);


        viewPager = (ViewPager) findViewById(R.id.viewPager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new OneFragment(),"ITEM ONE");
        adapter.addFragment(new TwoFragment(),"ITEM TWO");
        adapter.addFragment(new ThreeFragment(),"ITEM THREE");

        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        tabLayout.setupWithViewPager(viewPager);

    }
}
