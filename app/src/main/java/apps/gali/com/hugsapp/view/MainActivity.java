package apps.gali.com.hugsapp.view;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import apps.gali.com.hugsapp.R;
import apps.gali.com.hugsapp.controller.FragmentChanger;
import apps.gali.com.hugsapp.controller.MySQLHelper;
import apps.gali.com.hugsapp.controller.Utils;
import apps.gali.com.hugsapp.model.Subject;

public class MainActivity extends AppCompatActivity implements FragmentChanger {

    MySQLHelper mySQLHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySQLHelper = new MySQLHelper(this);
        //Utils.FillStarterDB(mySQLHelper);

        //define the fragments
        MainFragment mainFragment = (MainFragment)getSupportFragmentManager().findFragmentByTag("mainFragment");
        if (mainFragment == null) {
            mainFragment = new MainFragment();
            mainFragment.mySQLHelper = mySQLHelper;
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.activity_main, mainFragment, "mainFragment");
            transaction.commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            finish();
        } else {
            getSupportFragmentManager().popBackStack();
        }
    }

    @Override
    public void changeFragmentToSubject(Subject subject) {
        if (subject != null) {

            SubjectFragment fragment = new SubjectFragment();
            fragment.subject = subject;
            fragment.mySQLHelper = mySQLHelper;
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.addToBackStack("subject");
            transaction.replace(R.id.activity_main, fragment,"subjectFragment").commit();

        }
    }
}
