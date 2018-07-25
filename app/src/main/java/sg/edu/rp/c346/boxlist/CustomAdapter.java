package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<String> colorList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<String> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        colorList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);
        ImageView ivColor = rowView.findViewById(R.id.imageView);

        String currentColor = colorList.get(position);
        if (currentColor.equalsIgnoreCase("blue")){
            ivColor.setImageResource(R.drawable.blue_box);
        }
        else if (currentColor.equalsIgnoreCase("brown")){
            ivColor.setImageResource(R.drawable.brown_box);
        }
        else if (currentColor.equalsIgnoreCase("orange")){
            ivColor.setImageResource(R.drawable.orange_box);
        }
        // Return the View corresponding to the data at the specified position.
        return rowView;

    }
}
