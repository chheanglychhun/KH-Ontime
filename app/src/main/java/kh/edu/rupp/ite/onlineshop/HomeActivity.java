package kh.edu.rupp.ite.onlineshop;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import kh.edu.rupp.ite.onlineshop.Ui.HomeFragment;
import kh.edu.rupp.ite.onlineshop.Ui.InboxFragment;
import kh.edu.rupp.ite.onlineshop.Ui.MarketFragment;
import kh.edu.rupp.ite.onlineshop.Ui.MenuFragment;
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

            if (item.getItemId() == R.id.menuHome){
                showFragment(new HomeFragment());
            }
            if (item.getItemId() == R.id.menuMarket){
                showFragment(new MarketFragment());
            }
            if (item.getItemId() == R.id.menuInbox){
                showFragment(new InboxFragment());
            }
            if (item.getItemId() == R.id.menuMune){
                showFragment(new MenuFragment());
            }
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
