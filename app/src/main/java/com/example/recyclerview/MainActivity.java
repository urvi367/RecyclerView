package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<contacts> contactsList = new ArrayList<>();
    private  RecyclerView rv;
    private CustomAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=(RecyclerView) findViewById(R.id.rv);
        mAdapter = new CustomAdapter((contactsList),this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(mAdapter);

        data();
    }

    private  void data(){
        contacts con = new contacts("Dr Rishikesh V Behere, Psychiatrist, Manoshanti Pune", "078880 49087");
        contactsList.add(con);

        con = new contacts("Animo clinic", "097308 48099");
        contactsList.add(con);

        con = new contacts("Dr Swapnil Deshmukh MBBS, MD", "099232 91312");
        contactsList.add(con);

        con = new contacts("Dr Jaideep Patil", "091309 30300");
        contactsList.add(con);

        con = new contacts("Dr Dhananjay V. Ashturkar, Aastha Hospital", "080 3966 4779");
        contactsList.add(con);

        con = new contacts("Dr Rishikesh V Behere, Psychiatrist, Manoshanti Pune", "078880 49087");
        contactsList.add(con);

        con = new contacts("DR. AJIT NAIK's PSYCHIATRY CLINIC", "098679 45254");
        contactsList.add(con);

        con = new contacts("Mindtree psychiatry clinic", "070577 11633");
        contactsList.add(con);

        con = new contacts("The Beautiful Mind - Specialty Psychiatry Clinic", "099232 57565");
        contactsList.add(con);

        con = new contacts("Dr.Niket Kasar", "08071 265 611");
        contactsList.add(con);

        con = new contacts("The Beautiful Mind - Specialty Psychiatry Clinic", "099232 57565");
        contactsList.add(con);

        con = new contacts("Mansanjeevani Clinic", "086058 60882");
        contactsList.add(con);

        con = new contacts("Dr. Sanjay Watve", "020 2567 5972");
        contactsList.add(con);

        con = new contacts("Trimiti Clinic", "077220 44644");
        contactsList.add(con);

        con = new contacts("Dr Rohan Jahagirdar Psychiatrist, Pune", "08071 265 813");
        contactsList.add(con);

        mAdapter.notifyDataSetChanged();
        rv.setAdapter(mAdapter);
    }
}
