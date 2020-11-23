package com.ahmedzenhom.mysampleapp.ui.host;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;
import androidx.viewbinding.ViewBinding;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import com.ahmedzenhom.mysampleapp.R;
import com.ahmedzenhom.mysampleapp.base.BaseActivity;
import com.ahmedzenhom.mysampleapp.databinding.ActivityHostBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import static androidx.navigation.ui.NavigationUI.setupWithNavController;

public class HostActivity extends BaseActivity<ActivityHostBinding> {

    public static Intent getActivityIntent(Context context){
        Intent intent = new Intent(context, HostActivity.class);
        return intent;
    }

    private HostViewModel viewModel;
    private NavController navController;

    @Override
    protected ActivityHostBinding getViewBinding() {
        return ActivityHostBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void inject() {
        daggerComponent.inject(this);
        viewModel = new ViewModelProvider(this, viewModelFactory).get(HostViewModel.class);
    }

    @Override
    protected void onViewCreated() {
        setupViews();
    }

    private void setupViews() {
        setTitle("");
        getSupportActionBar().setElevation(0);
        enableDoubleBackExit();

        //prevent recreate on re-selecting
        viewBinding.bottomNav.setOnNavigationItemReselectedListener(item -> System.out.println());

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        setupWithNavController(viewBinding.bottomNav, navController);

        navController.addOnDestinationChangedListener((controller, destination, arguments) -> setTitle(destination));

        NavOptions navOptions = new NavOptions.Builder().setPopUpTo(R.id.navigation_host_graph, true).build();

        viewBinding.bottomNav.setOnNavigationItemSelectedListener(item -> {
            navController.navigate(item.getItemId(), null, navOptions);
            return true;
        });
    }

    private void setTitle(NavDestination destination) {
        viewBinding.tvTitle.setText(destination.getLabel().toString());
    }

}