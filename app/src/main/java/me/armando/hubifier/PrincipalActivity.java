package me.armando.hubifier;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PrincipalActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.btnSettings)
        {
            Toast tstMessage=Toast.makeText(getApplicationContext(), getText(R.string.strSettingsMessage), Toast.LENGTH_SHORT);
            tstMessage.show();
        }
        return super.onOptionsItemSelected(item);
    }


    // Custom functions...

    public void displayToast(View view)
    {
        Button btnTemp=(Button)view;
        String appName=(String)btnTemp.getText();
        Context context=getApplicationContext();
        CharSequence text=getString(R.string.strToastMessage1)+" "+appName+(appName.toLowerCase().contains("app") ? " " : " "+getString(R.string.strToastMessage2));
        int duration=Toast.LENGTH_SHORT;
        Toast toast=Toast.makeText(context, text, duration);
        toast.show();
    }
}
