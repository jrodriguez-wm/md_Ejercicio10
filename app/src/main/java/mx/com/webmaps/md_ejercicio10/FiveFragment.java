package mx.com.webmaps.md_ejercicio10;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jorge on 19/4/2018.
 */

public class FiveFragment extends android.support.v4.app.Fragment {

    View view;

    public FiveFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.item_5,container,false);
        return  view;
    }
}
