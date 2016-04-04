package com.bulbulhossen.maoshishu.Main_Activity_Gallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.bulbulhossen.maoshishu.Adapter_Gallery.ListView_Adapter;
import com.bulbulhossen.maoshishu.R;


public class HomeFragment extends Fragment {
    Intent i;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment, container, false);


        String[] str = getActivity().getResources().getStringArray(R.array.shamsur_Kobita_listName);


         int image[] = {
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage,
                 R.drawable.babyimage};


        ListView lv = (ListView) rootView.findViewById(R.id.shamsur_listview);

        final ListView_Adapter ad = (new ListView_Adapter(getActivity(), str, image));
        lv.setAdapter(ad);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "" + ad.getItem(position), Toast.LENGTH_SHORT).show();


                switch (position) {
                    case 0:

                        //Get fragment code
                        Fragment fragment_1 = new First_Fragment();
                        FragmentManager fragmentManager_1 = getFragmentManager();
                        FragmentTransaction fragmentTransaction_1 = fragmentManager_1.beginTransaction();
                        fragmentTransaction_1.replace(R.id.container_body, fragment_1);
                        fragmentTransaction_1.addToBackStack(null);
                        fragmentTransaction_1.commit();
                        break;

                    case 1:
                        //Get fragment code
                        Fragment fragment_2 = new First_Fragment();

                        FragmentManager fragmentManager_2 = getFragmentManager();
                        FragmentTransaction fragmentTransaction_2 = fragmentManager_2.beginTransaction();
                        fragmentTransaction_2.replace(R.id.container_body, fragment_2);
                        fragmentTransaction_2.addToBackStack(null);
                        fragmentTransaction_2.commit();
                        break;
                    case 2:
                        //Get fragment code
                        Fragment fragment_3 = new First_Fragment();

                        FragmentManager fragmentManager_3 = getFragmentManager();
                        FragmentTransaction fragmentTransaction_3 = fragmentManager_3.beginTransaction();
                        fragmentTransaction_3.replace(R.id.container_body, fragment_3);
                        fragmentTransaction_3.addToBackStack(null);
                        fragmentTransaction_3.commit();
                        break;

                    case 3:
                        //Get fragment code
                        Fragment fragment_4 = new First_Fragment();

                        FragmentManager fragmentManager_4 = getFragmentManager();
                        FragmentTransaction fragmentTransaction_4 = fragmentManager_4.beginTransaction();
                        fragmentTransaction_4.replace(R.id.container_body, fragment_4);
                        fragmentTransaction_4.addToBackStack(null);
                        fragmentTransaction_4.commit();
                        break;
                    case 4:
                        //Get fragment code
                        Fragment fragment_5 = new First_Fragment();

                        FragmentManager fragmentManager_5 = getFragmentManager();
                        FragmentTransaction fragmentTransaction_5 = fragmentManager_5.beginTransaction();
                        fragmentTransaction_5.replace(R.id.container_body, fragment_5);
                        fragmentTransaction_5.addToBackStack(null);
                        fragmentTransaction_5.commit();
                        break;
                    case 5:
                        //Get fragment code
                        Fragment fragment_6 = new First_Fragment();

                        FragmentManager fragmentManager_6 = getFragmentManager();
                        FragmentTransaction fragmentTransaction_6 = fragmentManager_6.beginTransaction();
                        fragmentTransaction_6.replace(R.id.container_body, fragment_6);
                        fragmentTransaction_6.addToBackStack(null);
                        fragmentTransaction_6.commit();
                        break;
                }



            }
        });


        return rootView;
    }
    @Override
    public void onDetach() {
        super.onDetach();
    }

}