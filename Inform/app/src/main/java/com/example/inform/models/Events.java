package com.example.inform.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Events {
    public long id;

    public String body;

    public String createdAt;
    public String date;
    public String address;
    public String link;

    public Events() {}

    public static Events fromJson(JSONObject jsonObject) throws JSONException {
        Events events = new Events();
        events.body = jsonObject.getString("description");
        events.createdAt = jsonObject.getString("created_at");
        events.id = jsonObject.getLong("id");
        events.date = jsonObject.getString("date");
        events.address = jsonObject.getString("address");
        events.link = jsonObject.getString("link");
        return events;
    }

    public static List<Events> fromJsonArray(JSONArray jsonArray) throws JSONException {
        List<Events> tweets = new ArrayList<>();
        for(int i =0; i<jsonArray.length(); i++)
        {
            tweets.add(fromJson(jsonArray.getJSONObject(i)));
        }
        return tweets;
    }
}
