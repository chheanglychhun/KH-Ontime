package kh.edu.rupp.ite.onlineshop.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kh.edu.rupp.ite.onlineshop.databinding.FragmentHomeBinding;
import kh.edu.rupp.ite.onlineshop.databinding.FragmentInboxBinding;

public class InboxFragment extends Fragment {

    private FragmentInboxBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentInboxBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }
}
