package aplicaciones.desarrollo.com.apprepaso;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Nuevo implements View.OnClickListener {

    TextView texto;

    public Nuevo(TextView texto)
    {
        this.texto = texto;
    }

    @Override
    public void onClick(View v) {
        //
        Button f = (Button)v;
        texto.setText(texto.getText().toString() + f.getText().toString());
    }
}
