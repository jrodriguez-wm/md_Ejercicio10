package mx.com.webmaps.md_ejercicio10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jorge on 19/4/2018.
 */

public class OneFragment extends Fragment {

    View view;

    public OneFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.item_1,container,false);

        return view;

    }
}
