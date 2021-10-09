package com.example.hypercall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.util.Log;
import android.widget.Toast;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Method;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText telefone;
    Button btnLigar;

    boolean comecar = true;
    Calendar right = Calendar.getInstance();
    int currentMinute = right.get(Calendar.MINUTE);
    int currentSecond = right.get(Calendar.SECOND);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("myTag", "Programa começou");

        telefone = (EditText) findViewById(R.id.editTextPhone);
        btnLigar = (Button) findViewById(R.id.btnLigar);


        btnLigar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                Log.d("myTag", "Botao foi precionado");

                chamada();

                /*
                String numero = telefone.getText().toString();
                Uri uri = Uri.parse("tel:" + numero);

                Intent intent = new Intent (Intent.ACTION_CALL, uri);

                if (ActivityCompat.checkSelfPermission(MainActivity.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    return;
                }
                else {
                    startActivity(intent);
                }
                */



                //automatizar a função de desligar


//                String numero = telefone.getText().toString();
//                Uri uri = Uri.parse("tel:" + numero);
//
//                Intent intent = new Intent (Intent.ACTION_CALL, uri);
//
//                if (ActivityCompat.checkSelfPermission(MainActivity.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
//                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
//                    return;
//                }
//                else {
//                    new Thread( new Runnable(){
//                        @Override
//                        public void run(){
//                            Looper.prepare();
//
//                            currentMinute = right.get(Calendar.MINUTE);
//                            currentSecond = right.get(Calendar.SECOND);
//
//                            if(currentMinute == 49){
//                                Log.d("myTag", "looooooooooooooooop");
//                                comecar = true;
//                                if (comecar){
//                                    startActivity(intent);
//                                    comecar = false;
//                                }
//                            }
//
//                        }
//                    }).start();
//                }

            }
        });

    }


    public void chamada (){
        String numero = telefone.getText().toString();
        Uri uri = Uri.parse("tel:" + numero);

        Intent intent = new Intent (Intent.ACTION_CALL, uri);

        if (ActivityCompat.checkSelfPermission(MainActivity.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
            return;
        }
        else {
            startActivity(intent);
        }
    }
}


















/* //empty
package com.example.hypercall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/