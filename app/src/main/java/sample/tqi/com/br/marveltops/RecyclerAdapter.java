package sample.tqi.com.br.marveltops;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import sample.tqi.com.br.marveltops.main.Comic;

/**
 * Created by katia.goncalves on 18/12/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<Comic>comic;

    public RecyclerAdapter(List<Comic>comic){
        this.comic = comic;

    }

    @Override
    public RecyclerViewHolder onCreateViewHolder( ViewGroup viewGroup, int viewType ) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate( R.layout.activity_main,viewGroup,false );

        return new RecyclerViewHolder( itemView );
    }

    @Override
    public void onBindViewHolder( RecyclerViewHolder holder, int position ) {


    }



    @Override
    public int getItemCount() {

        return  comic.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
            ImageView image;
            TextView title;

        public RecyclerViewHolder( View itemView ) {
            super( itemView );
            image =(ImageView) itemView.findViewById( R.id.iv_banner );
            title =(TextView) itemView.findViewById(R.id.iv_title );
        }
    }
}
