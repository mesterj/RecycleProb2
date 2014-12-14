package proba.joco.hu.recycleprob2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    String [] myDataset = {"Budapest","Debrecen","Miskolc","Szeged","Pécs","New York","Berlin",
            "Washington","Paris","London","Warsawa","Dublin","Amsterdam","Hajdúsámson","Glasgow","Létavértes","Bucharest","Belgrad","Varna","Moskva","St. Petergrad",
            "Sao Paolo","Cape Town","Melbourne","Delhi","Bombay","Tokio","Beijing","Seoul","Seattle","Denver","Indianapolis","Boston","Atlanta","Los Angeles","Las Vegas",
            "Memphis","Houston"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.myrecview);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);



        mRecyclerView.setAdapter(mAdapter);
    }
}