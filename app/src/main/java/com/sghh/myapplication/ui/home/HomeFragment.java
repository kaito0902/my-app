package com.sghh.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sghh.myapplication.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding mBinding;
    private HomeViewModel mViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        mBinding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = mBinding.getRoot();
        mBinding.setViewModel(mViewModel);

        return root;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }
}