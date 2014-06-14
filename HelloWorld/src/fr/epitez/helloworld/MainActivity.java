package fr.epitez.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	protected void logStackTrace() {
    	Log.i("fr.epitez", this.getLocalClassName()+":o:"+Thread.currentThread().getStackTrace()[3].getMethodName());		
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	logStackTrace();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    protected void onStart() {
    	logStackTrace();
    	super.onStart();
    }

    @Override
    protected void onRestart() {
    	logStackTrace();
    	super.onRestart();
    }

    @Override
    protected void onResume() {
    	logStackTrace();
    	super.onResume();
    }

    @Override
    protected void onPause() {
    	logStackTrace();
    	super.onPause();
    }

    @Override
    protected void onStop() {
    	logStackTrace();
    	super.onStop();
    }

    @Override
    protected void onDestroy() {
    	logStackTrace();
    	super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	logStackTrace();
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	logStackTrace();
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        	Log.i("EPITEZ", "MainActivity::PlaceholderFragment::onCreateView");
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
