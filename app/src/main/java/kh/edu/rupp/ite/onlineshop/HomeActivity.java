package kh.edu.rupp.ite.onlineshop;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import kh.edu.rupp.ite.onlineshop.databinding.ActivityMainBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Setup Listeners
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {


            return true;
        });

    }

    private void showFragment(Fragment fragment) {
        // FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // FragmentTransaction

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace homeFragment in lytFragment
        fragmentTransaction.replace(R.id.lytFragment, fragment);

        // Commit transaction
        fragmentTransaction.commit();

    }


}
