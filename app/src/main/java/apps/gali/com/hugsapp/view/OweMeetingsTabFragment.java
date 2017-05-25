package apps.gali.com.hugsapp.view;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apps.gali.com.hugsapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OweMeetingsTabFragment extends Fragment {


    public OweMeetingsTabFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_owe_meetings_tab, container, false);
    }

}
