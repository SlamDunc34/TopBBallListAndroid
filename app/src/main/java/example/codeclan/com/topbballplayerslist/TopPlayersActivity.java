package example.codeclan.com.topbballplayerslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopPlayersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.players_list);

        TopPlayers topPlayers = new TopPlayers();
        ArrayList<Players> list = topPlayers.getList();

        TopPlayersAdapter playersAdapter = new TopPlayersAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(playersAdapter);
    }

    public void getPlayers(View listItem){
        Players players = (Players) listItem.getTag();
        Log.d("Player name: ", players.getName());
    }
}

