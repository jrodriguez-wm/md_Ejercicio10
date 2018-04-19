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

public class SixFragment extends android.support.v4.app.Fragment {

    View view;

    public SixFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.item_6,container,false);
        return view;
    }
}
