package example.codeclan.com.topbballplayerslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopPlayersAdapter extends ArrayAdapter<Players> {

    public TopPlayersAdapter(Context context, ArrayList<Players> players){
        super(context, 0, players);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.players_item, parent, false);
        }

        Players currentPlayers = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentPlayers.getRanking().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentPlayers.getName().toString());

        TextView team = (TextView) listItemView.findViewById(R.id.team);
        team.setText(currentPlayers.getTeam().toString());

        listItemView.setTag(currentPlayers);

        return listItemView;

    }
}

