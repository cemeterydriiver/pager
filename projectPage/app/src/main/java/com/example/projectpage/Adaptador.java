package com.example.projectpage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Adaptador extends FragmentStateAdapter {
    public Adaptador(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new Cinnamaroll();
            case 2:
                return new Kuromi();
            case 3:
                return new Time();
        }
        return new Melody();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
