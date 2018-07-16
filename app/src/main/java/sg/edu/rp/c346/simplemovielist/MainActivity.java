package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<String> alMovieList;
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find Listview UI Element to java variable
        lvMovie = findViewById(R.id.listViewMovie);


        //Intialize theArrayList
        alMovieList = new ArrayList<>();

        //Add data into ArrayList
        alMovieList.add("Avengers: Infinity War Release Date: 2018.04" );
        alMovieList.add("Justice League Release Date: 2017.11");

        //Intialize the ArrayAdapter and bind it to the ArrayList
        aaMovie = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alMovieList);

        //Bind the ListView to the ArrayAdapter
        lvMovie.setAdapter(aaMovie);

    }
}
