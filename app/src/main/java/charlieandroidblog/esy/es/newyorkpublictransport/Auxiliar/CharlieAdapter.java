package charlieandroidblog.esy.es.newyorkpublictransport.Auxiliar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import charlieandroidblog.esy.es.newyorkpublictransport.R;

/**
 * Created by charlito on 6/25/2016.
 */
public class CharlieAdapter extends BaseAdapter {

    ArrayList<BRenglon> al;
    Context context;


    public CharlieAdapter(Context context, ArrayList<BRenglon> al) {
        this.context = context;
        this.al = al;
    }

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int position) {
        return al.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v==null){
            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = mInflater.inflate(R.layout.renglon,null);
        }

        TextView tvNombre = (TextView) v.findViewById(R.id.tv_nombre);
        ImageView ivIcono = (ImageView) v.findViewById(R.id.imageView);

        tvNombre.setText(al.get(position).getNombre());
        ivIcono.setImageResource(al.get(position).getRefIcon());

        return v;
    }

}
