package yobra.msupa.brianyobra.filters;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// First intent to use ACTION_VIEW action with correct data
        Button startBrowser_a = (Button)
                findViewById(R.id.start_browser_a);
        startBrowser_a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://www.example.com"));
                startActivity(i);
            }
        });
// Second intent to use LAUNCH action with correct data
        Button startBrowser_b = (Button)
                findViewById(R.id.start_browser_b);
        startBrowser_b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent("yobra.msupa.brianyobra.filters.LAUNCH",
                        Uri.parse("http://www.google.com"));
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the
// action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}