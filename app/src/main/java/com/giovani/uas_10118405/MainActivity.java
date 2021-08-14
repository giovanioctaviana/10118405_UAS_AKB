package com.giovani.uas_10118405;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    RecyclerView recyclerView;

    //10118405 Giovani Octaviana 14 agustus 2021 13.33

    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_home:
                    f = new FragmentHome();
                    break;
                case R.id.menu_profile:
                    f = new FragmentProfile();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,f).commit();
            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasTransientState(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyWisata[] myWisatas = new MyWisata[]{
                new MyWisata("Grafika Cikole", "Jalan Raya Tangkuban Perahu km 8 Desa Cikole, Kecamatan Lembang, Kabupaten Bandung Barat, Propinsi Jawa Barat", R.drawable.cikole),
                new MyWisata("Farm House", "Jl. Raya Lembang No.108, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391", R.drawable.farmhouse),
                new MyWisata("Dusun Bambu", "Jl. Kolonel Masturi No.KM, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551", R.drawable.dusunbambu),
                new MyWisata("Floating Market", "Jl. Grand Hotel No.33E, Jalur Kampung Leuit No.A1, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391", R.drawable.floatingmarket),
                new MyWisata("Curug Pelangi", "Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551", R.drawable.curugpelangi),
                new MyWisata("ChinaTown Bandung", "Jl. Kelenteng No.41, Ciroyom, Kec. Andir, Kota Bandung, Jawa Barat 40182", R.drawable.chinatownbandung),
                new MyWisata("The Lodge Maribaya", "Jalan Maribaya No. 149/252 RT. 03 / RW. 15 Babakan, Gentong, Cibodas, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391", R.drawable.lodgemaribaya),
                new MyWisata("Trans Studio Bandung", "Jl. Gatot Subroto No.289, Cibangkong, Kec. Batununggal, Kota Bandung, Jawa Barat 40273", R.drawable.transstudiobandung),
                new MyWisata("Lembang Wonderland", "Jl. Raya Lembang No.177, Jayagiri, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391", R.drawable.lembangwonderland),
                new MyWisata("Dago Dream Park", "Jl. Dago Giri Km. 2.2 Mekarwangi, Pagerwangi, Lembang, West Bandung Regency, West Java 40135", R.drawable.dagodreampark),
        };

        MyWisataAdapter myWisataAdapter = new MyWisataAdapter(myWisatas,MainActivity.this);
        recyclerView.setAdapter(myWisataAdapter);

        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);


    }

}