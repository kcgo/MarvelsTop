package sample.tqi.com.br.marveltops.main;

import android.media.Image;
import android.widget.ImageView;

import com.google.gson.annotations.SerializedName;

/**
 * Created by katia.goncalves on 27/12/2017.
 */

public class Comic {


    @SerializedName( " title" )
    private String title;

    @SerializedName( " image" )
    private Image  image;

    public String getTitle()
    {
        return title;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }


    public Image getImage() {
        return image;
    }

    public void setImage( Image image ) {
        this.image = image;
    }



}
