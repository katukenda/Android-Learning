package com.example.apitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.button.MaterialButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.NetworkInterface;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton checkBtn = (MaterialButton) findViewById(R.id.check);

        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnected())
                    Toast.makeText(getApplicationContext(), "Internet Is Available", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Internet Is Not Available", Toast.LENGTH_SHORT).show();
            }
        });



        TextView tv = (TextView) findViewById(R.id.hello);

        String url = "https://jsonplaceholder.typicode.com/todos/1";

       JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(url, null, new Response.Listener<JSONObject>() {
           @Override
           public void onResponse(JSONObject response) {
              // tv.setText(response.toString());
             try {
                 int userId = response.getInt("userId");
                 int id = response.getInt("id");
                 String title = response.getString("title");
                 boolean completed = response.getBoolean("completed");

                tv.setText(userId+"\n"+id+"\n"+title+"\n"+completed);

             } catch (JSONException e){
e.printStackTrace();
             }

           }
       }, new Response.ErrorListener() {
           @Override
           public void onErrorResponse(VolleyError error) {
               tv.setText("error");
           }
       });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);






    }

    boolean isConnected(){


        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if(networkInfo!=null){

            if(networkInfo.isConnected())
                return true;
            else
                return false;

        }
        else
            return false;
    }




}