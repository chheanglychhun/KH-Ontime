package kh.edu.rupp.ite.onlineshop.Ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kh.edu.rupp.ite.onlineshop.databinding.FragmentMarketBinding;
import kh.edu.rupp.ite.onlineshop.databinding.FragmentMenuBinding;

public class MarketFragment extends Fragment {

    private FragmentMarketBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentMarketBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }
}
