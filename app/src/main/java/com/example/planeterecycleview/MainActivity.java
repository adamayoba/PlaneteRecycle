package com.example.planeterecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements DetecteurDeClicSurRecycler{

    private RecyclerView mRecyclerView;
    private MonRecycleViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private CoordinatorLayout mcoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MonRecycleViewAdapter(getDataSource());
        mRecyclerView.setAdapter(mAdapter);
        mcoordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        // RecyclerView.ItemDecoration itemDecoration =
        //       new DividerItemDecoration(this,R.drawable.divider);
        //mRecyclerView.addItemDecoration(itemDecoration);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAdapter.setDetecteurDeClicSurRecycler((DetecteurDeClicSurRecycler) this);
    }



    private ArrayList<Planetes> getDataSource() {
        ArrayList listePlanetes = new ArrayList<Planetes>();
        //ArrayList listePlanetes= new ArrayList();
        listePlanetes.add (new Planetes("Mercure" ,"1er Planete","4 878 km", "200 m/s" ,R.drawable.automne));
        listePlanetes.add (new Planetes("Vénus" ,"2nd Planete" ,"4 878 km", "200 m/s" ,R.drawable.automne));
        listePlanetes.add (new Planetes("Terre" ,"3rd Planete" ,"4 878 km", "200 m/s" ,R.drawable.automne));
        listePlanetes.add (new Planetes("Mars" ,"4th Planete" ,"4 878 km", "200 m/s" ,R.drawable.automne));
        listePlanetes.add (new Planetes("Jupiter" ,"5th Planete" ,"4 878 km", "200 m/s" ,R.drawable.automne));
        listePlanetes.add (new Planetes("Saturne" ,"6th Planete" ,"4 878 km", "200 m/s" ,R.drawable.automne));
        listePlanetes.add (new Planetes("Uranus" ,"7th Planete" ,"4 878 km", "200 m/s" ,R.drawable.automne));
        listePlanetes.add (new Planetes("Neptune" ,"8th Planete" ,"4 878 km", "200 m/s" ,R.drawable.automne));
        listePlanetes.add (new Planetes("Pluton" ,"9th Planete" ,"4 878 km", "200 m/s" ,R.drawable.automne));
        return listePlanetes;
    }

    @Override
    public void clicSurRecyclerItem(int position, View v) {
        Snackbar.make(mcoordinatorLayout, " Clic sur l'item " + position, Snackbar.LENGTH_LONG).show();
    }
}