package com.example.listdrama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.listdrama.model.Action;
import com.example.listdrama.model.Drama;
import com.example.listdrama.model.Fantasi;
import com.example.listdrama.model.Horor;
import com.example.listdrama.model.ListData;
import com.example.listdrama.model.Populer;
import com.example.listdrama.model.Romace;
import com.example.listdrama.retrofit.ApiInterface;
import com.example.listdrama.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;

    RecyclerView populerRecyclerView;
    RecyclerView romanceRecyclerView;
    RecyclerView dramaRecyclerView;
    RecyclerView actionRecyclerView;
    RecyclerView fantasiRecyclerView;
    RecyclerView hororRecyclerView;

    PopulerAdapter populerAdapter;
    RomanceAdapter romanceAdapter;
    DramaAdapter dramaAdapter;
    ActionAdapter actionAdapter;
    FantasiAdapter fantasiAdapter;
    HororAdapter hororAdapter;

    AppSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        settings = new AppSettings(this);
        applyTheme(settings.getTheme());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
        Call<List<ListData>> call = apiInterface.getAllData();
        call.enqueue(new Callback<List<ListData>>() {
            @Override
            public void onResponse(Call<List<ListData>> call, Response<List<ListData>> response) {

                List<ListData> ListDataList = response.body();

                getPopulerData(ListDataList.get(0).getPopuler());
                getRomanceData(ListDataList.get(0).getRomace());
                getDramaData(ListDataList.get(0).getDrama());
                getActionData(ListDataList.get(0).getAction());
                getFantasiData(ListDataList.get(0).getFantasi());
                getHororData(ListDataList.get(0).getHoror());

            }

            @Override
            public void onFailure(Call<List<ListData>> call, Throwable t) {

                Toast.makeText(MainActivity.this,"Server tidak merespon silahkan cek internet anda.", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    private void applyTheme(int theme) {
        switch (theme){
            case  AppSettings.THEME_LIGHT: setTheme(R.style.AppTheme);
                break;
            case  AppSettings.THEME_DARK: setTheme(R.style.DarkTheme);
                break;
            case  AppSettings.THEME_DARK_AMOLED: setTheme(R.style.DarkTheme);
                break;
            default:
                setTheme(R.style.AppTheme);
        }
    }

    private void getPopulerData(List<Populer> populerList){

        populerRecyclerView = findViewById(R.id.populer_racycler);
        populerAdapter = new PopulerAdapter(this, populerList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        populerRecyclerView.setLayoutManager(layoutManager);
        populerRecyclerView.setAdapter(populerAdapter);


    }

    private void getRomanceData(List<Romace> romanceList){

        romanceRecyclerView = findViewById(R.id.rv_romance);
        romanceAdapter = new RomanceAdapter(this, romanceList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        romanceRecyclerView.setLayoutManager(layoutManager);
        romanceRecyclerView.setAdapter(romanceAdapter);


    }

    private void getDramaData(List<Drama> dramaList){

        dramaRecyclerView = findViewById(R.id.rv_drama);
        dramaAdapter = new DramaAdapter(this, dramaList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        dramaRecyclerView.setLayoutManager(layoutManager);
        dramaRecyclerView.setAdapter(dramaAdapter);


    }

    private void getActionData(List<Action> actionList){

        actionRecyclerView = findViewById(R.id.rv_action);
        actionAdapter = new ActionAdapter(this, actionList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        actionRecyclerView.setLayoutManager(layoutManager);
        actionRecyclerView.setAdapter(actionAdapter);


    }

    private void getFantasiData(List<Fantasi> fantasiList){

        fantasiRecyclerView = findViewById(R.id.rv_fantasi);
        fantasiAdapter = new FantasiAdapter(this, fantasiList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        fantasiRecyclerView.setLayoutManager(layoutManager);
        fantasiRecyclerView.setAdapter(fantasiAdapter);


    }

    private void getHororData(List<Horor> hororList){

        hororRecyclerView = findViewById(R.id.rv_horor);
        hororAdapter = new HororAdapter(this, hororList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        hororRecyclerView.setLayoutManager(layoutManager);
        hororRecyclerView.setAdapter(hororAdapter);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new SettingsFragment())
                        .addToBackStack(null)
                        .commit();
                return true;
            case R.id.note:
                Intent i = new Intent(this, NoteActivity.class);
                startActivity(i);
                return true;
            default:
                return true;
        }
    }
}