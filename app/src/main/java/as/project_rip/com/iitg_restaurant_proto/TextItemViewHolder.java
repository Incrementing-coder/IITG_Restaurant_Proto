package as.project_rip.com.iitg_restaurant_proto;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 1405003 on 11-Jun-17.
 */

public class TextItemViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;


    public TextItemViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.list_item);
    }

    public void bind(String text) {
        textView.setText(text);
    }

}
