package yobra.msupa.brianyobra.filters;

/**
 * Created by brianyobra on 8/27/18.
 */

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
public class CustomActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_view);
        TextView label = (TextView) findViewById(R.id.show_data);
        Uri url = getIntent().getData();
        label.setText(url.toString());
    }
}
