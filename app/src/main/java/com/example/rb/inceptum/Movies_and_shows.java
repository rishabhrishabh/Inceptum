package com.example.rb.inceptum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Movies_and_shows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_and_shows);



    }
    private void parseJSON()
    {
        String url = "http://pascolan.com/users.php?page=0";

        StringRequest request = new StringRequest(Request.Method.GET, url,new Response.Listener<String>(){
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject obj=new JSONObject(response);
                    Log.d("hello", obj.toString());
                    JSONArray jsonArray = obj.getJSONArray("SampleUsers");

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject hit = jsonArray.getJSONObject(i);
                        Log.d("hello", hit.toString());
                        String username = hit.getString("name");
                        Log.d("hello", username);
                        String imageUrl = hit.getString("image");
                        Log.d("hello", imageUrl);
                        int verify = hit.getInt("verified");
                        int priority=hit.getInt("priority");

                        mExampleList.add(new ExampleItem(imageUrl, username, verify,priority));
                        Collections.sort(mExampleList);

                    }
                    Log.d("rishabh", String.valueOf(mExampleList.size()));
                    //Toast.makeText(MainActivity.this,""+mExampleList.size(),Toast.LENGTH_SHORT).show();
                    mExampleAdapter = new ExampleAdapter(MainActivity.this, mExampleList);
                    mRecyclerView.setAdapter(mExampleAdapter);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }
        });

        mRequestQueue.add(request);
    }


    private void parseJSON1()
    {
        String url = "http://pascolan.com/users.php?page=1";

        StringRequest request = new StringRequest(Request.Method.GET, url,new Response.Listener<String>(){
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject obj=new JSONObject(response);
                    Log.d("hello", obj.toString());
                    JSONArray jsonArray = obj.getJSONArray("SampleUsers");

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject hit = jsonArray.getJSONObject(i);
                        Log.d("hello", hit.toString());
                        String username = hit.getString("name");
                        Log.d("hello", username);
                        String imageUrl = hit.getString("image");
                        Log.d("hello", imageUrl);
                        int verify = hit.getInt("verified");
                        int priority=hit.getInt("priority");

                        mExampleList.add(new ExampleItem(imageUrl, username, verify,priority));
                        Collections.sort(mExampleList);

                    }
                    Log.d("rishabh", String.valueOf(mExampleList.size()));
                    //Toast.makeText(MainActivity.this,""+mExampleList.size(),Toast.LENGTH_SHORT).show();
                    mExampleAdapter = new ExampleAdapter(MainActivity.this, mExampleList);
                    mRecyclerView.setAdapter(mExampleAdapter);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }
        });

        mRequestQueue.add(request);
    }
}
