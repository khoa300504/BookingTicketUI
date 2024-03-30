package com.example.bookingticket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.bookingticket.databinding.ActivityMainBinding;
import com.example.bookingticket.databinding.RegisterBinding;

public class MainActivity extends AppCompatActivity {
    RegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        binding = RegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        replaceFragment(new HomeFragment());

//        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
//            int itemId = item.getItemId();
//            if (itemId == R.id.home) {
//                replaceFragment(new HomeFragment());
//            } else if (itemId == R.id.fastfood) {
//                replaceFragment(new FastFoodFragment());
//            } else if (itemId == R.id.person) {
//                replaceFragment(new PersonFragment());
//            }
//            return true;
//        });
//    }
//    private void replaceFragment(Fragment fragment)
//    {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.drawerLayout, fragment);
//        fragmentTransaction.commit();
//
//    }
    }
}