package aplicaciones.desarrollo.com.apprepaso;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView texto = (TextView) findViewById(R.id.parcial);
        Nuevo objeto = new Nuevo(texto);
        Button btn = (Button)findViewById(R.id.n0);
        btn.setOnClickListener(objeto);
        btn = (Button)findViewById(R.id.n1);
        btn.setOnClickListener(objeto);
        btn = (Button)findViewById(R.id.n2);
        btn.setOnClickListener(objeto);
        btn = (Button)findViewById(R.id.n3);
        btn.setOnClickListener(objeto);
        btn = (Button)findViewById(R.id.n4);
        btn.setOnClickListener(objeto);
        btn = (Button)findViewById(R.id.n5);
        btn.setOnClickListener(objeto);
        btn = (Button)findViewById(R.id.n6);
        btn.setOnClickListener(objeto);
        btn = (Button)findViewById(R.id.n7);
        btn.setOnClickListener(objeto);
        btn = (Button)findViewById(R.id.n8);
        btn.setOnClickListener(objeto);
        btn = (Button)findViewById(R.id.n9);
        btn.setOnClickListener(objeto);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
