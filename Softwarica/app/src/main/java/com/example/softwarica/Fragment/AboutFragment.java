package com.example.softwarica.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.example.softwarica.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {
    WebView web;


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_about, container, false);

        web=v.findViewById(R.id.website);
        web.loadUrl("https://softwarica.edu.np/");
        web.setWebViewClient(new WebViewClient());
        return v;
    }

}
