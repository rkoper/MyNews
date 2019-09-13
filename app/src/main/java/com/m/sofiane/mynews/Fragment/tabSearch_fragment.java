package com.m.sofiane.mynews.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.m.sofiane.mynews.DataAdapterResult;
import com.m.sofiane.mynews.Modele.ModeleSearch.SearchResult;
import com.m.sofiane.mynews.NYTimesService;
import com.m.sofiane.mynews.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * created by Sofiane M. 2019-09-05
 */
public class tabSearch_fragment extends Fragment   {
    private RecyclerView rvFragment;
    private SearchResult rvdata;
    public DataAdapterResult rvAdapter ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater mInflater, @Nullable ViewGroup mContainer, @Nullable Bundle savedInstanceState) {
        View view = mInflater.inflate(R.layout.tabsearch_fragment, mContainer, false);




        this.initUI4(view);
        return view;

    }

    private void  initUI4(View view) {

        rvFragment = view.findViewById(R.id.RecyclerViewResult);
        rvFragment.setAdapter(rvAdapter);
        rvFragment.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvFragment.setHasFixedSize(true);
        loadJSONResult();

    }

    private void loadJSONResult(){
        Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl("https://api.nytimes.com/svc/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final NYTimesService request = retrofit2.create(NYTimesService.class);
        Call<SearchResult> call2 = request.getJSON4(
                "q",
                "fq",
                "begin_date",
                "end_date"
                );
        call2.enqueue(new Callback<SearchResult>() {
            public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {
                SearchResult jsonResponse2 = response.body();
                rvdata= jsonResponse2;
                rvAdapter = new DataAdapterResult(rvdata, getContext());
                rvFragment.setAdapter(rvAdapter);
            }

            @Override
            public void onFailure(Call<SearchResult> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
    }


}