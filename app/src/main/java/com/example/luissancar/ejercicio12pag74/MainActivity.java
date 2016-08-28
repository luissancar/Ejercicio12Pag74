package com.example.luissancar.ejercicio12pag74;

/******
 * Es necesario añadir al fichero AndroidManifest.xml
 *
 *
 *
            <uses-permission android:name="android.permission.INTERNET" />
 *
 *
 *
 */



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
    }
    public void ir(View view){
        Intent i=new Intent(this,Web.class);
        i.putExtra("webAdress",et1.getText().toString());
        startActivity(i);

    }
}
