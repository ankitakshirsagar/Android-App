package receiptify.ankita.com.homepage;

/**
 * Created by ankita on 15/06/2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


//Our class extending fragment
public class highlights extends Fragment {


    ListView listViewother;
    ArrayAdapter<String> adapterother;
    String[] ctother;
    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {





            View viewother = inflater.inflate(R.layout.tab3,container,false);

            listViewother = (ListView) viewother.findViewById(R.id.listViewother);
            ctother = getResources().getStringArray(R.array.highlightcategories);
            adapterother = new ArrayAdapter<String>(getActivity(),R.layout.list_viewother,R.id.row_itemother,ctother);
            listViewother.setAdapter(adapterother);

        listViewother.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void getSupportFragmentManager() {
                        return ;
                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        //Toast.makeText(getActivity().getApplicationContext(), String.valueOf(position), Toast.LENGTH_SHORT).show();
                        Toast.makeText(getActivity().getApplicationContext(), "    Statistics    ", Toast.LENGTH_SHORT).show();
                       /* FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        Fragment subcategory = new Fragment();//the fragment you want to show
                        Bundle bundle = null;
                        subcategory.setArguments(bundle);
                        fragmentTransaction
                                .replace(R.id.pager, subcategory);//R.id.content_frame is the layout you want to replace
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        /*Fragment fragment = new Fragment();
                        android.support.v4.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                        ft.replace(R.id.pager, fragment);
                        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                        ft.commit();*/
                    }
                });


        return viewother;
    }
}